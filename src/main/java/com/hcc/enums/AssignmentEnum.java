package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * An enum class containing all the assignments currently available in the application.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AssignmentEnum {

    Assignment1(1, "www.github.com/assignment1"),
    Assignment2(1, "www.github.com/assignment2"),
    Assignment3(1, "www.github.com/assignment3"),
    Assignment4(1, "www.github.com/assignment4");

    private int assignmentNumber;

    private String assignmentGitHubURL;

    AssignmentEnum(int assignmentNumber, String assignmentGitHubURL) {
        this.assignmentNumber = assignmentNumber;
        this.assignmentGitHubURL = assignmentGitHubURL;
    }

    int getAssignmentNumber() { return assignmentNumber; }
    String getAssignmentGitHubURL() { return assignmentGitHubURL; }
}
