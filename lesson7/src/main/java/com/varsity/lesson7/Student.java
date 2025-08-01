/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.lesson7;

/**
 *
 * @author lab_services_student
 */
public class Student {

    private String name;
    private String surname;
    private String stnum;

    public Student(String name, String surname, String stnum) {
        this.name = name;
        this.surname = surname;
        this.stnum = stnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStnum() {
        return stnum;
    }

    public void setStnum(String stnum) {
        this.stnum = stnum;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", stnum=" + stnum + '}';
    }

}
