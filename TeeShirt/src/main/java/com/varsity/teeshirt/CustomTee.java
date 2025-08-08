/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.teeshirt;

/**
 *
 * @author lab_services_student
 */
public class CustomTee extends TeeShirt {

    private String slogan;

    public CustomTee(int order, String size, String color, String slogan) {
        super(order, size, color);
        this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

}
