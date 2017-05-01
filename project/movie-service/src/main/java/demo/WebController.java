package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by DELL on 07/03/2560.
 */
@Controller
public class WebController {
    private final MovieRepository movieRepository;

    @Autowired
    public WebController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RequestMapping(value="/movie_desc", method= RequestMethod.GET)
    public String movie_description(@RequestParam(value = "id") int id, Model model){
        model.addAttribute("id", id);
        model.addAttribute("check", new Check());
        return "movie_description";
    }

    @RequestMapping(value="/show", method= RequestMethod.POST)
    public String showtime(@ModelAttribute Check check){
        return "showtime";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("check", new Check());
        return "index";
    }

    @RequestMapping(value = "/cinema", method= RequestMethod.GET)
    public String cinema(Model model) {
        model.addAttribute("check", new Check());
        return "cinema";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
