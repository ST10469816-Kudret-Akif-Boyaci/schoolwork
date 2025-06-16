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
    public  void array(String[] args) {

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

    public String[] send2;
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

//    public void findid4(String searchkey) {
//        int position = -1;
//        if (send2.length != 0) {
//            for (int i = 0; i < send2.length; i++) {
//                if (send2[i].contains(searchkey)) {
//                    //  if (send2[i] != null && send2[i].toLowerCase().contains(searchkey.toLowerCase())) 
//                    position = i;
//                    break;
//                }
//            }
//
//        }
//        if (position != -1) {
//            System.out.println(send2[position]);
//        } else {
//            System.out.println("no messages are sent");
//        }
//    }

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
     
      public void findid3(String searchkey) {
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
            System.out.println("No messages are archived. or the id is incorrect.");
        }
    }
     
          // Method to load JSON file and return a list of messages
//    public List<String> loadMessagesFromJson(String filePath) {
//        Gson gson = new Gson();
//        List<String> messages = null;
//        try (FileReader reader = new FileReader(filePath)) {
//            // Deserialize the JSON into a List of Strings
//            Type listType = new TypeToken<List<String>>(){}.getType();
//            messages = gson.fromJson(reader, listType);
//        } catch (IOException e) {
//            System.err.println("Error reading the JSON file: " + e.getMessage());
//        }
//        return messages;
//    }
//
//    // Method to find the message by search key
//    public void findid4(String searchKey, String filePath) {
//        // Load the messages from the JSON file
//        List<String> messages = loadMessagesFromJson(filePath);
//        int position = -1;
//
//        // If messages were loaded correctly
//        if (messages != null && !messages.isEmpty()) {
//            // Iterate through the list and search for the key (case-insensitive)
//            for (int i = 0; i < messages.size(); i++) {
//                if (messages.get(i) != null && messages.get(i).toLowerCase().contains(searchKey.toLowerCase())) {
//                    position = i;
//                    break;
//                }
//            }
//        }
//
//        // If a match is found, print it; otherwise, print the message
//        if (position != -1) {
//            System.out.println("Message found: " + messages.get(position));
//        } else {
//            System.out.println("No messages found matching the search key.");
//        }
//    }
//}
       public  void jsonsearch(String search) {
int position = -1;
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
int i = 0;
            // Print each record
//            for (Record record : records) {
//                //System.out.println(record);
//                String[] trial = new String[10];
//                trial[i] = records[i];
//                if (records[i] != null && records[i].contains(search)) {
//                    position = i;
//                    break;
//                }
for (Record record : records) {
    if (record != null && record.getMessage() != null && record.getMessage().contains(search)) {
        System.out.println("Found: " + record.getMessage());
       // found = true;
    }else {
            System.out.println("No messages are archived. or the id is incorrect.");
        }
} i++;
               
//            }if (position != -1) {
//            System.out.println(records[position]);
//        } else {
//            System.out.println("No messages are archived. or the id is incorrect.");
//        }

        } catch (Exception e) {
            e.printStackTrace();
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
        }
    }
      
}

