/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.shadyrestroom;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ShadyRestroom {

    public static void main(String[] args) {
        //   System.out.println("Hello World!");

        Scanner inputdevice = new Scanner(System.in);

        System.out.println("welcome to our shady hotel. \n" + "we have the following room types. \n" + " 1. for queen bed.\n 2. for king bed.\n 3. for suite room" + " \nplese enter which one you would like.");
        int num1 = inputdevice.nextInt();
        double price = 0;
        int view1 =0;

        if (num1 == 1) {
            price = 125;
            System.out.println(" price of your room type " + num1 + " is $" + price);
        } else if (num1 == 2) {
            price = 139;
            System.out.println(" price of your room type " + num1 + " is $" + price);
        } else if (num1 == 3) {
            price = 165;
            System.out.println(" price of your room type " + num1 + " is $" + price);
        } else {
            price = 0;
            System.out.println(price + " invalid input");
        }

        if (num1 == 1 || num1 == 2 || num1 == 3) {
            System.out.println("we have the following view types. \n" + " 1. for lake view. \n 2. for park view. \nplese enter which one you would like.");
            view1 = inputdevice.nextInt();

            if (view1 == 1) {
                price = price + 15;
            } else if (view1 == 2) {
                price = price + 0;
            } else {
                price += 15;
                System.out.println(" invalid input");
            }

        }
        System.out.println(" price of your room type " + num1 + " and view type " + view1 + " is $" + price);
    }
}

