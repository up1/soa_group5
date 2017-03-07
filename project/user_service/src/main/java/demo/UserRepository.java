package demo; /**
 * Created by Administrator on 6/3/2560.
 */
import demo.User;
import demo.UserLoginFailedException;
import demo.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.sql.Types;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
//    public User findById(Long id) {
//        try {
//            String sql = "SELECT * FROM User WHERE user_id=?";
//            return this.jdbcTemplate.queryForObject(sql,
//                    new Object[]{id}, new UserRowMapper());
//        }catch (Exception exception) {
//            throw new UserNotFoundException(id);
//        }
//    }

    public User userLogin(String username, String password){
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

//    public UserRegisterRespond userRegister(String username, String password,
//                             String firstname, String lastname,
//                             String gender, String birth_date,
//                             String email, String noti_status){
//        try {
//            String sql = "INSERT INTO User(username, password, " +
//                    "firstname, lastname, " +
//                    "gender, birth_date, " +
//                    "email, noti_status) " +
//                    "VALUES(?,?,?,?,?,?,?,?);";
//            return this.jdbcTemplate.update(sql,
//                    new Object[]{username, password,
//                            firstname, lastname,
//                            gender, birth_date,
//                            email, noti_status}, MODIFY HERE);
//        }catch (Exception exception){
//            throw  new UserLoginFailedException();
//        }
//
//    }

//    @Transactional
//    public void save(User user) {
//        String sql = "INSERT INTO USERS(id, firstname, lastname) VALUES (?,?,?)";
//        this.jdbcTemplate.update(sql,
//                user.getUser_id(),
//                user.getFirstname(),
//                user.getLastname());
//    }
}