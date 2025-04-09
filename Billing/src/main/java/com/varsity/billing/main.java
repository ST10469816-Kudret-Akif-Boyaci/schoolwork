/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.billing;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class main {

    public static void main(String[] args) {
        employee employee1 = new employee();

        double rate = Double.parseDouble(JOptionPane.showInputDialog("enter the rate"));

        Scanner inputdevice = new Scanner(System.in);
        System.out.println("enter no of hours");

        int hours = inputdevice.nextInt();

        double salary = employee1.calculatesalary(rate, hours);
        System.out.println(salary);
    }
}
