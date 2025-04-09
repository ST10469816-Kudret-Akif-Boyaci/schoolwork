/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.testblooddata;

/**
 *
 * @author lab_services_student
 */
public class BloodData {

    private String bloodtype;
    private String rhfactor;

    public BloodData(String bloodtype, String rhfactor) {
        this.bloodtype = bloodtype;
        this.rhfactor = rhfactor;
    }

    public BloodData() {
        this.bloodtype = "0";
        this.rhfactor = "+";
    }

    
    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getRhfactor() {
        return rhfactor;
    }

    public void setRhfactor(String rhfactor) {
        this.rhfactor = rhfactor;
    }
    
    
}
