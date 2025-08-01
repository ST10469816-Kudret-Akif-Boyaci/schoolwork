/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.poepart2;

/**
 *
 * @author lab_services_student
 */
public class login {

    public static boolean checkusername(String uname3) {
        return uname3.length() <= 5 && uname3.contains("_");
    }

    public static boolean checkpasswordcomplexity(String psw3) {

        return psw3.length() >= 8 && psw3.matches(".*[A-Z].*") && psw3.matches(".*[^a-zA-Z0-9].*") && psw3.matches(".*\\d.*");
//        code attribution
//        this method was partially helped by ChatGPT 
//        https://openai.com/
//        ChatGPT
    }

//    public static boolean checkcellphonenumber(String pnum3) {
//        return pnum3.length() <= 13 && pnum3.startsWith("+27");
//    }
    public static boolean checkCellPhoneNumber(String pnum3) {
        if (pnum3 == null || !pnum3.startsWith("+27") || pnum3.length() > 13) {
            return false;
        }

        String rest = pnum3.substring(3); // Get the part after +27
        return rest.matches("\\d+");
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT
    }

    public static String checkregister(String uname3, String psw3) {
        if (!checkusername(uname3)) {
            return "Username is incorrectly formatted.";
        }
        if (!checkpasswordcomplexity(psw3)) {
            return "Password does not meet the complexity requirements.";
        }

        return "the two above conditions have been met, and the user has been registered successfully.";
    }

    public static boolean checkLogin(String psw3, String psw4, String uname3, String uname4) {
        return psw3.equals(psw4) && uname3.equals(uname4);
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT

    }

    public static String checkloginststus(String psw3, String psw4, String uname3, String uname4) {
        if (!checkLogin(psw3, psw4, uname3, uname4)) {
            return "A failed login.";
        }
        return "A successful login";
    }
}
