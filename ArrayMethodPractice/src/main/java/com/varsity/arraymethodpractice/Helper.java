/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.arraymethodpractice;

/**
 *
 * @author lab_services_student
 */
public class Helper {

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public double calculateavg(double[] marks) {
        double total = 0;
        for (int i = 0; i <= marks.length - 1; i++) {
            total = total + marks[i];
        }
        return total / marks.length;
    }

    public char[] getcharacters(String surname) {
        int size = surname.length();

        char[] characters = new char[size];

        for (int i = 0; i < size; i++) {
            characters[i] = surname.charAt(i);

        }
        return characters;
    }
}
