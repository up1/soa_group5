package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
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
        try {
            String movie_list = movie_id.toString().replace("[", "").replace("]", "");
            String cinema_list = cinema_id.toString().replace("[", "").replace("]", "");
            return this.jdbcTemplate.query("SELECT * FROM Showtime WHERE movie_id IN (" + movie_list + ") AND cinema_id IN (" + cinema_list + ") order by cinema_id, movie_id, show_theatre, show_time", new ShowtimeRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException((long) 1);
        }
    }

    @Transactional(readOnly = true)
    public List<Showtime> findByMovieId(List<String> movie_id) {
        try {
            String movie_list = movie_id.toString().replace("[", "").replace("]", "");
            return this.jdbcTemplate.query("SELECT * FROM Showtime WHERE movie_id IN (" + movie_list + ")  order by cinema_id, movie_id, show_theatre, show_time", new ShowtimeRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException((long) 1);
        }
    }

    @Transactional(readOnly = true)
    public List<Showtime> findByCinemaId(List<String> cinema_id) {
        try {
            String cinema_list = cinema_id.toString().replace("[", "").replace("]", "");
            return this.jdbcTemplate.query("SELECT * FROM Showtime WHERE cinema_id IN (" + cinema_list + ") order by cinema_id, movie_id, show_theatre, show_time", new ShowtimeRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException((long) 1);
        }
    }
}
