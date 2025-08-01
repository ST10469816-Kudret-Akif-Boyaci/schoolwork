/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.chapter9revision;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ArrayExamples {

    public static void main(String[] args) {

        char[] values = {'a', 'b', 'c', 'd'};
        JOptionPane.showMessageDialog(null, Arrays.toString(values));
        String inputvalue = JOptionPane.showInputDialog("enter value");

        char searchvalue = inputvalue.charAt(0);

        Arrays.sort(values);
        JOptionPane.showMessageDialog(null, Arrays.toString(values));

        int index = Arrays.binarySearch(values, searchvalue);

        JOptionPane.showMessageDialog(null, "found at index => " + index);

        int numbers[] = new int[5];

        JOptionPane.showMessageDialog(null, Arrays.toString(numbers));

        Arrays.fill(numbers, 5);

        JOptionPane.showMessageDialog(null, Arrays.toString(numbers));

    }
}
