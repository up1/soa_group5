package demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NotiRowMapper implements RowMapper<Noti> {
    @Override
    public Noti mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Noti noti = new Noti();
        noti.setUsername(resultSet.getString("username"));
        noti.setMovie_id(resultSet.getInt("movie_id"));
        return noti;
    }
}

