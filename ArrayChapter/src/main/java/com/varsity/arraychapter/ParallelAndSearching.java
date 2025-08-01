/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.arraychapter;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ParallelAndSearching {
    public static void main(String[] args) {
        
        String[] names = new String[] {  "steven", "Trena", "Destiny", "edward", "tivana"};
        String[] surnames = new String[] { "nadaye", "fourie", "shomo", "kenneway", "amicia"};
        double[] marks = new double[]{ 100, 90, 67, 89, 65};
        
        
        for (int i = 0; i < names.length; i++) {
            
            System.out.println("student with name " + names[i] + " and surname of "+ surnames[i] + " has the marks of " + marks[i]);
            
        }
        System.out.println("\n");
        String[] fruits = new String[] { "banana", "apple", "orange", "cherry", "pear"};
        double[] price = new double[]{ 45, 30, 25, 40, 16};
        
        for (int i = 0; i < fruits.length; i++) {
            
            System.out.println("the fruit  " + fruits[i] +   " has the price of " + price[i]);
            
        }
        System.out.println("\n");
        String[] teams = new String[] { "A", "B", "C", "D", "E"};
        int[] points = new int[] {45, 30, 25, 40, 16};
        String myteam = "B";
        int counter = 0;
        while (!teams[counter].equals(myteam) ){
            counter++;
            
        } System.out.println("yout team is " +teams[counter] + points[counter] +  " position is " +(counter+1));
        
        String myteam2 = JOptionPane.showInputDialog("name of your team? ");
        
        System.out.println( findteam(teams, myteam2));
    }
    
    private static int findteam(String[] teams,String searchkey){
            int position = -1;
            
            for (int i = 0; i < teams.length; i++) {
                if (teams[i].equals(searchkey)){
                    position = i +1;
                    break;
                }
                    
            }return position;
    }
}
