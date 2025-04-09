/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.testpatient;

/**
 *
 * @author lab_services_student
 */
public class Patient {
    private String blooddata;
    private String idnumber;
    private int age;

    public Patient(String blooddata, String idnumber, int age) {
        this.blooddata = blooddata;
        this.idnumber = idnumber;
        this.age = age;
    }

    public Patient() {
        this.blooddata = "0+";
        this.idnumber = "0";
        this.age = 0;
    }

    
    public String getBlooddata() {
        return blooddata;
    }

    public void setBlooddata(String blooddata) {
        this.blooddata = blooddata;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
