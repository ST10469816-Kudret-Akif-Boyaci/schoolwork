/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.acmepay;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class AcmePay {

    public static void main(String[] args) {
        //  System.out.println("Hello World!");

        int hour1 = Integer.parseInt(JOptionPane.showInputDialog("what is your hours worked"));
        int shift1 = Integer.parseInt(JOptionPane.showInputDialog("what is your shift number"));
        int retirement = 0;
        double hpay = 0;
        double pay1 = 0;
        double regpay = 0;
        double overpay = 0;
        int hour3 = 0;
        double retdeduction = 0;

        switch (shift1) {
            case 1:
                hpay = 17;
                break;
            case 2:
                hpay = 18.50;
                break;
            case 3:
                hpay = 22;
                break;
            default:
                JOptionPane.showMessageDialog(null, "error, incomaptible value");
        }

        if (shift1 == 2 || shift1 == 3) {
            retirement = Integer.parseInt(JOptionPane.showInputDialog("do you want to participate in the retirement plan write 1 for yes or 0 for no"));
        }
        if (hour1 > 40) {
            hour3 = 40;
        } else {
            hour3 = hour1;
        }

        if (hour1 > 40 && retirement == 0) {

            int hour2 = hour1 - 40;
            //  double overtime = hour2 *1.5;
            regpay = hour3 * hpay;
            overpay = hour2 * (hpay * 1.5);
            pay1 = regpay + overpay;

        } else if (hour1 <= 40 && retirement == 0) {
            regpay = hour3 * hpay;
            pay1 = regpay;

        } else if (hour1 > 40 && retirement == 1) {
            int hour2 = hour1 - 40;
            regpay = hour3 * hpay;
            overpay = hour2 * (hpay * 1.5);
            double paygross = regpay + overpay;
            retdeduction = (paygross * 0.03);
            pay1 = paygross - retdeduction;

        } else if (hour1 <= 40 && retirement == 1) {
            regpay = hour3 * hpay;
            double paygross = regpay;
            retdeduction = (paygross * 0.03);
            pay1 = paygross - retdeduction;
        }
        // System.out.println(hour1 + " " + shift1 + " " + retirement + " " + pay1 + " " + hpay+ " "+ retdeduction);
        double totalpay = regpay + overpay;
        JOptionPane.showMessageDialog(null, " your hours worked is " + hour1 + " \n your shift is " + shift1 + " \n your hourly rate is " + hpay
                + " \n your regular pay is " + regpay + " \n your overtime pay is " + overpay + " \n your total pay is " + totalpay
                + " \n retirement reduction is " + retdeduction + " \n your net pay is " + pay1);
    }
}
