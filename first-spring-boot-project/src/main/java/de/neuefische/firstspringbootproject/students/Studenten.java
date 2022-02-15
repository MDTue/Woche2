package de.neuefische.firstspringbootproject.students;

import java.util.UUID;

public class Studenten {
    private String name;
    private String nr;


    public Studenten(String name) {
        nr = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
