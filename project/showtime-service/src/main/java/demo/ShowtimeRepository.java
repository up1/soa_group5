package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DELL on 03/04/2560.
 */
@Repository
@EnableAutoConfiguration
public class ShowtimeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Showtime> findByMovieIdAndCinemaId(List<String> movie_id, List<String> cinema_id) {
        String movie_list = movie_id.get(0);
        String cinema_list = cinema_id.get(0);
        try {
            for (int i = 1; i < movie_id.size(); i++) {
                movie_list = movie_list + ", " + i;
            }
            for (int i = 1; i < cinema_id.size(); i++) {
                cinema_list = cinema_list + ", " + i;
            }
            return this.jdbcTemplate.query("SELECT * FROM Showtime WHERE movie_id IN (?) AND cinema_id IN (?)", new Object[]{movie_list, cinema_list}, new ShowtimeRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException((long) 1);
        }
    }

    @Transactional(readOnly = true)
    public List<Showtime> findByMovieId(List<String> movie_id) {
        String movie_list = movie_id.get(0);
        try {
            for (int i = 1; i < movie_id.size(); i++) {
                movie_list = movie_list + ", " + i;
            }
            return this.jdbcTemplate.query("SELECT * FROM Showtime WHERE movie_id IN (?)", new Object[]{movie_list}, new ShowtimeRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException((long) 1);
        }
    }

    @Transactional(readOnly = true)
    public List<Showtime> findByCinemaId(List<String> cinema_id) {
        String cinema_list = cinema_id.get(0);
        try {
            for (int i = 1; i < cinema_id.size(); i++) {
                cinema_list = cinema_list + ", " + i;
            }
            return this.jdbcTemplate.query("SELECT * FROM Showtime WHERE cinema_id IN (?)", new Object[]{cinema_list}, new ShowtimeRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException((long) 1);
        }
    }
}
