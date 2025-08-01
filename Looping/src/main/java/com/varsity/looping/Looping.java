/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.looping;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Looping {

    public static void main(String[] args) {
        //  System.out.println("Hello World!");
        Scanner inputdevice = new Scanner(System.in);

        // Scanner inputdevice = new Scanner(System.in);
        System.out.println("How many products do you want to capture");
        int num1 = inputdevice.nextInt();

        int counter = 0;  //sentinel. controller
        double total = 0;

        while (counter < num1) {
            counter = counter + 1;
            System.out.println("Price for product " + counter);
            double price1 = inputdevice.nextDouble();
            total += price1;

        }

//     System.out.println("Price for product 1");
//     double price1 = inputdevice.nextDouble();
//     
//      System.out.println("Price for product 2");
//     double price2 = inputdevice.nextDouble();
        System.out.println(total);
    }
}
