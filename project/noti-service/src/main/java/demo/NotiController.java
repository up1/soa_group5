package demo;

import demo.adapter.MovieAdapter;
import demo.adapter.UserAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class NotiController {

    private final NotiRepository notiRepository;
    private final UserAdapter userAdapter;
    private final MovieAdapter movieAdapter;

    @Autowired
    public NotiController(NotiRepository notiRepository, UserAdapter userAdapter, MovieAdapter movieAdapter) {
        this.notiRepository = notiRepository;
        this.userAdapter = userAdapter;
        this.movieAdapter = movieAdapter;
    }

    @Autowired
    private MailSender mailSender;

    @GetMapping("/notification/{username}")
    public List<Noti> getNotibyUsername(@PathVariable String userName) {

        List<Noti> notiList = this.notiRepository.findByUsername(userName);
//        if(orderList == null || orderList.isEmpty()) {
//            throw new OrderNotFoundException(userId);
//        }

        for (Noti noti: notiList) {
            noti.setUser(this.userAdapter.getUserDetail(noti.getUsername()) );
            noti.setMovie(this.movieAdapter.getMovieById(noti.getMovie_id()));
        }

        return  notiList;
    }
//
//    @GetMapping("/notification/email")
//    public void sentNoti(){
//        for ()
//    }
}
