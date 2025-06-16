/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Arrays {
    

public void jsonSearch(String search) {
    try {
        Gson gson = new Gson();
        FileReader reader = new FileReader("message_info.json");

        Type recordArrayType = new TypeToken<Record[]>() {}.getType();
        Record[] records = gson.fromJson(reader, recordArrayType);

        boolean found = false;

        for (Record record : records) {
            if (record != null && record.getMessage() != null && record.getMessage().contains(search)) {
                System.out.println("Found: " + record.getMessage());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching message found.");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}