package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DELL on 31/03/2560.
 */

@RestController
@CrossOrigin(origins = "*")
@EnableAutoConfiguration
public class CinemaController {

    private final CinemaRepository cinemaRepository;

    @Autowired
    public CinemaController(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @RequestMapping("/cinema")
    public Cinema getcinema(@RequestParam(value="id", defaultValue = "1") int id) {
        return this.cinemaRepository.findById((long) id);
    }

    @RequestMapping("/cinemas")
    public List<Cinema> getAllcinema(){
        return this.cinemaRepository.findAll();
    }
}
