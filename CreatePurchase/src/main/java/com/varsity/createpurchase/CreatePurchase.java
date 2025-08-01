/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.createpurchase;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class CreatePurchase {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner inputdevice = new Scanner(System.in);

//        double abc = purchase.saleamount(100);
//        System.out.println(abc);
//        
        purchase p1 = new purchase();

//        
//        p1.setSale1(100);
//        System.out.println(  p1.setSale1(100));
        int invoice = 0;
        int min = 1000;
        int max = 8000;

        do {
            System.out.println(" enter invoice");
            invoice = inputdevice.nextInt();

        } while (invoice < min || invoice > max);

        System.out.println("enter sales amount");
        double sale1 = inputdevice.nextDouble();

        //    double tax1 = purchase.saleamount(sale1);
        p1.setSale1(sale1);
        double tax1 = p1.getSale1();
        //  double tax1 = sale1*(0.05);
        System.out.println("invoice number is " + invoice + "\n sale amount is " + sale1 + "\n tax amount is " + tax1);

    }
}
