/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.evenentryloop;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class EvenEntryLoop {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
       Scanner inputdevice = new Scanner(System.in);
      
      int num1 =0;
      System.out.println("enter even number or 999 to terminate!");
    
      
      while (num1 != 999){
            num1 = inputdevice.nextInt();
         int num2 = num1%2;
         
         if (num2 == 0){
             System.out.println("Good Job");
         } else {
              System.out.println("error, try again");
         }
      }
      
    }
}
