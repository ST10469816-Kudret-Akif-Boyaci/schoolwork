/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.nineints;

/**
 *
 * @author lab_services_student
 */
public class MethodHelper {

    public void getascending(int[] nine) {
        // int size = surname.length();

        //   char[] characters = new char[size];
//        for (int i = 0; i < size; i++) {
//            characters[i] = surname.charAt(i);
        System.out.println("ascending order: ");
        for (int i = 0; i < nine.length; i++) {
            System.out.println(nine[i]);

        }

    }

    public void getdescending(int[] nine) {

        System.out.println("descending order: ");
        for (int i = nine.length - 1; i >= 0; i = i - 1) {
            System.out.println(nine[i]);

        }
    }

    public void getotal(int[] nine) {
        int total = 0;
        System.out.println("total: ");
        for (int i = 0; i < nine.length; i++) {
            total = total + nine[i];

//            System.out.println(total);
        }
        System.out.println(total);
    }

    public void limiter(int[] nine) {

        System.out.println("numbers les than 5: ");

        int limit = 5;
        for (int i = 0; i < nine.length; i++) {
//           total = total+ nine[i];

            if (nine[i] < limit) {
                System.out.println(nine[i]);
            }

//            System.out.println(total);
        }
        // System.out.println(total);
    }
    
     public void aboveavarage(int[] nine) {
        int total = 0;
        System.out.println("nubers above the avareage: ");
        for (int i = 0; i < nine.length; i++) {
            total = total + nine[i];

//            System.out.println(total);
        }
       // System.out.println(total);
      int avg = total/nine.length;
       for (int i = 0; i < nine.length; i++) {
//           total = total+ nine[i];

            if (nine[i] > avg) {
                System.out.println(nine[i]);
            }

    }
     }
}
