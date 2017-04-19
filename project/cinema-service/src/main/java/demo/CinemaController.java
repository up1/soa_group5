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

    @RequestMapping("/cinemas/major/bkk")
    public List<Cinema> getMajorBKK(){
        return this.cinemaRepository.findMajorBangkok();
    }

    @RequestMapping("/cinemas/major/cen")
    public List<Cinema> getMajorCEN(){
        return this.cinemaRepository.findMajorCenter();
    }

    @RequestMapping("/cinemas/major/east")
    public List<Cinema> getMajorEAS(){
        return this.cinemaRepository.findMajorEast();
    }

    @RequestMapping("/cinemas/major/north")
    public List<Cinema> getMajorNOR(){
        return this.cinemaRepository.findMajorNorth();
    }

    @RequestMapping("/cinemas/major/northeast")
    public List<Cinema> getMajorESN(){
        return this.cinemaRepository.findMajorNorthEast();
    }

    @RequestMapping("/cinemas/major/south")
    public List<Cinema> getMajorSOU(){
        return this.cinemaRepository.findMajorSouth();
    }

    @RequestMapping("/cinemas/major/west")
    public List<Cinema> getMajorWES(){
        return this.cinemaRepository.findMajorWest();
    }

    @RequestMapping("/cinemas/sf/bkk")
    public List<Cinema> getSFBKK(){
        return this.cinemaRepository.findSFBangkok();
    }

    @RequestMapping("/cinemas/sf/cen")
    public List<Cinema> getSFCEN(){
        return this.cinemaRepository.findSFCenter();
    }

    @RequestMapping("/cinemas/sf/east")
    public List<Cinema> getSFEAS(){
        return this.cinemaRepository.findSFEast();
    }

    @RequestMapping("/cinemas/sf/north")
    public List<Cinema> getSFNOR(){
        return this.cinemaRepository.findSFNorth();
    }

    @RequestMapping("/cinemas/sf/northeast")
    public List<Cinema> getSFESN(){
        return this.cinemaRepository.findSFNorthEast();
    }

    @RequestMapping("/cinemas/sf/south")
    public List<Cinema> getSFSOU(){
        return this.cinemaRepository.findSFSouth();
    }

    @RequestMapping("/cinemas/sf/west")
    public List<Cinema> getSFWES(){
        return this.cinemaRepository.findSFWest();
    }
}
