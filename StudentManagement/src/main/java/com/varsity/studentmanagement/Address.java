/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.studentmanagement;

/**
 *
 * @author lab_services_student
 */
public class Address {

    private String streetname;
    private int streetnumber;
    private String postalcode;
    private String city;
    private String province;
    private String country;

    public Address(String streetname, int streetnumber, String postalcode, String city, String province, String country) {
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.postalcode = postalcode;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public Address() {
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public int getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(int streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "streetname=" + streetname + ", streetnumber=" + streetnumber + ", postalcode=" + postalcode + ", city=" + city + ", province=" + province + ", country=" + country + '}';
    }

}
