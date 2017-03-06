package demo; /**
 * Created by Administrator on 6/3/2560.
 */
import org.springframework.jdbc.core.RowMapper;

        import java.sql.ResultSet;
        import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        User user = new User();
        user.setUsername(resultSet.getString("username"));
        user.setFirstname(resultSet.getString("firstname"));
        user.setLastname(resultSet.getString("lastname"));
        user.setGender(resultSet.getString("gender"));
        user.setBirth_date(resultSet.getDate("birth_date").toString());
        user.setEmail(resultSet.getString("email"));
        user.setNoti_status(resultSet.getString("noti_status"));
        return user;
    }
}

