package demo.adapter;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Q on 24/4/2560.
 */
@Service
public class MovieAdapter {

    public Movie getMovieById(long movieId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://139.59.237.128:9001/movie?id=" + movieId;
        return restTemplate.getForObject(url, Movie.class);
    }
}
