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

            Type recordArrayType = new TypeToken<Record[]>() {
            }.getType();
            Record[] records = gson.fromJson(reader, recordArrayType);

            boolean found = false;

            for (Record record : records) {

                if (record.getIdnum().equals(search)) {
                    System.out.println("Record with ID found: ID = " + record.getIdnum() + " Message = " + record.getMessage() + " cellnum = " + record.getCellNum() + " Hash = " + record.getHashnum());
                }
            }
// 5208584770
            if (!found) {
                System.out.println("No matching message found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT

    public void jsonSearchpnum(String search) {
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("message_info.json");

            Type recordArrayType = new TypeToken<Record[]>() {
            }.getType();
            Record[] records = gson.fromJson(reader, recordArrayType);

            boolean found = false;

            for (Record record : records) {

                if (record.getCellNum().equals(search)) {
                    System.out.println("Record with ID found: ID = " + record.getIdnum() + " Message = " + record.getMessage() + " cellnum = " + record.getCellNum() + " Hash = " + record.getHashnum());
                }
            }

            if (!found) {
                System.out.println("No matching message found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
