package demo;


import demo.adapter.Movie;
import demo.adapter.User;

public class Noti {

    private String username;
    private int movie_id;
    private User user;
    private Movie movie;

    public Noti() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getUsername().equals(((Noti)obj).getUsername());
    }

    @Override
    public String toString() {
        return this.getUsername()+":"+this.getMovie_id()+":"+this.getMovie().getPoster()+":"+this.getMovie().getDescription();
    }
}
