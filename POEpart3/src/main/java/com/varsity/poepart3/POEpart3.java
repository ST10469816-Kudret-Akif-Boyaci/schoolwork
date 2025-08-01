/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.poepart3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.IOException;

/**
 *
 * @author lab_services_student
 */
public class POEpart3 {

//this program runs when the user selects Option 2: show recently sent messages
    public void array(String[] args) {

        try {
            // Create a Gson instance
            Gson gson = new Gson();

            // Read the JSON file
            FileReader reader = new FileReader("message_info.json");

            // Define the array type
            Type recordArrayType = new TypeToken<Record[]>() {
            }.getType();

            // Deserialize into array
            Record[] records = gson.fromJson(reader, recordArrayType);

            // Print each record
            for (Record record : records) {
                System.out.println(record);
            }

        } catch (Exception e) {
            e.printStackTrace();
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
        }
    }

    public void arrayhash(String[] args, String search) {

        try {
            // Create a Gson instance
            Gson gson = new Gson();

            // Read the JSON file
            FileReader reader = new FileReader("message_info.json");

            // Define the array type
            Type recordArrayType = new TypeToken<Record[]>() {
            }.getType();

            // Deserialize into array
            Record[] records = gson.fromJson(reader, recordArrayType);
            int cntr = 0;
            // Print each record
            for (Record record : records) {
                cntr++;
                if (record.getHashnum().equals(search)) {
                    records[cntr] = null;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
        }
    }

    public void arraylong(String[] args) {
        try {
            // Create a Gson instance
            Gson gson = new Gson();

            // Read the JSON file
            FileReader reader = new FileReader("message_info.json");

            // Define the array type for Record objects
            Type recordArrayType = new TypeToken<Record[]>() {
            }.getType();

            // Deserialize into an array of Record objects
            Record[] records = gson.fromJson(reader, recordArrayType);

            // Find the longest element
            String longest = records[0].getMessage(); // Assuming Record has a getMessage method
            for (Record element : records) {
                if (element.getMessage().length() > longest.length()) {
                    longest = element.getMessage();
                }
            }

            // Print the longest element
            System.out.println("The longest element is: " + longest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String[] send2;
    private String[] dis;
    private String[] idarray;
    private String[] hasharray;

    // Initializes the arrays based on counter size
    public void counter1(int counter) {

        send2 = new String[counter];
        dis = new String[counter];
        idarray = new String[counter];
        hasharray = new String[counter];
    }

    public void send(int counter2, String message, String pnum, String hash, String id) {
        String fullmessage = message + " " + pnum + " " + hash + " " + id;
//        if (send2 == null) {
//    send2 = new String[10]; // Only initialize if not already
//}
        send2[counter2] = fullmessage;
    }

    public void disregard(int counter2, String message, String pnum, String hash, String id) {
        String fullmessage = message + " " + pnum + " " + hash + " " + id;

        dis[counter2] = fullmessage;
    }

    public void idmethod(int counter2, String id) {

        idarray[counter2] = id;
    }

    public void hashmethod(int counter2, String hash) {

        hasharray[counter2] = hash;
    }

    public void printsend() {
        if (send2 != null) {
            for (int i = 0; i < send2.length; i++) {
                if (send2[i] != null) {
                    System.out.println(send2[i]);
                }
            }
        } else {
            System.out.println("No sent messages");
        }
    }

    public void printdisreagard() {
        if (dis != null) {
            for (int i = 0; i < dis.length; i++) {
                if (dis[i] != null) {
                    System.out.println(dis[i]);
                }
            }
        } else {
            System.out.println("No disreagarded messages");
        }
    }

    public void printid() {
        if (idarray != null) {
            for (int i = 0; i < idarray.length; i++) {
                if (idarray[i] != null) {
                    System.out.println(idarray[i]);
                }
            }
        } else {
            System.out.println("No typed messages");
        }
    }

    public void printhash() {
        if (hasharray != null) {
            for (int i = 0; i < hasharray.length; i++) {
                if (hasharray[i] != null) {
                    System.out.println(hasharray[i]);
                }
            }
        } else {
            System.out.println("No typed messages");
        }
    }

    public void findid(String searchkey) {
        int position = -1;

        if (send2 != null && send2.length > 0) {
            for (int i = 0; i < send2.length; i++) {
                if (send2[i] != null && send2[i].contains(searchkey)) {
                    position = i;
                    break;
                }
            }
        }

        // If a match is found, print it, otherwise print the message
        if (position != -1) {
            System.out.println(send2[position]);
        } else {
            System.out.println("No messages are sent. or the id is incorrect.");
        }
    }

    public void findid2(String searchkey) {
        int position = -1;

        if (dis != null && dis.length > 0) {
            for (int i = 0; i < dis.length; i++) {
                if (dis[i] != null && dis[i].contains(searchkey)) {
                    position = i;
                    break;
                }
            }
        }

        // If a match is found, print it, otherwise print the message
        if (position != -1) {
            System.out.println(dis[position]);
        } else {
            System.out.println("No messages are disregarded. or the id is incorrect.");
        }
    }
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT

    public void findLongestSend() {
        if (send2 == null || send2.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        String longest = send2[0]; // Assume the first element is the longest
        for (String element : send2) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }

        System.out.println("The longest element is: " + longest);
    }
    //        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT

    public void findLongestDis() {
        if (dis == null || dis.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        String longest = dis[0]; // Assume the first element is the longest
        for (String element : dis) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }

        System.out.println("The longest element is: " + longest);
    }

//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
    public void findhash(String searchkey) {
        int position = -1;

        if (send2 != null && send2.length > 0) {
            for (int i = 0; i < send2.length; i++) {
                if (send2[i] != null && send2[i].contains(searchkey)) {
                    position = i;
                    break;
                }
            }
        }

        // If a match is found, print it, otherwise print the message
        if (position != -1) {
            send2[position] = null;
            System.out.println("message has been deleted");
        } else {
            System.out.println("No messages are sent. or the hash is incorrect.");
        }
    }

    public void findhash2(String searchkey) {
        int position = -1;

        if (dis != null && dis.length > 0) {
            for (int i = 0; i < dis.length; i++) {
                if (dis[i] != null && dis[i].contains(searchkey)) {
                    position = i;
                    break;
                }
            }
        }

        // If a match is found, print it, otherwise print the message
        if (position != -1) {
            dis[position] = null;
            System.out.println("message has been deleted");
        } else {
            System.out.println("No messages are disregarded. or the id is incorrect.");
        }
    }

}
