/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.poepart3;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.FileReader;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

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
        String cellnum;
        String message = "";
        String idnum = "";
        String hashnum = "";
        String send = "";
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        POEpart3 array1 = new POEpart3();
        Arrays array2 = new Arrays();

        String disregarded2[] = new String[0];
        String sent2[] = new String[0];

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

            } else if (option == 1) {
                System.out.println("how many messages would you like to enter");
                messagecount = inputdevice.nextInt();

                array1.counter1(messagecount);

                int counter = 0;  //sentinel. controller

                for (counter = 0; counter < messagecount; counter++) {

                    System.out.println("please enter the cell phone number of the recepient");
                    cellnum = inputdevice.nextLine();

                    boolean numcheck = messageobject.checkCellPhoneNumber(cellnum);

                    while (!numcheck) {

                        System.out.println(" Cell Phone number is incorrectly formatted or does not contain an international code. \n please correct number and try again \n ");

                        System.out.println(" please enter a valid south african phone number");
                        cellnum = inputdevice.nextLine();
                        numcheck = messageobject.checkCellPhoneNumber(cellnum);

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

                    idnum = messageobject.generateUniqueId();

                    hashnum = messageobject.generateHash(idnum, counter, message);

                    array1.idmethod(counter3, idnum);
                    array1.hashmethod(counter3, hashnum);
                    counter3++;
                    System.out.println("""
                                   Choose one of the following 
                                   send message 
                                   Disregard message 
                                   Store message to send later""");
                    send = inputdevice.nextLine();

                    if (send.contains("send")) {

                        array1.send(counter1, message, cellnum, hashnum, idnum);
                        counter1++;
                        System.out.println("Message succesfully sent");
                    } else if (send.contains("disreagard")) {

                        array1.disregard(counter2, message, cellnum, hashnum, idnum);
                        counter2++;
                        System.out.println("Press 0 to delete the message");
                    } else if (send.contains("store")) {
                        Json.Json(idnum, cellnum, message, hashnum);

                        System.out.println("Message succesfully stored");
                    }

                    JOptionPane.showMessageDialog(null, " Message id is: " + idnum
                            + "\n Message hash is; " + hashnum
                            + "\n recepient is: " + cellnum
                            + "\n message is: " + message);

                }
                System.out.println(counter + " is the total number of messages typed.");
            } else if (option == 2) {

                int option2 = Integer.parseInt(JOptionPane.showInputDialog("""
                           Please select one of the following options to view 
                           Option 1: sent message 
                           Option 2: disregarded messages
                           Option 3: stored messages 
                           Option 4: check IDs
                           Option 5: Check Hashes
                           Option 6: all messages
                           Option 7: Search messages by ID
                           OPtion 8: Search messages by recepient phone number
                           Option 9: Show all messages
                           Option 10: Show the longest message
                           Option 11: delete using hash
                           please enter the number corresponding to the option chosen"""));

                if (option2 == 3) {
                    array1.array(new String[0]);

                } else if (option2 == 1) {
//                   
                    array1.printsend();

                } else if (option2 == 2) {
//                   
                    array1.printdisreagard();

                } else if (option2 == 4) {
                    array1.printid();

                } else if (option2 == 5) {
                    array1.printhash();
                } else if (option2 == 6) {
                    array1.printsend();
                    array1.printdisreagard();
                    array1.array(new String[0]);

                } else if (option2 == 7) {
                    int option3 = Integer.parseInt(JOptionPane.showInputDialog("""
                           Please select one of the following options to view 
                           Option 1: sent message 
                           Option 2: disregarded messages
                           Option 3: stored messages
                           please enter the number corresponding to the option chosen"""));

                    if (option3 == 1) {
                        System.out.println("type the id you are searching for");

                        String search1 = inputdevice.nextLine();

                        array1.findid(search1);

                    } else if (option3 == 2) {
                        System.out.println("type the id you are searching for");

                        String search1 = inputdevice.nextLine();

                        array1.findid2(search1);

                    } else if (option3 == 3) {
                        System.out.println("type the id you are searching for");

                        String search1 = inputdevice.nextLine();

                        array2.jsonSearch(search1);

                    }

                } else if (option2 == 8) {
                    int option3 = Integer.parseInt(JOptionPane.showInputDialog("""
                           Please select one of the following options to view 
                           Option 1: sent message 
                           Option 2: disregarded messages
                           Option 3: stored messages
                           please enter the number corresponding to the option chosen"""));

                    if (option3 == 1) {
                        System.out.println("type the phone number you are searching for");

                        String search1 = inputdevice.nextLine();

                        array1.findid(search1);

                    } else if (option3 == 2) {
                        System.out.println("type the phone number you are searching for");

                        String search1 = inputdevice.nextLine();

                        array1.findid2(search1);

                    } else if (option3 == 3) {
                        System.out.println("type the phone number you are searching for");

                        String search1 = inputdevice.nextLine();

                        array2.jsonSearchpnum(search1);

                    }
                } else if (option2 == 9) {
                    array1.printsend();
                    array1.printdisreagard();
                    array1.array(new String[0]);
                } else if (option2 == 10) {
                    int option3 = Integer.parseInt(JOptionPane.showInputDialog("""
                           Please select one of the following options to view 
                           Option 1: sent message 
                           Option 2: disregarded messages
                           Option 3: stored messages
                           please enter the number corresponding to the option chosen"""));

                    if (option3 == 1) {
                        array1.findLongestSend();
                    } else if (option3 == 2) {
                        array1.findLongestDis();
                    } else if (option3 == 3) {
                        array1.arraylong(args);
                    }
                } else if (option2 == 11) {
                    int option3 = Integer.parseInt(JOptionPane.showInputDialog("""
                           Please select one of the following options to view 
                           Option 1: sent message 
                           Option 2: disregarded messages
                           Option 3: stored messages
                           please enter the number corresponding to the option chosen"""));

                    if (option3 == 1) {
                        System.out.println("type the hash number you want to delete");

                        String search1 = inputdevice.nextLine();
                        array1.findhash(search1);
                    } else if (option3 == 2) {
                        System.out.println("type the hash number you want to delete");

                        String search1 = inputdevice.nextLine();
                        array1.findhash2(search1);
                    } else if (option3 == 3) {
                        System.out.println("type the hash number you want to delete");

                        String search1 = inputdevice.nextLine();
                        array1.arrayhash(args, search1);
                    }
                }
            }

        }
    }
}
//  +27838884567
