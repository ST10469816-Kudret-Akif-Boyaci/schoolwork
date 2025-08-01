/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.nineints;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class DistanceFromAverage {
     public static void main(String[] args) {
         Scanner inputdevice = new Scanner(System.in);
         
        double num1 =0;
        int i = 0;
         double[] list = new double[15];
         while(num1 != 99999){
             System.out.println("enter a value ");
             num1 = inputdevice.nextDouble();
          //   list = new double[i+1];
            if(num1 != 99999){
             list[i]= num1;
             
             i++;
            }
         }
         
         double avg = 0;
         double total = 0;
         
         for (int j = 0; j < list.length; j++) {
           total =total + list[j];  
         }
         
         avg = total/i;
         
         System.out.println("total " + total);
         System.out.println("avg " +avg );
         if (list[0] == 0){
             System.out.println("Error");
         }else {
             for (int j = 0; j < list.length; j++) {
                if (list[j] != 0.0) {
                 System.out.println("number is " + list[j]);
                 System.out.println("distance from average is " +(avg-list[j]));
                }
             }
         }
         
     }
}
