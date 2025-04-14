/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.poepart1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class POEpart1 {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
       // char targetchar= "_"
        Scanner inputdevice = new Scanner(System.in);
        
        System.out.println(" please set up a valid username of maximum 5 characters with an underscore.");
        String uname1 = inputdevice.nextLine();
        char targetchar= '_';
//       //
//       boolean abc = login.checkusername(uname1);
//       
//       if (abc == true){
//           System.out.println("Hello World!");
//       }else if (abc == false){
//            System.out.println("hi World!");
//       }
     //
        if (uname1.indexOf(targetchar) != -1 && uname1.length() <= 5){
            System.out.println(" Username successfully captured \n ");
        } else {
            System.out.println(" invalid username. \n username must contain maximum 5 characters with an underscore. \n ");
       //  System.exit(0);
        }
         System.out.println(" please set up a valid password of atlest 8 characters \n with a cappital letter, a number and a special character.");
        String psw1 = inputdevice.nextLine();
        
        if (psw1.length() >= 8 && psw1.matches(".*[A-Z].*") && psw1.matches(".*[^a-zA-Z0-9].*") && psw1.matches(".*\\d.*") ){
             System.out.println(" Password successfully captured \n ");
        } else {
            System.out.println(" invalid password. \n password must contain atlest 8 characters with a cappital letter, a number and a special character. \n ");
       //  System.exit(0);
        }
        
        System.out.println(" please enter a valid south african phone number");
        String pnum1 = inputdevice.nextLine();
        
        if (pnum1.length() <= 13 && pnum1.startsWith("+27")){
             System.out.println(" Phone number successfully captured \n ");
        } else {
            System.out.println(" invalid Phone number. \n Phone number must contain the country code of +27 followed by maximum of 10 characters \n ");
       //  System.exit(0);
        }
       // System.out.println(login.checkusername(uname1));
       
       System.out.println(" please login   \n please enter your username ");
       String uname2 = inputdevice.nextLine();
       
        System.out.println("\n please enter your password");
       String psw2 = inputdevice.nextLine();
       
       if (uname2.equals(uname1) && psw2.equals(psw1)){
            System.out.println(" Username and password is correct  \n welcome "+ uname1+" \n ");
        } else {
            System.out.println(" username or password is incorrect please try again. \n ");
         System.exit(0);
        }
    }
  }
