/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.testblooddata;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestBloodData {

    public static void main(String[] args) {
        //  System.out.println("Hello World!");

       
         
        String blood2 = JOptionPane.showInputDialog("enter blood type ");
       String factor2 = JOptionPane.showInputDialog("enter blood factor ");
        
         BloodData blooddata1 = new BloodData(blood2, factor2);
         BloodData blooddata2 = new BloodData();
         
        String blood = blooddata1.getBloodtype();
        String factor = blooddata1.getRhfactor();
        System.out.println("blood typr is " + blood + " Rh factor is " + factor);
        
         String type = blooddata2.getBloodtype();
         String hr = blooddata2.getRhfactor();
         System.out.println("blood typr is " + type + " Rh factor is " + hr);
    }
}
