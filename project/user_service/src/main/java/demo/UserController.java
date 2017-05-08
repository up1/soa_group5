package demo; /**
 * Created by Administrator on 6/3/2560.
 */
import demo.adapter.Movie;
import demo.exceptions.InvalidTokenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@CrossOrigin("*")
@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/user/{username}", produces = "application/json")
    public User getUser(@PathVariable String username) {
        return this.userRepository.getUserData(username);
    }

    @RequestMapping(value = "/login", produces = "application/json")
    public Token authorizeUser(@RequestParam(value="username") String username,
                              @RequestParam(value="password") String password) throws IOException {
        return this.userRepository.userLogin(username, password);
    }

    @PostMapping(value = "/register")
    @ResponseBody
    public ResponseEntity registerUser(@RequestParam(value="username") String username,
                                       @RequestParam(value="password") String password,
                                       @RequestParam(value="firstname") String firstname,
                                       @RequestParam(value="lastname") String lastname,
                                       @RequestParam(value="gender") String gender,
                                       @RequestParam(value="birth_date") String birth_date,
                                       @RequestParam(value="email") String email,
                                       @RequestParam(value="noti_status") String noti_status) throws IOException {
        this.userRepository.userRegister(username, password, firstname, lastname, gender, birth_date, email, noti_status);
        ResultMessage ResultMessage = new ResultMessage(username, "Successfully Created");
        return new ResponseEntity(ResultMessage , HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity editUserDetails(@RequestParam(value="username") String username,
                                 @RequestParam(value="firstname") String firstname,
                                 @RequestParam(value="lastname") String lastname,
                                 @RequestParam(value="gender") String gender,
                                 @RequestParam(value="birth_date") String birth_date,
                                 @RequestParam(value="email") String email,
                                 @RequestParam(value="noti_status") String noti_status) {
        this.userRepository.userEditDetails(username, firstname, lastname, gender, birth_date, email, noti_status);
        ResultMessage ResultMessage = new ResultMessage(username, "Successfully Update");
        return new ResponseEntity(ResultMessage , HttpStatus.CREATED);
    }

    @PutMapping("/changepassword")
    public ResponseEntity userChangePassword(@RequestParam(value="username") String username,
                                             @RequestParam(value="password") String password,
                                             @RequestParam(value="new_password") String new_password){
        this.userRepository.userChangePassword(username, password, new_password);
        ResultMessage ResultMessage = new ResultMessage(username, "Password Changed");
        return new ResponseEntity(ResultMessage , HttpStatus.CREATED);
    }

    @GetMapping("/{username}/likes")
    public List<Movie> getUserLikes(@PathVariable String username,
                                    @RequestParam String token){

        if(UserAuthentication.isValidToken(token)) {
            throw new InvalidTokenException(token);
        }

        return this.userRepository.getUserLikes(username);
    }

    @PostMapping("/like")
    public void likeMovie(@RequestParam(value="movie_id") int movie_id, String token) {
        this.userRepository.likeMovie(UserAuthentication.getSession(token).getUsername(), movie_id);
    }

    @DeleteMapping("/unlike")
    public void unlikeMovie(@RequestParam(value="movie_id") int movie_id, String token){
        this.userRepository.unlikeMovie(UserAuthentication.getSession(token).getUsername(), movie_id);
    }

    @PostMapping("/logout")
    public ResponseEntity logout(@RequestParam String tokenID){
        this.userRepository.logout(tokenID);
        ResultMessage ResultMessage = new ResultMessage("username","User Logout");
        return new ResponseEntity(ResultMessage , HttpStatus.CREATED);
    }

    @GetMapping("/validate/{tokenID}")
    public User validateToken(@PathVariable String tokenID) {
        if(UserAuthentication.isValidToken(tokenID)){
            return UserAuthentication.getSession(tokenID);
        }
        return null;
    }
}