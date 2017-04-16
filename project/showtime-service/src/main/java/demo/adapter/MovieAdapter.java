package demo.adapter;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by DELL on 14/04/2560.
 */

@Service
public class MovieAdapter {

    public Movie getMovieDetail(long movieId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9001/movie?id=" + movieId;
        Movie movie = restTemplate.getForObject(url, Movie.class);
        return  movie;
    }
}
