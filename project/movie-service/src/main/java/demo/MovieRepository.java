package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Repository
@EnableAutoConfiguration
public class MovieRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public Movie findById(Long id) {
        try {
            return this.jdbcTemplate.queryForObject("SELECT * FROM Movie WHERE movie_id=?", new Object[]{id}, new MovieRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException(id);
        }
    }

    @Transactional(readOnly = true)
    public List<Movie> findAll() {

        List<Movie> movieList = this.jdbcTemplate.query("SELECT * FROM Movie WHERE movie_status='onshow' ORDER BY movie_release_date DESC", new MovieRowMapper());

        return movieList;
    }
//
//    @Transactional
//    public void save(Movie movie) {
//        String sql = "INSERT INTO USERS(id, firstname, lastname) VALUES (?,?,?)";
//        this.jdbcTemplate.update(sql, movie.getId(), movie.getFirstname(), movie.getLastname());
//    }
//
//    public void delete(Long id) {
//        String sql = "DELETE FROM USERS WHERE id=?";
//        this.jdbcTemplate.update(sql, id);
//    }
}
