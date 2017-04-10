package demo;

public class Cinema {

    private long id;
    private String group;
    private String cinema_name_th;
    private String cinema_name_en;
    private String cinema_zone;
    private String cinema_tel;

    public Cinema() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCinema_name_th() {
        return cinema_name_th;
    }

    public void setCinema_name_th(String cinema_name_th) {
        this.cinema_name_th = cinema_name_th;
    }

    public String getCinema_name_en() {
        return cinema_name_en;
    }

    public void setCinema_name_en(String cinema_name_en) {
        this.cinema_name_en = cinema_name_en;
    }

    public String getCinema_zone() {
        return cinema_zone;
    }

    public void setCinema_zone(String cinema_zone) {
        this.cinema_zone = cinema_zone;
    }

    public String getCinema_tel() {
        return cinema_tel;
    }

    public void setCinema_tel(String cinema_tel) {
        this.cinema_tel = cinema_tel;
    }
}
