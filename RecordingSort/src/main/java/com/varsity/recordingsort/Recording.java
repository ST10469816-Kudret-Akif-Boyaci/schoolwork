/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.recordingsort;

/**
 *
 * @author lab_services_student
 */
public class Recording {
    
    private String title;
    private String artist;
    private double playtime;

    public Recording() {
    }

    public Recording(String title, String artist, double playtime) {
        this.title = title;
        this.artist = artist;
        this.playtime = playtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPlaytime() {
        return playtime;
    }

    public void setPlaytime(double playtime) {
        this.playtime = playtime;
    }

    @Override
    public String toString() {
        return "Recording{" + "title=" + title + ", artist=" + artist + ", playtime=" + playtime + '}';
    }
    
    
    
}
