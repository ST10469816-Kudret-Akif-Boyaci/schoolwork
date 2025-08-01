/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.purchasearray;

/**
 *
 * @author lab_services_student
 */
public class Purchase {

    private int invoiceno;
    private double saleamount;
    private double tax;

//default constuctor
    public Purchase() {
    }
//second constuctor

    public Purchase(int invoiceno, double saleamount, double tax) {
        this.invoiceno = invoiceno;
        this.saleamount = saleamount;
        this.tax = calctax();
    }

    public double calctax() {
        return this.saleamount * 0.1;
    }

//getters and setters
    public int getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(int invoiceno) {
        this.invoiceno = invoiceno;
    }

    public double getSaleamount() {
        return saleamount;
    }

    public void setSaleamount(double saleamount) {
        this.saleamount = saleamount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Purchase{" + "invoiceno=" + invoiceno + ", saleamount=" + saleamount + ", tax=" + tax + '}';
    }

}
