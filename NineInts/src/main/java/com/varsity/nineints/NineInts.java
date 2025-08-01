/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.nineints;

/**
 *
 * @author lab_services_student
 */
public class NineInts {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
        
        int[] nine = new int[9];
        nine[0] = 1;
        nine[1] = 2;
        nine[2] = 2;
        nine[3] = 3;
        nine[4] = 4;
        nine[5] = 5;
        nine[6] = 6;
        nine[7] = 7;
        nine[8] = 8;
        
        
        System.out.println("ascending order: ");
        for (int i = 0; i < nine.length; i++) {
            System.out.println(nine[i]);
            
        }
        
        System.out.println("\n descending order; ");
        for (int i = nine.length-1; i >= 0; i=i-1) {
            System.out.println(nine[i]);
        }
        
        
        
        
        
    }
}
