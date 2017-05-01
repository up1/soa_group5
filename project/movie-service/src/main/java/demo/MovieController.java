package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@EnableAutoConfiguration
public class MovieController {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RequestMapping("/movie")
    public Movie getmovie(@RequestParam(value="id", defaultValue="1") int id) {
        return this.movieRepository.findById((long) id);
    }

    @RequestMapping("/movies")
    public List<Movie> getAllmovie() {
        return this.movieRepository.findCurrent();
    }

    @RequestMapping("/coming")
    public List<Movie> getComing() {
        return this.movieRepository.findComingSoon();
    }
}
