package demo;

import demo.adapter.Cinema;
import demo.adapter.Movie;

/**
 * Created by DELL on 03/04/2560.
 */
public class Showtime {

    private long showtime_id;
    private long movie_id;
    private long cinema_id;
    private String show_language;
    private String show_time;
    private String show_date;
    private String show_movie_link;
    private int show_theatre;
    private String show_system_type;
    private Movie movie;
    private Cinema cinema;

    public long getShowtime_id() {
        return showtime_id;
    }

    public void setShowtime_id(long showtime_id) {
        this.showtime_id = showtime_id;
    }

    public long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(long movie_id) {
        this.movie_id = movie_id;
    }

    public long getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(long cinema_id) {
        this.cinema_id = cinema_id;
    }

    public String getShow_language() {
        return show_language;
    }

    public void setShow_language(String show_language) {
        this.show_language = show_language;
    }

    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }

    public String getShow_date() {
        return show_date;
    }

    public void setShow_date(String show_date) {
        this.show_date = show_date;
    }

    public String getShow_movie_link() {
        return show_movie_link;
    }

    public void setShow_movie_link(String show_movie_link) {
        this.show_movie_link = show_movie_link;
    }

    public int getShow_theatre() {
        return show_theatre;
    }

    public void setShow_theatre(int show_theatre) {
        this.show_theatre = show_theatre;
    }

    public String getShow_system_type() {
        return show_system_type;
    }

    public void setShow_system_type(String show_system_type) {
        this.show_system_type = show_system_type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
