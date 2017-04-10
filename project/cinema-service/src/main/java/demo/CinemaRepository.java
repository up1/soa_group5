package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DELL on 31/03/2560.
 */
@Repository
@EnableAutoConfiguration
public class CinemaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public Cinema findById(Long id) {
        try {
            return this.jdbcTemplate.queryForObject("SELECT * FROM Cinema WHERE cinema_id = ?", new Object[]{id}, new CinemaRowMapper());
        } catch (Exception exception) {
            throw new UserNotFoundException(id);
        }
    }

    @Transactional(readOnly = true)
    public List<Cinema> findAll() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema", new CinemaRowMapper());

        return cinemaList;
    }
}
