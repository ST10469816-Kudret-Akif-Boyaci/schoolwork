/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.preparetax;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class PrepareTax {

    public static void main(String[] args) {
        //   System.out.println("Hello World!");

          Scanner inputdevice = new Scanner(System.in);

            System.out.println("are you married or single");
        String maritalstatus1 = inputdevice.nextLine();

        System.out.println("enter your name");
        String name1 = inputdevice.nextLine();

        System.out.println("enter your surname");
        String surname1 = inputdevice.nextLine();

        System.out.println("enter your social security number");
        String socialsec1 = inputdevice.nextLine();

        System.out.println("enter your street");
        String street1 = inputdevice.nextLine();

        System.out.println("enter your city");
        String city1 = inputdevice.nextLine();

        System.out.println("enter your state");
        String state = inputdevice.nextLine();

        System.out.println("enter your zip code");
        String zip1 = inputdevice.nextLine();
        
        System.out.println("enter your annual income");
        double annualincome1 = inputdevice.nextDouble();

      
//                System.out.println("enter your");
//        String inputname = inputdevice.nextLine();
        while (annualincome1 <= 0) {
            System.out.println("enter your annual income");
            annualincome1 = inputdevice.nextDouble();
        }
        while (socialsec1.length() < 11 || socialsec1.length() > 11 && socialsec1.charAt(4)!= '-' && socialsec1.charAt(6)!= '-') {
            System.out.println("enter your social security number");
            socialsec1 = inputdevice.nextLine();
        }

        while (zip1.length() < 5 || zip1.length() > 5) {

            System.out.println("enter your zip code");
            zip1 = inputdevice.nextLine();

        }
        while (!maritalstatus1.startsWith("S") || !maritalstatus1.startsWith("s") || !maritalstatus1.startsWith("M") || !maritalstatus1.startsWith("m")) {
            System.out.println("are you married or single");
            maritalstatus1 = inputdevice.nextLine();
        }

        double taxreturn =0;
        if (annualincome1 <=20000 && maritalstatus1.startsWith("S") || maritalstatus1.startsWith("s")){
            taxreturn = annualincome1/0.15;
        }else if (annualincome1 <=20000 && maritalstatus1.startsWith("M") || maritalstatus1.startsWith("m")){
            taxreturn = annualincome1/0.14;
        }else if (annualincome1 <=50000 && maritalstatus1.startsWith("M") || maritalstatus1.startsWith("m")){
            taxreturn = annualincome1/0.20;
        }else if (annualincome1 <=50000 && maritalstatus1.startsWith("S") || maritalstatus1.startsWith("s")){
            taxreturn = annualincome1/0.22;
        }else if (annualincome1 >=50000 && maritalstatus1.startsWith("S") || maritalstatus1.startsWith("s")){
            taxreturn = annualincome1/0.30;
        }else if (annualincome1 >=50000 && maritalstatus1.startsWith("M") || maritalstatus1.startsWith("m")){
            taxreturn = annualincome1/0.28;
        }
        System.out.println("tax return is"+ taxreturn);
    }

}
