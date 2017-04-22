package demo.adapter;

/**
 * Created by caliver on 4/23/2017 AD.
 */
public class Movie {
    private long id;
    private String name_th;
    private String name_en;
    private String description;
    private String release_date;
    private String poster;
    private String trailer;
    private int duration;
    private String status;
    private String cover;


    public Movie() {

    }

    public Movie(long id, String name_th, String name_en, String description,
                 String release_date, String poster, String trailer,
                 int duration, String status, String cover){
        this.id = id;
        this.name_th = name_th;
        this.name_en = name_en;
        this.description = description;
        this.release_date = release_date;
        this.poster = poster;
        this.trailer = trailer;
        this.duration = duration;
        this.status = status;
        this.cover = cover;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_th() {
        return name_th;
    }

    public void setName_th(String name_th) {
        this.name_th = name_th;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}