/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.salepersondatabase;

/**
 *
 * @author lab_services_student
 */
public class SalePerson {
    private int id;
    private double salevalue;

    public SalePerson() {
    }

    public SalePerson(int id, double salevalue) {
        this.id = id;
        this.salevalue = salevalue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalevalue() {
        return salevalue;
    }

    public void setSalevalue(double salevalue) {
        this.salevalue = salevalue;
    }

    @Override
    public String toString() {
        return "SalePerson{" + "id=" + id + ", salevalue=" + salevalue + '}';
    }
    
    
}
