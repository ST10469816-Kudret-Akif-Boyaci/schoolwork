/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.poepart2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class POEpart1 {

    public static void main(String[] args) {

        Scanner inputdevice = new Scanner(System.in);

        System.out.println(" please set up a valid username of maximum 5 characters with an underscore.");
        String uname1 = inputdevice.nextLine();
//        char targetchar = '_';

        boolean unamecheck = login.checkusername(uname1);
        while (unamecheck == false) {

            System.out.println(" Invalid username. \n username must contain maximum 5 characters with an underscore. \n ");

            System.out.println(" Please set up a valid username of maximum 5 characters with an underscore.");
            uname1 = inputdevice.nextLine();
            unamecheck = login.checkusername(uname1);

        }
        System.out.println(" Username successfully captured \n ");

        System.out.println(" please set up a valid password of atlest 8 characters \n with a cappital letter, a number and a special character.");
        String psw1 = inputdevice.nextLine();

        boolean pswcheck = login.checkpasswordcomplexity(psw1);
        while (pswcheck == false) {

            System.out.println(" Invalid password. \n password must contain atlest 8 characters with a cappital letter, a number and a special character. \n ");

            System.out.println(" Please set up a valid password of atlest 8 characters \n with a cappital letter, a number and a special character.");
            psw1 = inputdevice.nextLine();
            pswcheck = login.checkpasswordcomplexity(psw1);

        }
        System.out.println(" Password successfully captured \n ");

        System.out.println(" please enter a valid south african phone number");
        String pnum1 = inputdevice.nextLine();

        boolean numcheck = login.checkCellPhoneNumber(pnum1);
        while (numcheck == false) {

            System.out.println("invalid Phone number. \n Phone number must contain the country code of +27 followed by maximum of 10 characters \n ");

            System.out.println(" please enter a valid south african phone number");
            pnum1 = inputdevice.nextLine();
            numcheck = login.checkCellPhoneNumber(pnum1);

        }
        System.out.println(" Phone number successfully captured \n ");

        System.out.println(" please login   \n please enter your username ");
        String uname2 = inputdevice.nextLine();

        System.out.println("\n please enter your password");
        String psw2 = inputdevice.nextLine();

        boolean logincheck2 = login.checkLogin(psw1, psw2, uname1, uname2);
        //   System.out.println(unamecheck2);
        System.out.println(login.checkloginststus(psw1, psw2, uname1, uname2));
        // while (unamecheck2 == false || pswcheck2 == false) {
        while (logincheck2 == false) {
            //  while (!uname2.equals(uname1) || !psw2.equals(psw1)) {

            System.out.println(" username or password is incorrect please try again. \n ");

            System.out.println(" please login   \n please enter your username ");
            uname2 = inputdevice.nextLine();

            System.out.println("\n please enter your password");
            psw2 = inputdevice.nextLine();

            logincheck2 = login.checkLogin(psw1, psw2, uname1, uname2);
            System.out.println(login.checkloginststus(psw1, psw2, uname1, uname2));
        }
        System.out.println(" Username and password is correct  \n welcome " + uname1 + " \n ");

//        if (uname2.equals(uname1) && psw2.equals(psw1)) {
//            System.out.println(" Username and password is correct  \n welcome " + uname1 + " \n ");
//        } else {
//            System.out.println(" username or password is incorrect please try again. \n ");
//            System.exit(0);
//        }
        if (logincheck2 == true) {
            POEpart2.main(new String[0]);

        }
    }
}
