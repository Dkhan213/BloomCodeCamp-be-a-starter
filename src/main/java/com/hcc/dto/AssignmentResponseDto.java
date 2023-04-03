package com.hcc.dto;

/**
 * Class for the <b>ASSIGNMENT RESPONSE DATA TRANSFER OBJECT</b>. It is used to respond to http requests with data associated with
 * a specific assignment.
 */
public class AssignmentResponseDto {

    private Long userId;
    private String username;
    private Long assignmentId;
    private String status;
    private int number;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
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
}
