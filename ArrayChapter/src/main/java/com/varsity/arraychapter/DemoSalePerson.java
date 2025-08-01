/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.arraychapter;

/**
 *
 * @author lab_services_student
 */
public class DemoSalePerson {
    public static void main(String[] args) {
        int[] idnum = new int[10];
        double[] sale = new double[10];
             for (int i = 0; i < 10; i++) {
            idnum[i] = 9999;
            sale[i] = 0;
        }
             for (int i = 0; i < 10; i++) {
                 System.out.println(idnum[i]);
                 System.out.println(sale[i]);
        }
    }
}
