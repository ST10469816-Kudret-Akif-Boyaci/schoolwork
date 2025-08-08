/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.teeshirt;

/**
 *
 * @author lab_services_student
 */
public class TeeShirt {

    private int order;
    private String size;
    private String color;
    private double price;

    public TeeShirt() {
    }

    public TeeShirt(int order, String size, String color) {
        this.order = order;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOrder() {
        return order;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice(String size) {
        if (size.equals("xxl") || size.equals("xxxl")) {
            price = 22.99;
        } else {
            price = 19.99;
        }
        return price;
    }

}
