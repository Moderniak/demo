package com.example.demo.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.demo.security.ApplicationUserPermisson.*;

public enum  ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermisson> permissons;

    ApplicationUserRole(Set<ApplicationUserPermisson> permissons) {
        this.permissons = permissons;
    }
}
