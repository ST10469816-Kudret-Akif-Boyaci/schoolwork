/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.billing;

/**
 *
 * @author lab_services_student
 */
public class employee {

    public employee() {

    }

    public double calculatesalary(double rate, int hours) {
        return rate * hours;
    }

    public double calculatesalary(double rate, int hours, double bonusvalue) {
        return (rate * hours) + bonusvalue;
    }

    public void displayempdetails(String name, String surname) {
        System.out.println("name " + name + "surname " + surname);
    }

    public void displayempdetails(String name, String surname, int age) {
        System.out.println("name " + name + "surname " + surname + "age " + age);
    }
}
