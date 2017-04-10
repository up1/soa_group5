package demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by DELL on 03/04/2560.
 */
public class ShowtimeRowMapper  implements RowMapper<Showtime>{
    @Override
    public Showtime mapRow(ResultSet resultSet, int i) throws SQLException {

        Showtime showtime = new Showtime();
        showtime.setShowtime_id(resultSet.getLong("showtime_id"));
        showtime.setMovie_id(resultSet.getLong("movie_id"));
        showtime.setCinema_id(resultSet.getLong("cinema_id"));
        showtime.setShow_language(resultSet.getString("show_language"));
        showtime.setShow_time(resultSet.getString("show_time"));
        showtime.setShow_date(resultSet.getString("show_date"));
        showtime.setShow_movie_link(resultSet.getString("show_movie_link"));
        showtime.setShow_theatre(resultSet.getInt("show_theatre"));
        showtime.setShow_system_type(resultSet.getString("show_system_type"));

        return showtime;
    }
}
