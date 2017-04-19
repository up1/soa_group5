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

    @Transactional(readOnly = true)
    public List<Cinema> findMajorBangkok() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='Major' AND cinema_zone='BKK'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findMajorCenter() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='Major' AND cinema_zone='CEN'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findMajorEast() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='Major' AND cinema_zone='EAS'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findMajorNorthEast() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='Major' AND cinema_zone='ESN'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findMajorNorth() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='Major' AND cinema_zone='NOR'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findMajorSouth() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='Major' AND cinema_zone='SOU'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findMajorWest() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='Major' AND cinema_zone='WES'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findSFBangkok() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='SF' AND cinema_zone='BKK'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findSFCenter() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='SF' AND cinema_zone='CEN'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findSFEast() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='SF' AND cinema_zone='EAS'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findSFNorthEast() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='SF' AND cinema_zone='ESN'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findSFNorth() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='SF' AND cinema_zone='NOR'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findSFSouth() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='SF' AND cinema_zone='SOU'", new CinemaRowMapper());

        return cinemaList;
    }

    @Transactional(readOnly = true)
    public List<Cinema> findSFWest() {
        List<Cinema> cinemaList = this.jdbcTemplate.query("SELECT * FROM Cinema WHERE cinema_group='SF' AND cinema_zone='WES'", new CinemaRowMapper());

        return cinemaList;
    }
}
