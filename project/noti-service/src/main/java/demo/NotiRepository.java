package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableAutoConfiguration
@Repository
public class NotiRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public NotiRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(readOnly = true)
    public List<Noti> getAllNoti(){
        String sql = "Select * from Favourite_list" ;
        return this.jdbcTemplate.query(sql,new Object[]{},new NotiRowMapper());
    }

    @Transactional(readOnly = true)
    public List<Noti> getNoneNoti(){
        String sql = "Select * from Favourite_list WHERE status ='not'" ;
        return this.jdbcTemplate.query(sql,new Object[]{},new NotiRowMapper());
    }

    @Transactional
    public void updateStatus(String username, int movie_id){
        String sql = "Update Favourite_list SET status = 'sent' WHERE username = '" + username +"' AND movie_id = "+movie_id+"";
        this.jdbcTemplate.execute(sql);
    }

    @Transactional(readOnly = true)
    public List<Noti> findByUsername(String userName) {
        try {
            String sql = "SELECT * FROM Favourite_list WHERE username=?";
            return  this.jdbcTemplate.query(sql,
                    new Object[]{userName}, new NotiRowMapper());
        }catch (Exception exception) {
         throw new NotiNotFoundException(userName);
        }
    }

    @Transactional(readOnly = true)
    public List<Noti> findByUsernameMovieID(String userName, int movie_id) {
        try {
            String sql = "SELECT * FROM Favourite_list WHERE username=? AND movie_id=?";
            return  this.jdbcTemplate.query(sql,
                    new Object[]{userName,movie_id}, new NotiRowMapper());
        }catch (Exception exception) {
            throw new NotiNotFoundException(userName);
        }

    }


}