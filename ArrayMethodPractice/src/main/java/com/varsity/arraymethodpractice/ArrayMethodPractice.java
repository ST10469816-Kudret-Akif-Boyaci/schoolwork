/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.arraymethodpractice;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ArrayMethodPractice {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner inputdevice = new Scanner(System.in);
        
        System.out.println("enter number 1 ");
        int num1 = inputdevice.nextInt();
        
        System.out.println("enter number 2 ");
        int num2 = inputdevice.nextInt();
        
        Helper helper1 = new Helper();
        int result =helper1.addNumbers(num1, num2);
        System.out.println(result);
        
        double[] marks = new double[] { 100, 75, 48, 32, 11};
        double avg = helper1.calculateavg(marks);
        System.out.println("average is "+ avg);
        
        System.out.println("enter surname ");
         String surname = "boyaci";
         surname = inputdevice.next();
        char[] characters = helper1.getcharacters(surname);
        System.out.println("first letter is " +characters[0]);
         System.out.println("last letter is "+ characters[characters.length-1]);
    }
    
   
}
