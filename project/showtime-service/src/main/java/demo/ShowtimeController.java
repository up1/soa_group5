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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private Map<Long, Movie> movieMap = new HashMap<>();
    private Map<Long, Cinema> cinemaMap = new HashMap<>();

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
            if (movieMap.containsKey(showtime.getMovie_id())){
                showtime.setMovie(movieMap.get(showtime.getMovie_id()));
            } else {
                Movie movie = this.movieAdapter.getMovieDetail(showtime.getMovie_id());
                showtime.setMovie(movie);
                movieMap.put(showtime.getMovie_id(), movie);
            }

            if (cinemaMap.containsKey(showtime.getCinema_id())){
                showtime.setCinema(cinemaMap.get(showtime.getCinema_id()));
            } else {
                Cinema cinema = this.cinemaAdapter.getCinemaDetail(showtime.getCinema_id());
                showtime.setCinema(cinema);
                cinemaMap.put(showtime.getCinema_id(), cinema);
            }
        }
        return showtimeList;
    }

    @RequestMapping("/showfrommovie")
    public List<Showtime> getShowtimeFromMovie(@RequestParam(value = "movie") List<String> movid_id) {
        List<Showtime> showtimeList = this.showtimeRepository.findByMovieId(movid_id);

        for (Showtime showtime: showtimeList) {
            if (movieMap.containsKey(showtime.getMovie_id())){
                showtime.setMovie(movieMap.get(showtime.getMovie_id()));
            } else {
                Movie movie = this.movieAdapter.getMovieDetail(showtime.getMovie_id());
                showtime.setMovie(movie);
                movieMap.put(showtime.getMovie_id(), movie);
            }

            if (cinemaMap.containsKey(showtime.getCinema_id())){
                showtime.setCinema(cinemaMap.get(showtime.getCinema_id()));
            } else {
                Cinema cinema = this.cinemaAdapter.getCinemaDetail(showtime.getCinema_id());
                showtime.setCinema(cinema);
                cinemaMap.put(showtime.getCinema_id(), cinema);
            }
        }
        return showtimeList;
    }

    @RequestMapping("/showfromcinema")
    public List<Showtime> getShowtimeFromCinema(@RequestParam(value = "cinema") List<String> cinema_id) {
        List<Showtime> showtimeList = this.showtimeRepository.findByCinemaId(cinema_id);

        for (Showtime showtime: showtimeList) {
            if (movieMap.containsKey(showtime.getMovie_id())){
                showtime.setMovie(movieMap.get(showtime.getMovie_id()));
            } else {
                Movie movie = this.movieAdapter.getMovieDetail(showtime.getMovie_id());
                showtime.setMovie(movie);
                movieMap.put(showtime.getMovie_id(), movie);
            }

            if (cinemaMap.containsKey(showtime.getCinema_id())){
                showtime.setCinema(cinemaMap.get(showtime.getCinema_id()));
            } else {
                Cinema cinema = this.cinemaAdapter.getCinemaDetail(showtime.getCinema_id());
                showtime.setCinema(cinema);
                cinemaMap.put(showtime.getCinema_id(), cinema);
            }
        }
        return showtimeList;
    }
}
