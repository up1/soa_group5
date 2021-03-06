
package demo;

import demo.adapter.MovieAdapter;
import demo.adapter.UserAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@EnableAutoConfiguration
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
    private JavaMailSender mailSender;

    @GetMapping("/notification")
    public List<Noti> getNoti(){
        List<Noti> notiList = this.notiRepository.getAllNoti();
        for (Noti each: notiList) {
            each.setUser(this.userAdapter.getUserDetail(each.getUsername()));
            each.setMovie(this.movieAdapter.getMovieById(each.getMovie_id()));
        }
        return notiList;
    }


    @GetMapping("/notification/sent")
    @Scheduled(cron="0 0 6 * * *", zone = "Asia/Bangkok")
    public String sentNoti(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate current_date = LocalDate.now();

        List<Noti> notiList = this.notiRepository.getNoneNoti();
        for (Noti each: notiList) {

            each.setUser(this.userAdapter.getUserDetail(each.getUsername()));
            each.setMovie(this.movieAdapter.getMovieById(each.getMovie_id()));
            if (each.getStatus().equals("not")) {
                if (each.getMovie().getRelease_date().equals(dtf.format(current_date))) {
                    this.notiRepository.updateStatus(each.getUsername(),each.getMovie_id());

                    String email = each.getUser().getEmail();
                    String movie_name_en = each.getMovie().getName_en();
                    String movie_name_th = each.getMovie().getName_th();
                    String movie_description = each.getMovie().getDescription();
                    String imagePath = each.getMovie().getPoster();
                    try {
                        MimeMessage mimeMessage = mailSender.createMimeMessage();
                        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
                        String htmlMsg = "<img src=\"" + imagePath + "\" width = 200px height = 250px > " +
                                "<h1> " + movie_name_en + "</h1>" +
                                "<h2>" + movie_name_th + "</h2>" +
                                "<p>" + movie_description + "</p>" +

                                "<p><a href= \"http://139.59.237.128:9001/movie_desc?id=" + each.getMovie_id() + "\">คลิ้กเพื่อดูรายละเอียด" + "</a></p>";
                        mimeMessage.setContent(htmlMsg, "text/html; charset=utf-8");
                        helper.setTo(email);
                        helper.setSubject(movie_name_en + "  is Showing Now");
                        helper.setFrom(new InternetAddress("bankycritical@gmail.com", "ShowtimeTH"));
                        mailSender.send(mimeMessage);
                    } catch (Exception e) {
                    }
                }

            }
        }

       return "Email Sent";
    }

    @GetMapping("/notification/{username}")
    public List<Noti> getNotibyUsername(@PathVariable String username) {

        List<Noti> notiList = this.notiRepository.findByUsername(username);
        if(notiList == null || notiList.isEmpty()) {
            throw new NotiNotFoundException(username);
        }

        for (Noti noti: notiList) {
            noti.setUser(this.userAdapter.getUserDetail(noti.getUsername()) );
            noti.setMovie(this.movieAdapter.getMovieById(noti.getMovie_id()));
        }

        return  notiList;
    }

    @GetMapping("/notification/{username}/{movie_id}")
    public List<Noti> getNotibyUsernameMID(@PathVariable("username") String username, @PathVariable("movie_id") String movie_id) {

        List<Noti> notiList = this.notiRepository.findByUsernameMovieID(username,(Integer.parseInt(movie_id)));
        if(notiList == null || notiList.isEmpty()) {
            throw new NotiNotFoundException(username);
        }

        for (Noti noti: notiList) {
            noti.setUser(this.userAdapter.getUserDetail(noti.getUsername()) );
            noti.setMovie(this.movieAdapter.getMovieById(noti.getMovie_id()));
        }

        return  notiList;
    }

    @RequestMapping("/notification/{username}/sent")
    @ResponseBody
    public String sentNoti(@PathVariable String username){
        for(Noti each : getNotibyUsername(username)){
            String email = each.getUser().getEmail();
            String movie_name_en = each.getMovie().getName_en();
            String movie_name_th = each.getMovie().getName_th();
            String movie_description = each.getMovie().getDescription();
            String imagePath = each.getMovie().getPoster();
            System.out.println(each);


            try{
                MimeMessage mimeMessage = mailSender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
                String htmlMsg = "<img src=\""+imagePath+"\" width = 200px height = 250px > " +
                        "<h1> "+ movie_name_en +"</h1>" +
                        "<h2>" + movie_name_th + "</h2>" +
                        "<p>" + movie_description + "</p>" +

                        "<p><a href= \"http://localhost:9001/movie_desc?id=" + each.getMovie_id()+"\">คลิ้กเพืื่อดูรายละเอียด"+ "</a></p>";
                mimeMessage.setContent(htmlMsg, "text/html; charset=utf-8");
                helper.setTo(email);
                helper.setSubject(movie_name_en + " is Showing Now");
                helper.setFrom(new InternetAddress("bankycritical@gmail.com", "ShowtimeTH"));
                mailSender.send(mimeMessage);
            }catch (Exception e){

            }

        }



        return "Email sent";
    }

    @RequestMapping("/notification/{username}/sent/{movie_id}")
    @ResponseBody
    public String sentEachNoti(@PathVariable("username") String username, @PathVariable("movie_id") String movie_id){

        for(Noti each : getNotibyUsernameMID(username,movie_id)){
            String email = each.getUser().getEmail();
            String movie_name_en = each.getMovie().getName_en();
            String movie_name_th = each.getMovie().getName_th();
            String movie_description = each.getMovie().getDescription();
            String imagePath = each.getMovie().getPoster();

            try{
                MimeMessage mimeMessage = mailSender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
                String htmlMsg = "<img src=\""+imagePath+"\" width = 200px height = 250px > " +
                        "<h1> "+ movie_name_en +"</h1>" +
                        "<h2>" + movie_name_th + "</h2>" +
                        "<p>" + movie_description + "</p>" +

                        "<p><a href= \"http://localhost:9001/movie_desc?id=" + each.getMovie_id()+"\">คลิ้กเเพื่อดูรายละเอียด"+ "</a></p>";
                mimeMessage.setContent(htmlMsg, "text/html; charset=utf-8");
                helper.setTo(email);
                helper.setSubject(movie_name_en + "  is Showing Now");
                helper.setFrom(new InternetAddress("bankycritical@gmail.com", "ShowtimeTH"));
                mailSender.send(mimeMessage);
            }catch (Exception e){

            }

        }



        return "Email sent";
    }
}