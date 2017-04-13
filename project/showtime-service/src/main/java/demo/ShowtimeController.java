package demo;

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

    @Autowired
    public ShowtimeController(ShowtimeRepository showtimeRepository){
        this.showtimeRepository = showtimeRepository;
    }

    @RequestMapping("/showfromall")
    public List<Showtime> getShowtimeFromAll(@RequestParam(value = "movie") List<String> movid_id,
                                            @RequestParam(value = "cinema") List<String> cinema_id) {
        return this.showtimeRepository.findByMovieIdAndCinemaId(movid_id, cinema_id);
    }

    @RequestMapping("/showfrommovie")
    public List<Showtime> getShowtimeFromMovie(@RequestParam(value = "movie") List<String> movid_id) {
        return this.showtimeRepository.findByMovieId(movid_id);
    }

    @RequestMapping("/showfromcinema")
    public List<Showtime> getShowtimeFromCinema(@RequestParam(value = "cinema") List<String> cinema_id) {
        return this.showtimeRepository.findByCinemaId(cinema_id);
    }
}
