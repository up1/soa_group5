package demo; /**
 * Created by Administrator on 6/3/2560.
 */
import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/user", produces = "application/json")
    public User getUser(@RequestParam(value="username") String username) {
        return this.userRepository.getUserData(username);
    }

    @RequestMapping("/")
    public String home(){
        return "Hello, World!";
    }

    @RequestMapping(value = "/login", produces = "aplication/json")
    public User authorizeUser(@RequestParam(value="username") String username,
                              @RequestParam(value="password") String password,
                              HttpServletResponse response) throws IOException {
//        if ( username == null ){
//            response.sendRedirect("/login.html");
//            return null;
//        }
        return this.userRepository.userLogin(username, password);
    }

    @PostMapping(value = "/register")
    @ResponseBody
    public String registerUser(@RequestParam(value="username") String username,
                               @RequestParam(value="password") String password,
                               @RequestParam(value="firstname") String firstname,
                               @RequestParam(value="lastname") String lastname,
                               @RequestParam(value="gender") String gender,
                               @RequestParam(value="birth_date") String birth_date,
                               @RequestParam(value="email") String email,
                               @RequestParam(value="noti_status") String noti_status,
                               HttpServletResponse response) throws IOException {
        return this.userRepository.userRegister(username, password, firstname, lastname, gender, birth_date, email, noti_status);
//        response.setStatus(HttpServletResponse.SC_OK);
//        response.sendRedirect("/");
    }

    @PutMapping("/edit")
    public String editUserDetails(@RequestParam(value="username") String username,
                                 @RequestParam(value="firstname") String firstname,
                                 @RequestParam(value="lastname") String lastname,
                                 @RequestParam(value="gender") String gender,
                                 @RequestParam(value="birth_date") String birth_date,
                                 @RequestParam(value="email") String email,
                                 @RequestParam(value="noti_status") String noti_status) {
        return this.userRepository.userEditDetails(username, firstname, lastname, gender, birth_date, email, noti_status);
    }

    @PutMapping("/changepassword")
    public String userChangePassword(@RequestParam(value="username") String username,
                                     @RequestParam(value="password") String password,
                                     @RequestParam(value="new_password") String new_password,
                                     @RequestParam(value="confirm_new_password") String confirm_new_password){
        return this.userRepository.userChangePassword(username, password, new_password, confirm_new_password);
    }
}