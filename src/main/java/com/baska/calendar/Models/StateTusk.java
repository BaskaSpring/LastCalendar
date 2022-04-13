package com.baska.calendar.Models;

public enum StateTusk {
    INWORK,
    CLOSED;

    private String name;

    StateTusk() {
        name = this.toString();
    }

    public String getName() {
        return name;
    }
}
