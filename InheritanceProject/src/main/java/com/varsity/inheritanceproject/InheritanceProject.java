/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.inheritanceproject;

/**
 *
 * @author lab_services_student
 */
public class InheritanceProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Employee emp = new Employee("manager", "steven", "ndy", 45);
        FullTimer emp2 = new FullTimer("auditor", "steven", "ndy", 45, 2000);
        PartTimer emp3 = new PartTimer("manager", "steven", "ndy", 45, 200, 20);
        Contractor emp4 = new Contractor("manager", "steven", "ndy", 45, 2000);

        System.out.println("main employee => " + emp);
        System.out.println("Full time employee => " + emp2);
        System.out.println("part time employee => " + emp3);
        System.out.println("Contractor => " + emp4);

        System.out.println("main employee role => " + emp.getRole());
        System.out.println("Full time employee role => " + emp2.getRole());
        System.out.println("part time employee role => " + emp3.getRole());
        System.out.println("Contractor role => " + emp4.getRole());
    }
}
