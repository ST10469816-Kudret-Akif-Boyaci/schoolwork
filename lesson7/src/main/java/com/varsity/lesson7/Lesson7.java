/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.lesson7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Lesson7 {

    public static void main(String[] args) {
        // System.out.println("Hello World!");

        String name1 = "steven";
        String surname = new String("ndaye");

        Scanner inputdevice = new Scanner(System.in);

        System.out.println("confirm your name");
        String inputname = inputdevice.nextLine();

        if (name1.equals(inputname)) {
            System.out.println("correct");
        } else {
            System.out.println("not correct");
        }
        char val = 'A';
        if (Character.isUpperCase(val)) {
            System.out.println("yes," + val + " is uppercase");

        }
        char touppercase = Character.toUpperCase(val);
        System.out.println(touppercase + " is uppercase");

        char tolowercase = Character.toLowerCase(val);
        System.out.println(tolowercase + " is lowercase");

        char numval = '7';
        char stringval = 'A';

        if (Character.isLetter(numval)) {
            System.out.println("it is a letter");
        } else {
            System.out.println("it is a number");
        }
        if (Character.isLetter(stringval)) {
            System.out.println("it is a letter");
        } else {
            System.out.println("it is a number");
        }

        System.out.println("enter a letter or digit");
        char input1 = inputdevice.nextLine().charAt(0);
//      char input1 = JOptionPane.showInputDialog(enter a character)

        if (Character.isLetter(input1)) {
            if (Character.isUpperCase(input1)) {
                System.out.println(input1 + " is a letter and " + input1 + " is Uppercase");
            } else {
                System.out.println(input1 + " is a letter and " + input1 + " is Lowercase");
            }

        } else {
            System.out.println("it is a number");
        }

        String name2 = "akif";
        System.out.println(name2.startsWith("ak"));
        System.out.println(name2.startsWith("Ak"));

        System.out.println(name2.endsWith("if"));
        System.out.println(name2.endsWith("Ak"));

        String regnum = "KJ 89 YR GP";
        System.out.println("before replacement" + regnum);

        regnum = regnum.replace(" ", "-");
        System.out.println("after replacement" + regnum);

        String intvalue = "15";
        int vnum = Integer.parseInt(intvalue);

        String doubleval = "20.5";
        double dnum = Double.parseDouble(doubleval);

        Integer testint = 15;
        Double testdouble = 20.5;

        String returnint = testint.toString();
        String returndouble = testdouble.toString();

        Student s1 = new Student("Akif", "boyaci", "123456789");
        System.out.println(s1.toString());

        String greet = "good morning";
        System.out.println(greet.substring(5, 12));
        System.out.println(greet.substring(4)); // character 4 and onwards
        
        StringBuilder build = new StringBuilder("stringbuilder");
        System.out.println(build);
        System.out.println(build.capacity());
        System.out.println(build.insert(6, " "));
        System.out.println(build.append(" append"));
        
  //       StringBuilder build = "hello";  this is wrong
    }
}
