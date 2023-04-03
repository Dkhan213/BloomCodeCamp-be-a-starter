package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * An enum class representing all the possible status's for each assignment.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AssignmentStatusEnum {
    Status1("Submitted But Not Claimed"),
    Status2("Rejected"),
    Status3("Approved"),
    Status4("Claimed But Not Reviewed"),
    Status5("Not Submitted");


    private String status;

    AssignmentStatusEnum(String status) {
        this.status = status;
    }

    String getStatus() { return status; }
}
