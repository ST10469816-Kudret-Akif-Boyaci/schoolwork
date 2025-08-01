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
public class SquareForLoop {

    public static void main(String[] args) {
        Scanner inputdevice = new Scanner(System.in);
        System.out.println("How many characters should be in the side of the square?");
        int squareno = inputdevice.nextInt();
        int increase = squareno;
        System.out.println("Increase by how many?");
        int incby = inputdevice.nextInt();

        for (int x = 1; x <= squareno; x++) {

            for (int y = 1; y <= increase; y++) {
                System.out.print("*");

            }
            increase = increase + incby;
            System.out.print("\n");
        }

    }
}
