/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.comparison;

/**
 *
 * @author lab_services_student
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] num1 = { 90, 85, 65, 95, 75};
        int a =1;
                
        while (a< num1.length) {            
            int temp1 = num1[a];
            int b = a-1;
            while (b >= 0 && num1[b] > temp1) {                
                num1[b+1] = num1[b];
                --b;
            }
            ++a;
            num1[b+1] = temp1;
        }
         for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
         }
    }
}
