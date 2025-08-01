/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.purchasearray;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PurchaseArray {

    public static void main(String[] args) {
        //      System.out.println("Hello World!");
        Scanner inputdevice = new Scanner(System.in);
        int num2 = 0;
        double amount = 0;
        //Purchase p1 = new Purchase();

        Purchase[] num1 = new Purchase[5];
        for (int i = 0; i < num1.length; i++) {

            while (true) {
                System.out.println("enter value for invoice " + (i + 1) + " between 1000 and 8000");
                num2 = inputdevice.nextInt();

                if (num2 >= 1000 && num2 <= 8000) {
                    break;
                } else {
                    System.out.println("invalid value");
                }
            }

            while (true) {
                System.out.println("enter value for sales");
                amount = inputdevice.nextDouble();

                if (amount >= 0) {
                    break;
                } else {
                    System.out.println("invalid value");
                }

            }
            Purchase purchase = new Purchase(num2, amount, (amount * 0.1));

            num1[i] = purchase;

        }
        for (Purchase purchase : num1) {
            System.out.println( purchase.toString());
        }
        Purchase temp2 = new Purchase();
      //  ascending
         for (int j = 0; j < num1.length -1; j++) {
        for (int i = 0; i < num1.length -1; i++) {
           
                if (num1[i].getSaleamount() > num1[i + 1].getSaleamount()) {
                    temp2 = num1[i];
                    num1[i] = num1[i + 1];
                    num1[i + 1] = temp2;

                }
            }

        } System.out.println("\n");
         for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
         //descending
         for (int j = 0; j < num1.length -1; j++) {
        for (int i = 0; i < num1.length -1; i++) {
           
                if (num1[i].getSaleamount() < num1[i + 1].getSaleamount()) {
                    temp2 = num1[i];
                    num1[i] = num1[i + 1];
                    num1[i + 1] = temp2;

                }
            }

        } System.out.println("\n");
         for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
