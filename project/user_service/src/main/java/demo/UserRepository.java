package demo;

import demo.adapter.Movie;
import demo.adapter.MovieAdapter;
import demo.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private MovieAdapter movieAdapter;

    public UserRepository(JdbcTemplate jdbcTemplate, MovieAdapter movieAdapter) {
        this.jdbcTemplate = jdbcTemplate;
        this.movieAdapter = movieAdapter;
    }

    @Transactional(readOnly = true)
    public User getUserData(String username) {
        try {
            String sql = "SELECT username, " +
                    "firstname, " +
                    "lastname, " +
                    "gender, " +
                    "birth_date, " +
                    "email, " +
                    "noti_status " +
                    "FROM User WHERE username=?";
            return this.jdbcTemplate.queryForObject(sql,
                    new Object[]{username}, new UserRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException(username);
        }
    }

    @Transactional(readOnly = true)
    public Token userLogin(String username, String password) {
        try {
            String sql = "SELECT username, " +
                    "firstname, " +
                    "lastname, " +
                    "gender, " +
                    "birth_date, " +
                    "email, " +
                    "noti_status " +
                    "FROM User WHERE username=? and password=?";
            User user = this.jdbcTemplate.queryForObject(sql,
                    new Object[]{username, password}, new UserRowMapper());
            return UserAuthentication.authorize(user);
        }catch (Exception exception) {
            throw new UserLoginFailedException();
        }
    }

    @Transactional
    public void userRegister(String username, String password,
                             String firstname, String lastname,
                             String gender, String birth_date,
                             String email, String noti_status) {
        try {
            String sql = "INSERT INTO User(username, password, " +
                    "firstname, lastname, " +
                    "gender, birth_date, " +
                    "email, noti_status) " +
                    "VALUES(?,?,?,?,?,?,?,?);";
            this.jdbcTemplate.update(sql,
                    username, password,
                            firstname, lastname,
                            gender, birth_date,
                            email, noti_status);
        }catch (Exception exception){
            throw new UserRegisterFailedException();
        }
    }

    @Transactional
    public void userEditDetails(String username,
                                String firstname, String lastname,
                                String gender, String birth_date,
                                String email, String noti_status) {
        try {
            String sql = "UPDATE User SET firstname=?, lastname=?, gender=?, birth_date=?, email=?, noti_status=? WHERE username = ?";
            this.jdbcTemplate.update(sql,
                    firstname, lastname, gender, birth_date, email, noti_status, username);
        } catch (Exception e) {
            throw new UserUpdateFailedException();
        }
    }

    @Transactional
    public void userChangePassword(String username, String old_password, String new_password){
        try {
            String sql = "UPDATE User SET password=? WHERE username=? and password=?";
                this.jdbcTemplate.update(sql, new_password, username, old_password);
        } catch (Exception e){
            throw new UserUpdateFailedException();
        }
    }

    @Transactional
    public void likeMovie (String username, int movie_id){
        try {
            String sql = "INSERT INTO Favourite_list(username, movie_id) VALUES(?, ?)";
            this.jdbcTemplate.update(sql, username, movie_id);
        } catch (Exception e) {
            throw new UserUpdateFailedException();
        }
    }

    @Transactional
    public void unlikeMovie (String username, int movie_id){
        try {
            String sql = "DELETE FROM Favourite_list WHERE username=? AND movie_id=?";
            this.jdbcTemplate.update(sql, username, movie_id);
        } catch (Exception e) {
            throw new UserUpdateFailedException();
        }
    }


    public List<Movie> getUserLikes(String username){
        try {
            String sql = "SELECT movie_id FROM Favourite_list WHERE username=?";
            List<Integer> results = this.jdbcTemplate.queryForList(sql, new Object[]{username}, Integer.class);
            if(results.isEmpty()) {
                return null;
            }

            List<Movie> movieList = null;

            for (Integer movie_id : results){
                movieList.add(movieAdapter.getMovieById(movie_id));
            }
            return movieList;
        } catch (Exception e) {
            throw new UserNotFoundException(username);
        }
    }

    public void logout(String token){
        UserAuthentication.deleteSession(token);
    }
}