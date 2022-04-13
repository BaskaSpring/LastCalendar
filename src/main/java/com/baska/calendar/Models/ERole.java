package com.baska.calendar.Models;

public enum ERole {
    ROLE_USER;

    private String name;

    ERole() {
        name = this.toString();
    }

    public String getName() {
        return name;
    }
}