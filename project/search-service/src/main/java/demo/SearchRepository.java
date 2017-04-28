package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@EnableAutoConfiguration
public class SearchRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public Search search() {

        Search search = new Search();
        List<Movie> movieList = this.jdbcTemplate.query("SELECT * FROM Movie ORDER BY movie_release_date DESC", new MovieRowMapper());
        search.setMovies(movieList);
        search.setMovie_count(movieList.size() + 1);

        return search;
    }
//
//    @Transactional
//    public void save(Movie movie) {
//        String sql = "INSERT INTO USERS(id, firstname, lastname) VALUES (?,?,?)";
//        this.jdbcTemplate.update(sql, movie.getId(), movie.getFirstname(), movie.getLastname());
//    }
//
//    public void delete(Long id) {
//        String sql = "DELETE FROM USERS WHERE id=?";
//        this.jdbcTemplate.update(sql, id);
//    }
}
