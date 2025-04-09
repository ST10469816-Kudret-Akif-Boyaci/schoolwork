/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.testpatient;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestPatient {

    public static void main(String[] args) {
        String blood2 = JOptionPane.showInputDialog("enter blood data ");
        String id2 = JOptionPane.showInputDialog("enter ID ");
        int age2 = Integer.parseInt(JOptionPane.showInputDialog("enter the age"));

        Patient Patient1 = new Patient();
        Patient Patient2 = new Patient(blood2, id2, age2);

        String blood = Patient1.getBlooddata();
        String id = Patient1.getIdnumber();
        int age1 = Patient1.getAge();
        System.out.println("blood data is " + blood + " Id number is " + id + " age is " + age1);

        String type = Patient2.getBlooddata();
        String hr = Patient2.getIdnumber();
        int age3 = Patient2.getAge();
        System.out.println("blood data is " + type + " Id number is " + hr + " age is " + age3);
    }
}
