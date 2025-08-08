/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.salepersondatabase;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class SalePersonDatabase {

    private void display(ArrayList<SalePerson> salesp){
        System.out.println(salesp.toString());
    }
    public static void main(String[] args) {
        //  System.out.println("Hello World!");

        int SIZE = 20;

        ArrayList<SalePerson> saleperson1 = new ArrayList<>();

        while (true) {
            int choice = Integer.parseInt(JOptionPane.showInputDialog(" 1. add a record \n 2. delete a record \n 3. update a record \n 4 . exit \\?"));

            switch (choice) {
                case 1:

                     if (saleperson1.size() >= SIZE) {
                            JOptionPane.showMessageDialog(null, "database is full");
                        }else {
                      int idnum1 = Integer.parseInt(JOptionPane.showInputDialog(" enter an ID number. "));
                      
                         for (int i = 0; i < saleperson1.size(); i++) {
                             SalePerson person = saleperson1.get(i);
                             if (person.getId() == idnum1) {
                                 JOptionPane.showMessageDialog(null, "ID number already exists");
                                 continue;
                             }
                         }
                         
                         double salesvalue = Double.parseDouble(JOptionPane.showInputDialog("enter sales value"));
                         
                         SalePerson person = new SalePerson(idnum1, salesvalue);
                         
                         saleperson1.add(person);
                     }
                    break;
                case 2:
                    if (saleperson1.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "there is no data to delete");
                        continue;
                    }else{
                        int idnum2 = Integer.parseInt(JOptionPane.showInputDialog(" enter an ID number. "));
                        
                        SalePerson found = null;
                        for (SalePerson salePerson : saleperson1) {
                            if (salePerson.getId() == idnum2) {
                                found = salePerson;
                                break;
                            }
                        }
                        
                        if(found == null) {
                            JOptionPane.showMessageDialog(null, "couldnt find" + idnum2);
                            continue;
                        }else {
                            saleperson1.remove(found);
                              JOptionPane.showMessageDialog(null, " recode deleted ");
                        }
                    }
                    break;
                case 3:
                    if(saleperson1.isEmpty()){
                        JOptionPane.showMessageDialog(null, " there is no data to change, it is empty ");
                    }else {
                        int idnum3 = Integer.parseInt(JOptionPane.showInputDialog(" enter an ID number. "));
                        
                        int findindex = -1;
                        for (int i = 0; i < saleperson1.size(); i++) {
                            if (saleperson1.get(i).getId() == idnum3) {
                                findindex = i;
                                break;
                            }
                        }
                        if (findindex == -1) {
                             JOptionPane.showMessageDialog(null, " there is no record related to the given ID ");
                             continue;
                             
                        }else{
                            double salevalue = Double.parseDouble(JOptionPane.showInputDialog("please capture a sales amount"));
                            saleperson1.set(findindex, new SalePerson(idnum3, salevalue));
                              JOptionPane.showMessageDialog(null, " record updated. ");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
