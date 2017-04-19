package demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by DELL on 31/03/2560.
 */
public class CinemaRowMapper implements RowMapper<Cinema> {
    @Override
    public Cinema mapRow(ResultSet resultSet, int i) throws SQLException {
        Cinema cinema = new Cinema();
        cinema.setId(resultSet.getLong("cinema_id"));
        cinema.setGroup(resultSet.getString("cinema_group"));
        cinema.setCinema_name_th(resultSet.getString("cinema_name_th"));
        cinema.setCinema_name_en(resultSet.getString("cinema_name_en"));
        cinema.setCinema_zone(resultSet.getString("cinema_zone"));
        cinema.setCinema_tel(resultSet.getString("cinema_tel"));
        return cinema;
    }
}
