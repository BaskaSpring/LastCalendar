package com.baska.calendar.Models;

public enum State {
    ENABLED,
    DELETED;

    private String name;

    State() {
        name = this.toString();
    }

    public String getName() {
        return name;
    }
}
