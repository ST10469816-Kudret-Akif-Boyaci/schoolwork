/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.numbersdemo;

/**
 *
 * @author lab_services_student
 */
public class NumbersDemo {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        displayTwiceTheNumber(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num1);
        displayNumberPlusFive(num2);
        displayNumberSquare(num1);
        displayNumberSquare(num2);
        

    }

    public static void displayTwiceTheNumber(int number) {
        int twice = number * 2;
        System.out.println(twice);

    }
    
    public static void displayNumberPlusFive(int number){
    int plusFive = number + 5;
    System.out.println(plusFive);
    }
    
    public static void displayNumberSquare(int number){
    int squared = number * number;
    System.out.println(squared);
    }
}
