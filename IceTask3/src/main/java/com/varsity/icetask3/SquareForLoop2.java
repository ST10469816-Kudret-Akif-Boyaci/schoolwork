/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.icetask3;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class SquareForLoop2 {

    public static void main(String[] args) {
        Scanner inputdevice = new Scanner(System.in);

        System.out.println("How many characters should be in each row of the square?");
        int squarehor = inputdevice.nextInt();
        System.out.println("How many rows should there be?");
        int squarever = inputdevice.nextInt();

        // String horline = "";
        for (int x = 1; x <= squarever; x++) {

            for (int y = 1; y <= squarehor; y++) {
                System.out.print("*");

            }
            //squarehor++;
            System.out.print("\n");
        }

    }
}
