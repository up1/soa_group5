package demo;

import demo.adapter.Movie;

import java.util.Date;

/**
 * Created by Administrator on 6/3/2560.
 */
public class User {
    private String username;
    private String firstname;
    private String lastname;
    private String gender;
    private String birth_date;
    private String email;
    private String noti_status;

    public User(){

    }

    public User(String username,
                String firstname,
                String lastname,
                String gender,
                String birth_date,
                String email,
                String noti_status){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birth_date = birth_date;
        this.email = email;
        this.noti_status = noti_status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoti_status() {
        return noti_status;
    }

    public void setNoti_status(String noti_status) {
        this.noti_status = noti_status;
    }
}
