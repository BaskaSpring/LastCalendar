package com.baska.calendar.Models;

public enum Operation {
    CREATE,
    UPDATE,
    DELETE;

    private String name;

    Operation() {
        name = this.toString();
    }

    public String getName() {
        return name;
    }
}
