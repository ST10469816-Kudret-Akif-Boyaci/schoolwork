/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.nineints;

/**
 *
 * @author lab_services_student
 */
public class ArrayMethodDemo {

    public static void main(String[] args) {
        int[] nine = new int[8];
        nine[0] = 1;
        nine[1] = 2;
        nine[2] = 2;
        nine[3] = 3;
        nine[4] = 4;
        nine[5] = 5;
        nine[6] = 6;
        nine[7] = 7;
        MethodHelper demo = new MethodHelper();
        
        demo.getascending(nine);
        demo.getdescending(nine);
        demo.getotal(nine);
        demo.limiter(nine);
        demo.aboveavarage(nine);
//        System.out.println(getascending(nine));
//        System.out.println(getdescending(nine));

    }

//    public static int[] getascending(int[] nine) {
//        // int size = surname.length();
//
//        //   char[] characters = new char[size];
////        for (int i = 0; i < size; i++) {
////            characters[i] = surname.charAt(i);
//        System.out.println("ascending order: ");
//        for (int i = 0; i < nine.length; i++) {
//            System.out.println(nine[i]);
//
//        }
//        return nine;
//    }
//
//    public static int[] getdescending(int[] nine) {
//
//        System.out.println("descending order: ");
//        for (int i = nine.length -1; i > 0; i = i-1) {
//            System.out.println(nine[i]);
//
//        }
//        return nine;
//    }
}
