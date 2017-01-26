package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")
    public User getUser(@RequestParam(value="id", defaultValue="1") int id) {
        return this.userRepository.findById((long) id);
    }

    @RequestMapping("/users")
    public List<User> getAlluser(@RequestParam(value="page", defaultValue="1") int page,
                                 @RequestParam(value="userperpage", defaultValue="10") int userPerPage) {
        return this.userRepository.findAll((long) page, (long) userPerPage);
    }

}
