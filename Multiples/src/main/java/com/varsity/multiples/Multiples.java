/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multiples;

import java.util.Scanner;

/**
 *
 * @author m14mu
 */
public class Multiples {

    public static void main(String[] args) {

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Where do you want to start from ?");
        int start = inputDevice.nextInt();

        System.out.println("Where do you want to end ");
        int end = inputDevice.nextInt();
        
        int sumMultiple3 = 0;
        int sumMultiple5 = 0;
        int sumMultiple3and5 = 0;
        
        int totalMultiple3 = 0;
        int totalMultiple5 = 0;
        int totalMultiple3and5 = 0;
        
        
        int unknowns = 0;
        int totalUnknowns = 0;

//        for (int x = 0; x < 100; x++) {
//
//        }
        for (int x = start; x <= end; x++) {

            if (x % 5 == 0 && x % 3 == 0) {
                System.out.println("This number " + x + " is both a multiple of 3 and 5 ");
                sumMultiple3and5++;
                totalMultiple3and5 += x;
            } else {
                if (x % 5 == 0) {
                    System.out.println("This number " + x + " is a multiple of 5 ");
                    sumMultiple5++;
                    totalMultiple5 += x;
                } else if (x % 3 == 0) {
                    System.out.println("This number " + x + " is a multiple of 3 ");
                    sumMultiple3++;
                    totalMultiple3 += x;
                } else {
                    System.out.println("This number " + x + " is nether a multiple of 5 nor 3 ");
                    unknowns++;
                    totalUnknowns += x;
                }
            }

        }

        System.out.println("Sum of multiple of 3 => " + sumMultiple3);
        System.out.println("Sum of multiple of 5 => " + sumMultiple5);
        System.out.println("Sum of multiple of 3 and 5 => " + sumMultiple3and5);
        System.out.println("Sum of unknowns => " + unknowns);
       
        System.out.println("total of multiple of 3 => " + totalMultiple3);
        System.out.println("tota; of multiple of 5 => " + totalMultiple5);
        System.out.println("total of multiple of 3 and 5 => " + totalMultiple3and5);
        System.out.println("total of unknowns => " + unknowns);

        
        
//        for(int y = 100; y > 0; y--) {
//           
//        }
    }
}
