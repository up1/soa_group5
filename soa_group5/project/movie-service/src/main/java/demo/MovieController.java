package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
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
    public List<Movie> getAllmovie(@RequestParam(value="page", defaultValue="1") int page,
                                 @RequestParam(value="movieperpage", defaultValue="10") int moviePerPage) {
        return this.movieRepository.findAll((long) page, (long) moviePerPage);
    }



}
