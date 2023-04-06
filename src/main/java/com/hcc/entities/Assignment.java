package com.hcc.entities;

import javax.persistence.*;

/**
 * Class for the <b>ASSIGNMENT</b> entity of the backend application. It represents the assignments that each <b>USER</b> could potentially be associated with.
 * It is mapped to the <em>assignments</em> postgreSQL table with the <b>id</b> being the primary key.
 */
@Entity
@Table(name = "assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private int number;
    private String githubUrl;
    private String branch;
    private String reviewVideoUrl;
    @ManyToOne
    private User user;
//    private User codeReviewer;

    public Assignment(Long id, String status, int number, String githubUrl, String branch, String reviewVideoUrl, Long userId, User codeReviewer) {
        this.id = id;
        this.status = status;
        this.number = number;
        this.githubUrl = githubUrl;
        this.branch = branch;
        this.reviewVideoUrl = reviewVideoUrl;
//        this.user = new User(userId);
//        this.codeReviewer = codeReviewer;
    }

    public Assignment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getReviewVideoUrl() {
        return reviewVideoUrl;
    }

    public void setReviewVideoUrl(String reviewVideoUrl) {
        this.reviewVideoUrl = reviewVideoUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
//
//    public User getCodeReviewer() {
//        return codeReviewer;
//    }
//
//    public void setCodeReviewer(User codeReviewer) {
//        this.codeReviewer = codeReviewer;
//    }
}
