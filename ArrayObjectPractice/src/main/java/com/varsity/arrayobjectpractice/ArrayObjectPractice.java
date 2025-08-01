/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.arrayobjectpractice;

/**
 *
 * @author lab_services_student
 */
public class ArrayObjectPractice {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int numbers[] = new int[] {5, 7, 3, 10, 20};
        
        Student student1 = new Student("akif", "boya", 1);
        Student student2 = new Student("akif", "boya", 2);
        Student student3 = new Student("akif", "boya", 3);
        Student student4 = new Student("akif", "boya", 4);
        Student student5 = new Student("akif", "boya", 5);
        
//        Student student6 = new Student();
//        student6.setName("your name");
//        student6.setSurname("your sn");
//        student6.setNumber(6);
        
        Student[] students= new Student[5];
        students[0] =student1;
        students[1] =student2;
        students[2] =student3;
        students[3] =student4;
        students[4] =student5;
        
        Student[] studentlist = new Student[] {student1, student2, student3, student4, student5};
        
        
        for (int i =0; i<= 4; i++){
            System.out.println(students[i]);
        }
     
        
    }
}
