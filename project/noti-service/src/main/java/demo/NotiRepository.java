package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class NotiRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public NotiRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Transactional(readOnly = true)
    public List<Noti> findByUsername(String userName) {
        try {
            String sql = "SELECT * FROM Favorite_list WHERE username=?";
            return  this.jdbcTemplate.query(sql,
                    new Object[]{userName}, new NotiRowMapper());
        }catch (Exception exception) {
//            throw new OrderNotFoundException(userId);
        }
        return null;
    }
}
