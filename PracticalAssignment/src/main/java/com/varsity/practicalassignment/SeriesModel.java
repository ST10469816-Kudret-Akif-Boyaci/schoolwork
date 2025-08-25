/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.practicalassignment;

/**
 *
 * @author lab_services_student
 */
public class SeriesModel {
    public String seriesid;
    public String seriesname;
    public String seriesage;
    public String seriesnumberofepisodes;

    public SeriesModel() {
    }

    public SeriesModel(String seriesid, String seriesname, String seriesage, String seriesnumberofepisodes) {
        this.seriesid = seriesid;
        this.seriesname = seriesname;
        this.seriesage = seriesage;
        this.seriesnumberofepisodes = seriesnumberofepisodes;
    }

    public String getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(String seriesid) {
        this.seriesid = seriesid;
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname;
    }

    public String getSeriesage() {
        return seriesage;
    }

    public void setSeriesage(String seriesage) {
        this.seriesage = seriesage;
    }

    public String getSeriesnumberofepisodes() {
        return seriesnumberofepisodes;
    }

    public void setSeriesnumberofepisodes(String seriesnumberofepisodes) {
        this.seriesnumberofepisodes = seriesnumberofepisodes;
    }

    @Override
    public String toString() {
        return  "seriesid: " + seriesid + "\n series name: " + seriesname + "\n series age restriction: " + seriesage +
                "\n series number of episodes: " + seriesnumberofepisodes;
    }
    
    
}
