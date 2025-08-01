/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.varsity.poepart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class loginTest {

    public loginTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkusername method, of class login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkusername");
        String uname3 = "kyl_1";
        boolean expResult = true;
        boolean result = login.checkusername(uname3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCheckUsernameFalse() {
        System.out.println("checkusername");
        String uname3 = "kyle!!!";
        boolean expResult = false;
        boolean result = login.checkusername(uname3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkpasswordcomplexity method, of class login.
     */
    @Test
    public void testCheckpasswordcomplexity() {
        System.out.println("checkpasswordcomplexity");
        String psw3 = "Ch&&sec@ke99";
        boolean expResult = true;
        boolean result = login.checkpasswordcomplexity(psw3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCheckPasswordComplexityFalse() {
        System.out.println("checkpasswordcomplexity");
        String psw3 = "password";
        boolean expResult = false;
        boolean result = login.checkpasswordcomplexity(psw3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkCellPhoneNumber method, of class login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String pnum3 = "+27235454";
        boolean expResult = true;
        boolean result = login.checkCellPhoneNumber(pnum3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCheckCellPhoneNumberFalse() {
        System.out.println("checkCellPhoneNumber");
        String pnum3 = "089665523";
        boolean expResult = false;
        boolean result = login.checkCellPhoneNumber(pnum3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkregister method, of class login.
     */
    @Test
    public void testCheckregister() {
        System.out.println("checkregister");
        String uname3 = "kyl_1";
        String psw3 = "Ch&&sec@ke99";
        String expResult = "the two above conditions have been met, and the user has been registered successfully.";
        String result = login.checkregister(uname3, psw3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCheckregisterFalse() {
        System.out.println("checkregister");
        String uname3 = "kyle!!!";
        String psw3 = "password";
        String expResult = "Username is incorrectly formatted.";
        String result = login.checkregister(uname3, psw3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkLogin method, of class login.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        String psw3 = "Ch&&sec@ke99";
        String psw4 = "Ch&&sec@ke99";
        String uname3 = "kyl_1";
        String uname4 = "kyl_1";
        boolean expResult = true;
        boolean result = login.checkLogin(psw3, psw4, uname3, uname4);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCheckLoginFalse() {
        System.out.println("checkLogin");
        String psw3 = "Ch&&sec@ke99";
        String psw4 = "Ch&&sec@ke99";
        String uname3 = "kyl_1";
        String uname4 = "kyl_1";
        boolean expResult = true;
        boolean result = login.checkLogin(psw3, psw4, uname3, uname4);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkloginststus method, of class login.
     */
    @Test
    public void testCheckloginststus() {
        System.out.println("checkloginststus");
        String psw3 = "Ch&&sec@ke99";
        String psw4 = "Ch&&sec@ke99";
        String uname3 = "kyl_1";
        String uname4 = "kyl_1";
        String expResult = "A successful login";
        String result = login.checkloginststus(psw3, psw4, uname3, uname4);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCheckLoginStstusFalse() {
        System.out.println("checkloginststus");
        String psw3 = "password";
        String psw4 = "Ch&&sec@ke99";
        String uname3 = "kyle!!!";
        String uname4 = "kyl_1";
        String expResult = "A failed login.";
        String result = login.checkloginststus(psw3, psw4, uname3, uname4);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
