/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.practicalassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Series {

    ArrayList<SeriesModel> model = new ArrayList<>();
    //Arrays

    public void captureseries() {
        Scanner inputdevice = new Scanner(System.in);
        System.out.println("Enter the series id");
        String id1 = inputdevice.nextLine();

        System.out.println("Enter the series name");
        String name1 = inputdevice.nextLine();

        System.out.println("Enter the series age restriction");
        String age1 = inputdevice.nextLine();
        while (!age1.equals("2") && !age1.equals("3") && !age1.equals("3") && !age1.equals("4")
                && !age1.equals("5") && !age1.equals("6") && !age1.equals("7") && !age1.equals("8")
                && !age1.equals("9") && !age1.equals("10") && !age1.equals("11") && !age1.equals("12")
                && !age1.equals("13") && !age1.equals("14") && !age1.equals("15") && !age1.equals("16")
                && !age1.equals("17")) {
            System.out.println("you have entered an incorrect series age!!! \n please re enter the series age");
            age1 = inputdevice.nextLine();
        }

        System.out.println("Enter number of episeodes for " + name1);
        String num1 = inputdevice.nextLine();

        SeriesModel s2 = new SeriesModel(id1, name1, age1, num1);
        model.add(s2);

        System.out.println("Series processed successfully \n");
    }

    public String agerestriction(String age1) {
        if (!age1.equals("2") && !age1.equals("3") && !age1.equals("3") && !age1.equals("4")
                && !age1.equals("5") && !age1.equals("6") && !age1.equals("7") && !age1.equals("8")
                && !age1.equals("9") && !age1.equals("10") && !age1.equals("11") && !age1.equals("12")
                && !age1.equals("13") && !age1.equals("14") && !age1.equals("15") && !age1.equals("16")
                && !age1.equals("17")) {
            return "you have entered an incorrect series age!!! \n please re enter the series age";

        } else {
            return "age restiction is valid";
        }
    }

//    public void searchseries() {
//        SeriesModel s3 = new SeriesModel();
//
//        Scanner inputdevice = new Scanner(System.in);
//        System.out.println("Enter the series id to search");
//        String id1 = inputdevice.nextLine();
//
//        int index = -1;
//        for (int i = 0; i < model.size(); i++) {  // searchnig for the id number
//            if (model.get(i).getSeriesid().equals(id1)) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index != -1) {
//            System.out.println("-----------------------------------------");
//            System.out.println(model.get(index));
//            System.out.println("-----------------------------------------");
//        } else {
//            System.out.println("-----------------------------------------");
//            System.out.println("series with series id: " + id1 + " not found");
//            System.out.println("-----------------------------------------");
//        }
//
//    }
    public String searchseries() {
        SeriesModel s3 = new SeriesModel();

        Scanner inputdevice = new Scanner(System.in);
        System.out.println("Enter the series id to search");
        String id1 = inputdevice.nextLine();

        int index = -1;
        for (int i = 0; i < model.size(); i++) {  // searchnig for the id number
            if (model.get(i).getSeriesid().equals(id1)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            return "----------------------------------------- \n"
                    + model.get(index)
                    + "\n-----------------------------------------";
        } else {
            return "----------------------------------------- \n"
                    + "series with series id: " + id1 + " not found"
                    + "\n-----------------------------------------";

        }

    }

    public String updatesries() {
        Scanner inputdevice = new Scanner(System.in);
        if (model.isEmpty()) {
            return " there is no series to update, it is empty ";
        } else {
            System.out.println("Enter the series id to update");
            String id1 = inputdevice.nextLine();

            int index = -1;
            for (int i = 0; i < model.size(); i++) {  // searchnig for the id number
                if (model.get(i).getSeriesid().equals(id1)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                return " there is no record related to the given ID ";
                //  continue;

            } else {
                System.out.println("Enter the series name");
                String name1 = inputdevice.nextLine();

                System.out.println("Enter the series age restriction");
                String age1 = inputdevice.nextLine();
                while (!age1.equals("2") && !age1.equals("3") && !age1.equals("3") && !age1.equals("4")
                        && !age1.equals("5") && !age1.equals("6") && !age1.equals("7") && !age1.equals("8")
                        && !age1.equals("9") && !age1.equals("10") && !age1.equals("11") && !age1.equals("12")
                        && !age1.equals("13") && !age1.equals("14") && !age1.equals("15") && !age1.equals("16")
                        && !age1.equals("17")) {
                    System.out.println("you have entered an incorrect series age!!! \n please re enter the series age");
                    age1 = inputdevice.nextLine();
                }

                System.out.println("Enter number of episeodes for " + name1);
                String num1 = inputdevice.nextLine();

                model.set(index, new SeriesModel(id1, name1, age1, num1));
                return " record updated successfully. ";
            }
        }

    }

    public String deleteseries() {
        Scanner inputdevice = new Scanner(System.in);
        if (model.isEmpty()) {
            return " there is no series to delete, it is empty ";
        }else{
            System.out.println("Enter the series id to delete");
            String id1 = inputdevice.nextLine();

            int index = -1;
            for (int i = 0; i < model.size(); i++) {  // searchnig for the id number
                if (model.get(i).getSeriesid().equals(id1)) {
                    index = i;
                    break;
                }} if (index == -1) {
                    return "series not found";
                }
            
            //   model.set(index, new SeriesModel(null, null, null, null));
            System.out.println("are you sure you want to delete series: " + id1 + " from the system? yes (y) to delete");
            String yes1 = inputdevice.nextLine();
            if (yes1.equals("y")) {
                model.remove(index);
                return "-----------------------------------------\n"
                        + "series with series id: " + id1 + " WAS deleted \n"
                        + "-----------------------------------------";
            
            }else{
                return "record is not deleted";
            }
        }
        
    }

    public void seriesreport() {

        for (int i = 0; i < model.size(); i++) {  // searchnig for the id number
            System.out.println("Series " + (i + 1));
            System.out.println("-----------------------------------------");
            System.out.println(model.get(i));
            System.out.println("-----------------------------------------");
        }
    }

    public void exitseriesapplication() {
        System.exit(0);
    }

}

//ArrayList<SalePerson> saleperson1 = new ArrayList<>();
//
//        while (true) {
//            int choice = Integer.parseInt(JOptionPane.showInputDialog(" 1. add a record \n 2. delete a record \n 3. update a record \n 4 . exit \\?"));
//
//            switch (choice) {
//                case 1:
//
//                     if (saleperson1.size() >= SIZE) {
//                            JOptionPane.showMessageDialog(null, "database is full");
//                        }else {
//                      int idnum1 = Integer.parseInt(JOptionPane.showInputDialog(" enter an ID number. "));
//                      
//                         for (int i = 0; i < saleperson1.size(); i++) {
//                             SalePerson person = saleperson1.get(i);
//                             if (person.getId() == idnum1) {
//                                 JOptionPane.showMessageDialog(null, "ID number already exists");
//                                 continue;
//                             }
//                         }
//                         
//                         double salesvalue = Double.parseDouble(JOptionPane.showInputDialog("enter sales value"));
//                         
//                         SalePerson person = new SalePerson(idnum1, salesvalue);
//                         
//                         saleperson1.add(person);
//                     }
