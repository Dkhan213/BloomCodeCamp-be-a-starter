package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.hcc.enums.UserPermissionsEnum.*;

/**
 * An enum class representing all the possible <em>roles/authorities</em> available to be assigned to <b>USERS</b>.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AuthorityEnum {

    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
    REVIEWER(Sets.newHashSet(COURSE_READ, STUDENT_READ));

    private final Set<UserPermissionsEnum> permissions;

    AuthorityEnum(Set<UserPermissionsEnum> permissions) {
        this.permissions = permissions;
    }

    public Set<UserPermissionsEnum> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
