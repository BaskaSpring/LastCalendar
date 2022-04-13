package com.baska.calendar.Models;

public enum StateProject {
    INWORK,
    CLOSED;

    private String name;

    StateProject() {
        name = this.toString();
    }

    public String getName() {
        return name;
    }

}
