package demo.adapter;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by caliver on 4/23/2017 AD.
 */
@Service
public class MovieAdapter {
    public Movie getMovieById(long movieId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://movie-service:9001/movie?movie_id=" + movieId;
        return restTemplate.getForObject(url, Movie.class);
    }
}
