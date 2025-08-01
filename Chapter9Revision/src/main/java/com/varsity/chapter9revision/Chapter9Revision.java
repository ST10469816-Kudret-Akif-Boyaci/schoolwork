/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.chapter9revision;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Chapter9Revision {

    public static void main(String[] args) {
        // System.out.println("Hello World!");

        //create, initialise, and fill.
        int[] num1 = new int[5];

        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;
        num1[3] = 40;
        num1[4] = 50;

        double[] prices = {12.5, 45.4, 50, 90.20, 100};

        //display
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        //change element
        prices[3] = 150.75;
        System.out.println(prices[3]);

        //creating a array of objects
        person[] people = new person[2];

        person p1 = new person(12, "steven", "ndaye", 40);
        person p2 = new person(13, "john", "ndaye", 30);

        people[0] = p1;
        people[0] = p2;

        //compared toarrays of string
        String[] names = new String[2];

        String name1 = "steven";
        String name2 = "john";

        names[0] = name1;
        names[1] = name2;

        //removing or deleting
        num1[2] = 0;
        names[0] = null;

        //searching
        String[] teams = {"team a", "team b", "team c", "team d", "team e"};

        String search = JOptionPane.showInputDialog("which team do you want to search for");

        for (int i = 0; i < teams.length; i++) {
            String teamsearch = teams[i];

            if (teamsearch.equals(search)) {
                System.out.println("the " + teamsearch + " is located at number " + (i + 1));
            }
        }

        //aggregate and find average price
        double total = 0;
        for (double price : prices) {
            total += price;

        }

        double avg = total / prices.length;
        System.out.println(avg);
    }
}
