/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.arrayexercise;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ArrayExercise {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
      
        Scanner inputdevice = new Scanner(System.in);
        
        System.out.println("how many marks do you want to enter?");
        int num1 = inputdevice.nextInt();
        
      
        double[] marks = new double[num1];
        
        int counter = 0;
        
        for (counter =0; counter <= num1-1; counter++) {
            System.out.println("enter the mark no "+ (counter+1));
            double entermark = inputdevice.nextDouble();
            marks[counter]= entermark;
        }
        double average = 0;
        double total = 0;
      //  System.out.println(marks[2]);
      int counter2 = 0;
      
      for (counter2 =0; counter2 <= num1-1; counter2++) {
            //System.out.println("math");
//            double entermark = inputdevice.nextDouble();
           total= total +marks[counter2];
        }
    
      average = total/num1;
      //  System.out.println(total);
        System.out.println("average is "+average);
              }
    
    
}
