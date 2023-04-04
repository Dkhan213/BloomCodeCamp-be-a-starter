package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * An enum class representing all the possible <em>roles/authorities</em> available to be assigned to <b>USERS</b>.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AuthorityEnum {

    ROLE_LEARNER,
    ROLE_REVIEWER,
    ROLE_ADMIN;
}
