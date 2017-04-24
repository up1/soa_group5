package demo.adapter;

import org.springframework.web.client.RestTemplate;

/**
 * Created by Q on 24/4/2560.
 */
public class MovieAdapter {

    public Movie getMovieById(long movieId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://movie-service:9001/movie?movie_id=" + movieId;
        return restTemplate.getForObject(url, Movie.class);
    }
}
