package demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Movie movie = new Movie();
        movie.setId(resultSet.getLong("movie_id"));
        movie.setName_th(resultSet.getString("movie_name_th"));
        movie.setName_en(resultSet.getString("movie_name_en"));
        movie.setTrailer(resultSet.getString("movie_trailer"));
        movie.setDescription(resultSet.getString("movie_description"));
        movie.setPoster(resultSet.getString("movie_poster"));
        movie.setStatus(resultSet.getString("movie_status"));
        movie.setRelease_date(resultSet.getString("movie_release_date"));
        movie.setDuration(resultSet.getInt("movie_duration"));


        return movie;
    }
}
