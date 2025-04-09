/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.conditionsproject;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ConditionsProject {

    public static void main(String[] args) {
        //   System.out.println("Hello World!");

        String name = JOptionPane.showInputDialog("enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));

        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "Hey " + name + ", congrats you can enter the premisies because your age is " + age + " which is bigger than 18");
        } else {
            JOptionPane.showMessageDialog(null, "Hey " + name + ", sorry you can't enter the premisies because your age is " + age + " which is smaller than 18");

        }
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter your number"));

        if (num1 >= 0) {
            JOptionPane.showMessageDialog(null, "number " + num1 + " positive");
            
            int num2 = num1%5;
            if (num2 == 0){
                JOptionPane.showMessageDialog(null, "number " + num1 + " is a multiple of 5");
            } else {
                JOptionPane.showMessageDialog(null, "number " + num1 + " is not a multiple of 5");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "number " + num1 + " is negative");
        }
       
        
    }
}
