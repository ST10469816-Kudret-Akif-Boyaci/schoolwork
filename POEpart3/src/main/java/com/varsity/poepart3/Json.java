/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.poepart3;

/**
 *
 * @author lab_services_student
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Json {

    private static final String FILE_NAME = "message_info.json";

    public static void Json(String idnum, String hashnum, String cellnum, String message) {
        // Example message values
//         = "AB01";
//        String hashnum = "AB:1:Hello:World";
//        String cellnum = "+1234567890";
//         = "Hello World";

        // Show message to user
//        JOptionPane.showMessageDialog(null,
//                "Message id is: " + idnum +
//                        "\nMessage hash is: " + hashnum +
//                        "\nRecipient is: " + cellnum +
//                        "\nMessage is: " + message);
        // Create new message object
        MessageInfo newMessage = new MessageInfo(idnum, hashnum, cellnum, message);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<MessageInfo> messageList = new ArrayList<>();

        File file = new File(FILE_NAME);

        // Step 1: Read existing messages if file exists
        if (file.exists()) {
            try (FileReader reader = new FileReader(file)) {
                Type listType = new TypeToken<ArrayList<MessageInfo>>() {
                }.getType();
                messageList = gson.fromJson(reader, listType);

                if (messageList == null) {
                    messageList = new ArrayList<>();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Step 2: Add new message
        messageList.add(newMessage);

        // Step 3: Write updated list back to the file
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(messageList, writer);
            System.out.println("Message appended to " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
