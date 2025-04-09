/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.evenodd;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class EvenOdd {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
      
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter an integer"));
      
      int num2 = num1%2;
      
      if (num2 == 0){
          JOptionPane.showMessageDialog(null, "even number");
      } else{
           JOptionPane.showMessageDialog(null, "odd number");
      }
    }
}
