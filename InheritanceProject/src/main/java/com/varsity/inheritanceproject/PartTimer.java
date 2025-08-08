/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.inheritanceproject;

/**
 *
 * @author lab_services_student
 */
public class PartTimer extends Employee {
//    private String role;
//    private String name;
//    private String surname;
    private double monthlysalary;
    private double hour;
    //   private int age;

    public PartTimer(String role, String name, String surname, int age, double montlysalary, double hour) {
        super(role, name, surname, age);
        this.monthlysalary = montlysalary;
        this.hour = hour;
    }
}
