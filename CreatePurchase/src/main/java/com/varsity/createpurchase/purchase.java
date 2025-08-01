/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.createpurchase;

/**
 *
 * @author lab_services_student
 */
public class purchase {

    public static int invoice(int invoicenum1) {

        return 0;

    }

    public static double saleamount(double sale1) {
        double tax1 = sale1 * (0.05);
        return tax1;
    }
//    public static void display(String invoicenum1, double sale1, double tax1){
//        System.out.println(invoicenum1+sale1+tax1);

    private String invoicenum1;
    private double sale1;

    public void setInvoicenum1(String invoicenum1) {
        this.invoicenum1 = invoicenum1;
    }

    public void setSale1(double sale1) {
        double tax1 = sale1 * (0.05);
        this.sale1 = tax1;

    }

    public String getInvoicenum1() {
        return invoicenum1;
    }

    public double getSale1() {
        return sale1;
    }
}
