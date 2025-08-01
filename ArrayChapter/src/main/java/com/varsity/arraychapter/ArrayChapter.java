/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.arraychapter;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ArrayChapter {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        int number = 50;

        //declaration
        int num;
        String name;

        //int[] numbers = new int[5];
        int[] numbers;
        String[] names;
        //double[] marks;
        char[] letters;
        boolean[] options;

        //initialize
        numbers = new int[5];
        numbers[0] = 10;  //element
        numbers[1] = 15;
        numbers[2] = 50;
        numbers[3] = 60;
        numbers[4] = 80;
        System.out.println(numbers[2]);

        double[] marks = new double[]{20.5, 15.2, 70.8, 80.2, 100, 5};

        String[] carmodels;
        String[] models = new String[10];

        String[] teams = new String[5];
        teams[0] = "galatasaray";
        teams[1] = "fenerbahce";
        teams[2] = "besiktas";
        teams[3] = "trabzonspor";
        teams[4] = "denizlispor";

        System.out.println(numbers[3] + " " + marks[0] + " " + teams[4]);
        JOptionPane.showMessageDialog(null," number at 4 is " + numbers[3] + "\n marks at 1 is " + marks[0] + "\n teams at 5 " + teams[4]);
        
        System.out.println(teams.length + " is the number of elements in the array");
       
        int firstindex = 0;
        int lastindex = teams.length -1;
        JOptionPane.showMessageDialog(null, "first index is "+ firstindex + "\n last index is " + lastindex);
        
        JOptionPane.showMessageDialog(null, teams[lastindex]);
        
        teams[4] = "ankaraspor";
        System.out.println(teams[4]+ "\n");
        
        //part2
        
        String[] names2 = new String[] {"Steven", "lerato", "marie", "sandile"};
        
        int counter = 0;
        
       for (counter =0; counter <= names2.length-1; counter++) {
        
        System.out.println(names2[counter]);
       }
    //    System.out.println(counter);
    
    //enhanced loop
        for (String name2 : names2) {
            System.out.println(name2);
            
        }
    }
}
