package com.hcc.entities;

import javax.persistence.*;

/**
 * Class for the <b>AUTHORITY</b> entity of the backend application. It represents the role assigned to each <b>User</b>.
 * It is mapped to the <em>authorities</em> postgreSQL table with the <b>id</b> being the primary key.
 */
@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;
//    private User user;

    public Authority(long id, String authority, User user) {
        this.id = id;
        this.authority = authority;
//        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
