package demo; /**
 * Created by Administrator on 6/3/2560.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @RequestMapping("/user")
//    public User getUser(@RequestParam(value="id", defaultValue="1") int id) {
//        return this.userRepository.findById();
//    }

    @RequestMapping("/login")
    public User authorizeUser(@RequestParam(value="username") String username,
                              @RequestParam(value="password") String password) {
        return this.userRepository.userLogin(username, password);
    }
}