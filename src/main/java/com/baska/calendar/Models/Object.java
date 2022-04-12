package com.baska.calendar.Models;


public enum Object {
    PROJECT,TUSK,ROLE,USER,USERROLES,STATUS;

    private String name;

    Object() {
        name = this.toString();
    }

    public String getName() {
        return name;
    }
}
