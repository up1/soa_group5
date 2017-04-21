package demo.adapter;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by DELL on 14/04/2560.
 */

@Service
public class CinemaAdapter {

    public Cinema getCinemaDetail(long cinemaId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9002/cinema?id=" + cinemaId;
        Cinema cinema = restTemplate.getForObject(url, Cinema.class);
        return  cinema;
    }
}
