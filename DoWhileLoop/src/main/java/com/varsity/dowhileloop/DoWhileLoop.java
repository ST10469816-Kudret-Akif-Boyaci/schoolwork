/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.dowhileloop;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class DoWhileLoop {

    public static void main(String[] args) {
        //   System.out.println("Hello World!");
        Scanner inputdevice = new Scanner(System.in);
        System.out.println("please enter username");
        String uname1 = inputdevice.nextLine();

        String psw1 = "";

        do {
            System.out.println("enter password");
            psw1 = inputdevice.nextLine();
        } while (!psw1.equals("1234"));
        System.out.println("Access granted");

    }
}
