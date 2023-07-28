package com.blogrestapijava.models;

import java.sql.Timestamp;

public class Categories {

    private String name;
    private Timestamp registerAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Timestamp registerAt) {
        this.registerAt = registerAt;
    }
}
