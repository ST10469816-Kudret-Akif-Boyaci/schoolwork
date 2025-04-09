/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.calender;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Calender {

    public static void main(String[] args) {
        //   System.out.println("Hello World!");

        int monthval = Integer.parseInt(JOptionPane.showInputDialog("enter no of the month"));

        if (monthval == 1) {
            JOptionPane.showInternalMessageDialog(null, "January");
        } else if (monthval == 2) {
            JOptionPane.showInternalMessageDialog(null, "February");
        } else if (monthval == 3) {
            JOptionPane.showInternalMessageDialog(null, "March");
        } else if (monthval == 4) {
            JOptionPane.showInternalMessageDialog(null, "April");
        } else if (monthval == 5) {
            JOptionPane.showInternalMessageDialog(null, "May");
        } else if (monthval == 6) {
            JOptionPane.showInternalMessageDialog(null, "June");
        } else if (monthval == 7) {
            JOptionPane.showInternalMessageDialog(null, "July");
        } else if (monthval == 8) {
            JOptionPane.showInternalMessageDialog(null, "August");
        } else if (monthval == 9) {
            JOptionPane.showInternalMessageDialog(null, "September");
        } else if (monthval == 10) {
            JOptionPane.showInternalMessageDialog(null, "October");
        } else if (monthval == 11) {
            JOptionPane.showInternalMessageDialog(null, "November");
        } else if (monthval == 12) {
            JOptionPane.showInternalMessageDialog(null, "December");
        } else {
            JOptionPane.showInternalMessageDialog(null, "incompatible value");
        }

        String cardinalpoint = JOptionPane.showInputDialog("enter a cardinal point  (N, S, W, E)");

        switch (cardinalpoint) {
            case "north":
                JOptionPane.showInternalMessageDialog(null, "Direction is north");
                break;
            case "south":
                JOptionPane.showInternalMessageDialog(null, "Direction is south");
                break;
            case "east":
                JOptionPane.showInternalMessageDialog(null, "Direction is east");
                break;
            case "west":
                JOptionPane.showInternalMessageDialog(null, "Direction is west");
                break;
            default: 
                JOptionPane.showInternalMessageDialog(null, "incompatible value");
                
        }
    }
}
