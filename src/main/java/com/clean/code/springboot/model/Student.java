package com.clean.code.springboot.model;
public class Student {
    private long id;
    private String name;
    private String lastname;
    private String course;

    public Student(long id, String name, String lastname, String course) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
