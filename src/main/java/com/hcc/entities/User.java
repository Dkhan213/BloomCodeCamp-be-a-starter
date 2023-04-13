package com.hcc.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Class for the <b>USER</b> entity of the backend application. It represents the users of the application.
 * It is mapped to the <em>user</em> postgreSQL table with the <b>id</b> being the primary key.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date cohortStartDate;
    private String username;
    private String password;
//    private List<Authority> authorities;

    public User(Long id, Date cohortStartDate, String username, String password, List<Authority> authorities) {
        this.id = id;
        this.cohortStartDate = cohortStartDate;
        this.username = username;
        this.password = password;
//        this.authorities = authorities;
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCohortStartDate() {
        return cohortStartDate;
    }

    public void setCohortStartDate(Date cohortStartDate) {
        this.cohortStartDate = cohortStartDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<Authority> getAuthorities() {
//        return authorities;
//    }
//
//    public void setAuthorities(List<Authority> authorities) {
//        this.authorities = authorities;
//    }
}
