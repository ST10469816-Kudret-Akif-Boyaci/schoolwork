/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.arraychapter;

import com.sun.source.tree.BreakTree;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class CarCareShop {
    public static void main(String[] args) {
        String[] services = new String[] { "oil change", "tire rotation", "battery check", "brake insperction"};
        int[] price = new int[] {25, 22, 15, 5};
        
        String mychoice = JOptionPane.showInputDialog("what service do you want ");
       int pos = searcher(services, mychoice);
       
       if(pos !=-1){
         //  System.out.println("error");
         System.out.println(mychoice + " costs $" + price[pos]);
       } 
       
    }
    
    private static int searcher(String[] services, String mychoice){
      int  position = -1;
      int i = 0;
        for ( i = 0; i < services.length; i++) {
            
        
      if (services[i].equals(mychoice)){
          position =i;
          break;
      }  if (i ==services.length -1 && !services[i].equals(mychoice)){
            System.out.println("error");
      }
        }

        return position;
    } 
}
