/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.poepart3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author lab_services_student
 */
public class Message {

    private boolean checkmessageid;
    private int checkrecepientcell;
    private String createmessagehash;
    private String sentmessage;
    private String printmessages;
    private int returntotalmessages;
    private boolean checkCellPhoneNumber;
    private String generateHash;
    private String generateUniqueId;
    private String checkmessagelenght;

    public String checkmessagelenght(String lengt1) {
        if (lengt1.length() <= 250) {
            return "Message ready to send";
        }
        int lengt2 = lengt1.length() - 250;
        return "Message exceeds 250 characters by " + lengt2 + " please reduce sizes";
    }

    public boolean checkmesaageid(String idnum) {
        return idnum.length() == 10;
    }

    public boolean checkCellPhoneNumber(String pnum3) {
        if (pnum3 == null || !pnum3.startsWith("+27") || pnum3.length() > 13) {
            return false;
        }

        String rest = pnum3.substring(3); // Get the part after +27
        return rest.matches("\\d+");
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
    }

    public String generateHash(String idnum, int messageNum, String message) {
        String[] words = message.trim().split("\\s+");
        String firstWord = words.length > 0 ? words[0] : "";
        String lastWord = words.length > 1 ? words[words.length - 1] : firstWord;
        return idnum.substring(0, 2) + ":" + messageNum + ":" + firstWord + lastWord;
    }
    //        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
    private int Counter = 0;

    public String sentmessage(String send1) {
        System.out.println(""" 
                                   Choose one of the following
                                   send message 
                                   Disregard message 
                                   Store message to send later""");
        if (send1.contains("send")) {
            Counter++;
            return "Message succesfully sent";
        } else if (send1.contains("disreagard") || send1.contains("disregard") ) {
            return "Press 0 to delete the message";
        } else if (send1.contains("store")) {
            return "Message succesfully stored";

        }
        return "error incorrect input";
    }

    public String printmessages(String print1) {

        return print1;

    }

    public int returntotoalmessages() {

        return Counter;
    }

    private static Set<String> usedIds = new HashSet<>();

    public String generateUniqueId() {
        String id;
        Random random = new Random();
        do {
            id = String.format("%010d", random.nextLong() % 1_000_000_0000L);
            if (id.startsWith("-")) {
                id = id.substring(1); // remove negative sign if any
            }
        } while (usedIds.contains(id));
        usedIds.add(id);
        return id;
    }
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
}
