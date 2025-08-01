/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.varsity.poepart3;

import javax.naming.spi.DirStateFactory;
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
public class MessageTest {

    public MessageTest() {
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
     * Test of checkmessagelenght method, of class Message.
     */
    @Test
    public void testCheckmessagelenght() {
        System.out.println("checkmessagelenght");
        String lengt1 = "Hi mark, can you join us for dinner tonight?";
        Message instance = new Message();
        String expResult = "Message ready to send";
        String result = instance.checkmessagelenght(lengt1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkmesaageid method, of class Message.
     */
    @Test
    public void testCheckmesaageid() {
        Message messageobject = new Message();
        System.out.println("checkmesaageid");
        String idnum = messageobject.generateUniqueId();
        Message instance = new Message();
        boolean expResult = true;
        boolean result = instance.checkmesaageid(idnum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkCellPhoneNumber method, of class Message.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String pnum3 = "+27718693002";
        Message instance = new Message();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(pnum3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of generateHash method, of class Message.
     */
    @Test
    public void testGenerateHash() {
        System.out.println("generateHash");
        Message messageobject = new Message();
        String idnum = "0000000001";
        int messageNum = 0;
        String message = "Hi mark, can you join us for dinner tonight?";
        Message instance = new Message();
        String result = instance.generateHash(idnum, messageNum, message);
        String expResult = "00:0:Hitonight?";//result.contains(":0:hitonight");

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of sentmessage method, of class Message.
     */
    @Test
    public void testSentmessage() {
        System.out.println("sentmessage");
        String send1 = "send";
        Message instance = new Message();
        String expResult = "Message succesfully sent";
        String result = instance.sentmessage(send1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of printmessages method, of class Message.
     */
    @Test
    public void testPrintmessages() {
        System.out.println("printmessages");
        String print1 = "Hi mark, can you join us for dinner tonight?";
        Message instance = new Message();
        String expResult = "Hi mark, can you join us for dinner tonight?";
        String result = instance.printmessages(print1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of returntotoalmessages method, of class Message.
     */
    @Test
    public void testReturntotoalmessages() {
        System.out.println("returntotoalmessages");
        Message instance = new Message();
        int expResult = 0;
        int result = instance.returntotoalmessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of generateUniqueId method, of class Message.
     */
}
