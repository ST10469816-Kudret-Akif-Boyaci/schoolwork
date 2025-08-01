/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.poepart2;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class POEpart2 {

    public static void main(String[] args) {
        // the end of the POEpart1 class runs this class only if the login was successfull
        System.out.println("Welcome to QuickChat");
        Scanner inputdevice = new Scanner(System.in);
        Message messageobject = new Message();
        int option = 0;
        int messagecount = 0;
        String cellnum = "";
        String message = "";
        String idnum = "";
        String hashnum = "";
        String send = "";

        while (true) {
            option = 0;

            while (option > 3 || option < 1) {
                option = Integer.parseInt(JOptionPane.showInputDialog("""
                           Please select one of the following options 
                           Option 1: send message 
                           Option 2: show recently sent messages 
                           Option 3: Quit 
                           please enter the number corresponding to the option chosen"""));
                //option = inputdevice.nextInt();
            }
            if (option == 3) {
                System.exit(0);
            } else if (option == 2) {
                System.out.println("Coming soon");
            } else if (option == 1) {
                System.out.println("how many messages would you like to enter");
                messagecount = inputdevice.nextInt();

                int counter = 0;  //sentinel. controller

                for (counter =1; counter <= messagecount; counter++) {
                //    counter = counter + 1;

                    System.out.println("please enter the cell phone number of the recepient");
                    cellnum = inputdevice.nextLine();

                    boolean numcheck = messageobject.checkCellPhoneNumber(cellnum);
                    while (numcheck == false) {

                        System.out.println(" Cell Phone number is incorrectly formatted or does not contain an international code. \n please correct number and try again \n ");

                        System.out.println(" please enter a valid south african phone number");
                        cellnum = inputdevice.nextLine();
                        numcheck = login.checkCellPhoneNumber(cellnum);

                    }
                    System.out.println("Cellphone number successfully captured");
                    System.out.println("please enter your message");
                    message = inputdevice.nextLine();
                    while (message.length() > 250) {
                        System.out.println("Please enter a message of less than 250 characters \n");
                        System.out.println("please enter your message");
                        message = inputdevice.nextLine();
                    }
                    System.out.println("Message sent");

                    System.out.println("""
                                   Choose one of the following 
                                   send message 
                                   Disregard message 
                                   Store message to send later""");
                    send = inputdevice.nextLine();
                    String send2 = messageobject.sentmessage(send);
                    System.out.println(send2);

                    idnum = messageobject.generateUniqueId();
                    //          System.out.println(idnum);
                    hashnum = messageobject.generateHash(idnum, counter, message);
                    //  System.out.println(hashnum);

                    JOptionPane.showMessageDialog(null, " Message id is: " + idnum
                            + "\n Message hash is; " + hashnum
                            + "\n recepient is: " + cellnum
                            + "\n message is: " + message);
// sometimes joptionpane popup opens up behind the app and you need to minimise netbeans to see it.

                    //  Generator.saveMessagesToJson();
                    Json.Json(idnum, hashnum, cellnum, message);
                }
                System.out.println(counter + " is the total number of messages typed.");
            }

        }
    }
}
