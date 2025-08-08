/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.teeshirt;

/**
 *
 * @author lab_services_student
 */
public class DemoTees {

    public static void main(String[] args) {
        //     System.out.println();

        String size1 = "xxl";
        String size2 = "xl";

        TeeShirt ts = new TeeShirt(1, size1, "red");
        CustomTee ct = new CustomTee(2, size2, "blue", "slogans are great");
        
        //or alternative method if you dont create constructors
        
//        TeeShirt shirt = new TeeShirt();
//        shirt.setColor("red");
//         shirt.setOrder(1); 
//         shirt.setSize(size1);
         
//         CustomTee custom = new CustomTee();
//         custom.setColor("blue");
//         custom.setOrder(2); 
//         custom.setSize(size2);
//         custom.setSlogan("slogan");
         
         

        System.out.println(ts.getOrder());
        System.out.println(ts.getSize());
        System.out.println(ts.getColor());
        System.out.println(ts.getPrice(size1));

        System.out.println("");

        System.out.println(ct.getOrder());
        System.out.println(ct.getSize());
        System.out.println(ct.getColor());
        System.out.println(ct.getPrice(size2));
        System.out.println(ct.getSlogan());
    }

}
