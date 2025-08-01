/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.recordingsort;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class RecordingSort {

    public static void main(String[] args) {
        //  System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);

        Recording[] rec1 = new Recording[2];
        
            
        
        System.out.println("enter  song title");
        String title1 = scan.nextLine();
        
        System.out.println("enter  song artist");
        String artist1 = scan.nextLine();
        
        System.out.println("enter  song playtime");
        double play1 = scan.nextDouble();
        
               
        Recording r1 = new Recording(title1, artist1, play1);
        
        
        
        System.out.println("enter  song title");
        String title2 = scan.next();
        
        System.out.println("enter  song artist");
        String artist2 = scan.next();
        
        System.out.println("enter  song playtime");
        double play2 = scan.nextDouble();
        
        
        System.out.println("Sort by what?");
        String sort2 = scan.nextLine();
       
        Recording r2 = new Recording(title2, artist2, play2);
        
        rec1[0] =r1;
        rec1[1] = r2;
        
        for (int i = 0; i < rec1.length; i++) {
            System.out.println(rec1[i]);
        }
        Recording temp2 ;
        for (int j = 0; j < rec1.length-1; j++) {
            for (int i = 0; i < rec1.length-1; i++) {
               // if (play2 <= play1)) {
                    
                    temp2 = rec1[i];
                    rec1[i] = rec1[i + 1];
                    rec1[i + 1] = temp2;

            //    }
                }
                
            }
        
        
           String title3 = "";
            String artist3 = "";
        double amount = 0;
        //Purchase p1 = new Purchase();

        Recording[] rec2 = new Recording[5];
        for (int i = 0; i < rec2.length; i++) {

            while (true) {
                System.out.println("enter value for song title " + (i + 1) );
                title3 = scan.next();

                break;
            }
while (true) {
                System.out.println("enter value for song artist " + (i + 1) );
                artist3 = scan.next();

                break;
            }
            while (true) {
                System.out.println("enter value for playtime");
                amount = scan.nextDouble();

                if (amount >= 0) {
                    break;
                } else {
                    System.out.println("invalid value");
                }

            }
            Recording purchase = new Recording(title3, artist3, amount );

            rec2[i] = purchase;
        }
    }
}

