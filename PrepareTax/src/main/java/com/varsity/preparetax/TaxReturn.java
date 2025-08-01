/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.preparetax;

/**
 *
 * @author lab_services_student
 */
public class TaxReturn {
    
    
    private String name;
    private String surname;
    private String socialsec;
    private String street;
    private String city;
    private String state;
    private int zip;
    private double annualincome;
    private String marial;
    private String taxliability;

    public TaxReturn(String name, String surname, String socialsec, String street, String city, String state, int zip, double annualincome, String marial) {
        this.name = name;
        this.surname = surname;
        this.socialsec = socialsec;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.annualincome = annualincome;
        this.marial = marial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSocialsec() {
        return socialsec;
    }

    public void setSocialsec(String socialsec) {
        this.socialsec = socialsec;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public double getAnnualincome() {
        return annualincome;
    }

    public void setAnnualincome(double annualincome) {
        this.annualincome = annualincome;
    }

    public String isMarial() {
        return marial;
    }

    public void setMarial(String marial) {
        this.marial = marial;
    }

//    public String getTaxliability() {
//        return taxliability;
//    }

    private double  Taxliability(String taxliability) {
        this.taxliability = taxliability;
        double taxreturn =0;
        if (annualincome <=20000 && marial.startsWith("S") || marial.startsWith("s")){
            taxreturn = annualincome/0.15;
        }else if (annualincome <=20000 && marial.startsWith("M") || marial.startsWith("m")){
            taxreturn = annualincome/0.14;
        }else if (annualincome <=50000 && marial.startsWith("M") || marial.startsWith("m")){
            taxreturn = annualincome/0.20;
        }else if (annualincome <=50000 && marial.startsWith("S") || marial.startsWith("s")){
            taxreturn = annualincome/0.22;
        }else if (annualincome >=50000 && marial.startsWith("S") || marial.startsWith("s")){
            taxreturn = annualincome/0.30;
        }else if (annualincome >=50000 && marial.startsWith("M") || marial.startsWith("m")){
            taxreturn = annualincome/0.28;
        }
    return taxreturn;
    }
//    public void taxreturn(){
//        System.out.println("k");
//    }
//    
}
