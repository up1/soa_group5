package demo.adapter;

import org.springframework.web.client.RestTemplate;

/**
 * Created by Q on 24/4/2560.
 */
public class UserAdapter {

    public User getUserDetail(String userName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://user-service:9004/user/" + userName;
        User user = restTemplate.getForObject(url, User.class);
        return  user;
    }
}
