/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.cellphoneservices;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class CellPhoneServices {

    public static void main(String[] args) {
        //  System.out.println("Hello World!");
        int talk1 = Integer.parseInt(JOptionPane.showInputDialog("what is your max monthly talk minutes"));
        int text1 = Integer.parseInt(JOptionPane.showInputDialog("what is your max monthly text messages sent"));
        int data1 = Integer.parseInt(JOptionPane.showInputDialog("what is your max monthly data used"));

        if (talk1 <= 500 && text1 == 0 && data1 == 0) {
            JOptionPane.showMessageDialog(null, "the best plan for you is plan A at $49 per month");
        } else if (talk1 < 500 && text1 > 0 && data1 == 0) {
            JOptionPane.showMessageDialog(null, "the best plan for you is plan B at $55 per month");
        } else if (talk1 >= 500 && text1 <= 100 && data1 == 0) {
            JOptionPane.showMessageDialog(null, "the best plan for you is plan C at $61 per month");
        } else if (talk1 >= 500 && text1 > 100 && data1 == 0) {
            JOptionPane.showMessageDialog(null, "the best plan for you is plan D at $70 per month");
        } else if (data1 > 0 && data1 < 3) {
            JOptionPane.showMessageDialog(null, "the best plan for you is plan E at $79 per month");
        } else if (data1 >= 3) {
            JOptionPane.showMessageDialog(null, "the best plan for you is plan F at $87 per month");
        } else {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
}
