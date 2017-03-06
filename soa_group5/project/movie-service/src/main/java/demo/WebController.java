package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by NUI on 3/7/2017.
 */
@Controller
public class WebController {
    private final MovieRepository movieRepository;

    @Autowired
    public WebController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String test(@RequestParam(value = "id", defaultValue = "1") int id, Model model){
        model.addAttribute("tests", movieRepository.findById((long) id));
        return "Home";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
