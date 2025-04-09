/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.teamproject;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestTeam {

    public static void main(String[] args) {
        //  System.out.println("Hello World!");

        String school1 = JOptionPane.showInputDialog("enter school name ");
        String sport1 = JOptionPane.showInputDialog("enter sport type ");
        String teamname1 = JOptionPane.showInputDialog("enter team name ");

        Team team1 = new Team();

        team1.setHighschool(school1);
        team1.setSport(sport1);
        team1.setTeamname(teamname1);

        String school2 = team1.getHighschool();
        String sport2 = team1.getSport();
        String teamname2 = team1.getTeamname();

        System.out.println("school name is " + school2 + " \nsport type is " + sport2 + " \nteam name is " + teamname2);
    }
}
