/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.purchasearray;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TwoDimensionArray {

    public static void main(String[] args) {
        int[] num1 = new int[5];

        double salaries[][] = new double[4][3];

        //initilase
        num1[0] = 10;
        num1[1] = 11;
        num1[2] = 12;
        num1[3] = 13;
        num1[4] = 14;

        salaries[0][0] = 10;
        salaries[0][1] = 20;
        salaries[0][2] = 50;

        salaries[1][0] = 100;
        salaries[1][1] = 20;
        salaries[1][2] = 300;

        salaries[3][2] = 100;

        int num2[] = {10, 30, 20, 78, 90};

        double price[][] = {{100, 200, 400}, {300, 250, 350}, {500, 122, 345}, {1000, 700, 650}};

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
        System.out.println("");
        for (int i = 0; i < price.length; i++) {
            String output = "";
            for (int j = 0; j < price[i].length; j++) {
                output += price[i][j] + " ";
                System.out.println(price[i][j]);
            }
            System.out.println("\n"+ output);
        }

        for (int i = 0; i < num2.length; i++) {
            JOptionPane.showInputDialog("enter value for " + (i+1));
        }
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
        
        double marks[][] = new double [4][3];
        for (int i = 0; i < marks.length; i++) {
           System.out.println("capturing marks for student  " + (i+1)); 
            Scanner inputdevice = new Scanner(System.in);
            System.out.println("enter value for " + (i+1)); 
        }
        
    }
}
