package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public User getUserData(String username) {
        try {
            String sql = "SELECT * FROM User WHERE username=?";
            return this.jdbcTemplate.queryForObject(sql,
                    new Object[]{username}, new UserRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException(username);
        }
    }

    @Transactional(readOnly = true)
    public User userLogin(String username, String password) {
        try {
            String sql = "SELECT username, " +
                    "firstname, " +
                    "lastname, " +
                    "gender, " +
                    "birth_date, " +
                    "email, " +
                    "noti_status " +
                    "FROM User WHERE username=? and password=?";
            return this.jdbcTemplate.queryForObject(sql,
                    new Object[]{username, password}, new UserRowMapper());
        }catch (Exception exception) {
            throw new UserLoginFailedException();
        }
    }

    @Transactional
    public String userRegister(String username, String password,
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
            // CHANGE RETURN TO VOID AND MAKE PAGE REDIRECTION
            return "Register Successful";
        }catch (Exception exception){
            throw new UserRegisterFailedException();
        }
    }

    @Transactional
    public String userEditDetails(String username,
                                String firstname, String lastname,
                                String gender, String birth_date,
                                String email, String noti_status) {
        String sql = "UPDATE User SET firstname=?, lastname=?, gender=?, birth_date=?, email=?, noti_status=? WHERE username = ?";
        this.jdbcTemplate.update(sql,
                firstname, lastname, gender, birth_date, email, noti_status, username);
        return "Edited";
    }

    @Transactional
    public String userChangePassword(String username, String old_password, String new_password, String confirm_new_password){
        try {
            String sql = "UPDATE User SET password=? WHERE username=? and password=?";
            if (new_password.equals(confirm_new_password))
                this.jdbcTemplate.update(sql, new_password, username, old_password);
            return "Password Changed";
        } catch (Exception e){
            throw new UserRegisterFailedException();
        }
    }
}