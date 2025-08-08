/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.inheritanceproject;

/**
 *
 * @author lab_services_student
 */
public class Employee {

    private String role;
    private String name;
    private String surname;
    //   private double salary;
    private int age;

    public Employee(String role, String name, String surname, int age) {
        this.role = role;
        this.name = name;
        this.surname = surname;
        //    this.salary = salary;
        this.age = age;
    }

//    public Employee() {
    //   }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
