/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.inheritanceproject;

/**
 *
 * @author lab_services_student
 */
public class FullTimer extends Employee{
//    private String role;
//    private String name;
//    private String surname;
    private double montlysalary;
   // private int age;
    
    public FullTimer (String role,String name, String surname, int age, double montlysalary){
        super(role, name, surname, age);
        this.montlysalary = montlysalary;
    }
}
