/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.comparison;

/**
 *
 * @author lab_services_student
 */
public class Comparison {

    public static void main(String[] args) {

        int vara = 16;
        int varb = 2;
        int temp1 = 0;
        int temp2 = 0;

        System.out.println("value of A is => " + vara);
        System.out.println("value of B is => " + varb);

        if (vara > varb) {
            temp1 = vara;
            vara = varb;
            varb = temp1;

        }
        System.out.println("value of A is => " + vara);
        System.out.println("value of B is => " + varb);

        int[] num1 = {88, 33, 99, 22, 54};

        //Sort ascending
        for (int ii = 0; ii < num1.length - 1; ii++) {
            for (int i = 0; i < num1.length - 1; i++) {

                if (num1[i] > num1[i + 1]) {
                    temp2 = num1[i];
                    num1[i] = num1[i + 1];
                    num1[i + 1] = temp2;

                }
            }
        }
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
        System.out.println("\n");

        //Descending order
        for (int ii = 0; ii < num1.length - 1; ii++) {
            for (int i = 0; i < num1.length - 1; i++) {

                if (num1[i] < num1[i + 1]) {
                    temp2 = num1[i];
                    num1[i] = num1[i + 1];
                    num1[i + 1] = temp2;

                }
            }
        }
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }

}
