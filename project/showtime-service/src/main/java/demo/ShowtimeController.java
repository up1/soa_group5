package demo;

import demo.adapter.Cinema;
import demo.adapter.CinemaAdapter;
import demo.adapter.Movie;
import demo.adapter.MovieAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DELL on 03/04/2560.
 */

@RestController
@CrossOrigin(origins = "*")
@EnableAutoConfiguration
public class ShowtimeController {

    private final ShowtimeRepository showtimeRepository;
    private final MovieAdapter movieAdapter;
    private final CinemaAdapter cinemaAdapter;

    @Autowired
    public ShowtimeController(ShowtimeRepository showtimeRepository, MovieAdapter movieAdapter, CinemaAdapter cinemaAdapter){
        this.showtimeRepository = showtimeRepository;
        this.movieAdapter = movieAdapter;
        this.cinemaAdapter = cinemaAdapter;
    }

    @RequestMapping("/showfromall")
    public List<Showtime> getShowtimeFromAll(@RequestParam(value = "movie") List<String> movid_id,
                                            @RequestParam(value = "cinema") List<String> cinema_id) {
        List<Showtime> showtimeList = this.showtimeRepository.findByMovieIdAndCinemaId(movid_id, cinema_id);
        for (Showtime showtime: showtimeList) {
            showtime.setCinema(this.cinemaAdapter.getCinemaDetail(showtime.getCinema_id()));
            showtime.setMovie(this.movieAdapter.getMovieDetail(showtime.getMovie_id()));
        }
        return showtimeList;
    }

    @RequestMapping("/showfrommovie")
    public List<Showtime> getShowtimeFromMovie(@RequestParam(value = "movie") List<String> movid_id) {
        List<Showtime> showtimeList = this.showtimeRepository.findByMovieId(movid_id);

        for (Showtime showtime: showtimeList) {
            showtime.setCinema(this.cinemaAdapter.getCinemaDetail(showtime.getCinema_id()));
            showtime.setMovie(this.movieAdapter.getMovieDetail(showtime.getMovie_id()));
        }
        return showtimeList;
    }

    @RequestMapping("/showfromcinema")
    public List<Showtime> getShowtimeFromCinema(@RequestParam(value = "cinema") List<String> cinema_id) {
        List<Showtime> showtimeList = this.showtimeRepository.findByCinemaId(cinema_id);

        for (Showtime showtime: showtimeList) {
            showtime.setCinema(this.cinemaAdapter.getCinemaDetail(showtime.getCinema_id()));
            showtime.setMovie(this.movieAdapter.getMovieDetail(showtime.getMovie_id()));
        }
        return showtimeList;
    }
}
