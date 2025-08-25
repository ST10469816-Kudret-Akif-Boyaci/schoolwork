/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.practicalassignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class PracticalAssignment {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner inputdevice = new Scanner(System.in);
        Series s1 = new Series();

        int option1;

        System.out.println("LATEST SERIES - 2025");
        System.out.println("**************************************");

        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            String launch = inputdevice.nextLine();

            if (launch.equals("1")) {

                System.out.println("""
                           Please select one of the following menu items 
                           (1): Capture a new series
                           (2): Search for a new series
                           (3): Update series age restriction
                           (4): Delete a series
                           (5): Print series report - 2025
                           (6): Exit application
                           please enter the number corresponding to the option chosen""");
                option1 = inputdevice.nextInt();
                inputdevice.nextLine();
                if (option1 == 1) {
                    s1.captureseries();
                } else if (option1 == 2) {
                    System.out.println(s1.searchseries());
                } else if (option1 == 3) {
                    System.out.println(s1.updatesries());
                } else if (option1 == 4) {
                    System.out.println(s1.deleteseries());
                } else if (option1 == 5) {
                    s1.seriesreport();
                } else if (option1 == 6) {
                    s1.exitseriesapplication();
                }

            } else {
                System.exit(0);
            }

        }
    }
}
