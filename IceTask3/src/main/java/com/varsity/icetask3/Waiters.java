/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.icetask3;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Waiters {

    public static void main(String[] args) {
        //  System.out.println("Hello World!");
        Scanner inputdevice = new Scanner(System.in);
        
        
        int numwaiter = 4;
        double workhr = 7.5;
        double tip0 = 0;
//        double tip1 = 350;
//        double tip2 = 450.8;
//        double tip3 = 500.8;
//        double tip4 = 300;
        double tiptotal = 0;
        double tipavg = 0;
        double tiphr = 0;
        
        System.out.println("enter the no of waiters");
            numwaiter = inputdevice.nextInt();

        // for (int x = 1; x= 4; x++){
        for (int x = 1; x <= numwaiter; x++) {
            System.out.println("enter the no " + x + " waiters tip.");
            tip0 = inputdevice.nextDouble();
            tiptotal = tiptotal + tip0;
           // tiptotal = tip1 + tip2 + tip3 + tip4;

        }
        tipavg = tiptotal / numwaiter;
        tiphr = tiptotal / (workhr*numwaiter);

        System.out.println("the average tips per person is " + tipavg);
        System.out.println("the average tips per hour is " + tiphr);

    }
}
