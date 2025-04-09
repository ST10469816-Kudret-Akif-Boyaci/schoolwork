/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.evenodd;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class AscendingAndDescending {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("please enter the first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("please enter the second number"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("please enter the third number"));

        if (num3 > num2 && num2 > num1) {
            JOptionPane.showMessageDialog(null, "Ascending is " + num1 + " < " + num2 + " < " + num3 + "\nDescending is " + num3 + " > " + num2 + " > " + num1);
        }
        if (num1 > num2 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "Ascending is " + num3 + " < " + num2 + " < " + num1 + "\nDescending is " + num1 + " > " + num2 + " > " + num3);
        }
        if (num2 > num1 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "Ascending is " + num3 + " < " + num1 + " < " + num2 + "\nDescending is " + num2 + " > " + num1 + " > " + num3);
        }
        if (num2 > num3 && num3 > num1) {
            JOptionPane.showMessageDialog(null, "Ascending is " + num1 + " < " + num3 + " < " + num2 + "\nDescending is " + num2 + " > " + num3 + " > " + num1);
        }
        if (num3 > num1 && num1 > num2) {
            JOptionPane.showMessageDialog(null, "Ascending is " + num2 + " < " + num1 + " < " + num3 + "\nDescending is " + num3 + " > " + num1 + " > " + num2);
        }
        if (num1 > num3 && num3 > num2) {
            JOptionPane.showMessageDialog(null, "Ascending is " + num2 + " < " + num3 + " < " + num1 + "\nDescending is " + num1 + " > " + num3 + " > " + num2);
        }

    }
}
