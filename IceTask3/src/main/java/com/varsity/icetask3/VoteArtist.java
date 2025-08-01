/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.icetask3;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class VoteArtist {

    public static void main(String[] args) {
        Scanner inputdevice = new Scanner(System.in);
        int votea = 0;
        int voteb = 0;
        System.out.println("enter the no of voters");
        int voters = inputdevice.nextInt();

        for (int x = 1; x <= voters; x++) {
            System.out.println("Enter A or B to vote, no otherinput is excepted.");
            String voter1 = inputdevice.next();

            if (voter1.equals("A") || voter1.equals("a")) {
                votea = votea + 1;
            } else if (voter1.equals("B") || voter1.equals("b")) {
                voteb = voteb + 1;
            } else {
                System.out.println("Illegal code the vote will not be counted/");
            }
        }

        System.out.println("artist A has " + votea + " votes");
        System.out.println("artist B has " + voteb + " votes");

        if (votea == voteb) {
            System.out.println("it is a draw");
        } else if (votea > voteb) {
            System.out.println("artist A wins");
        } else if (votea < voteb) {
            System.out.println("artist B wins");
        }
    }
}
