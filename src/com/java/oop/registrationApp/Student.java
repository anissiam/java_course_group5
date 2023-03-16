package com.java.oop.registrationApp;

public class Student {
    private int id;
    private String name;
    private int ava;
    private String major;

    public Student() {
    }

    public Student(int id, String name, int ava, String major) {
        this.id = id;
        this.name = name;
        this.ava = ava;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAva() {
        return ava;
    }

    public void setAva(int ava) {
        this.ava = ava;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ava=" + ava +
                ", major='" + major + '\'' +
                '}';
    }
}
