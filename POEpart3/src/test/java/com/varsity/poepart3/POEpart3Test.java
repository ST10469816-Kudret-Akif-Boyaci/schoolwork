/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.varsity.poepart3;

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
public class POEpart3Test {
    
    public POEpart3Test() {
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
     * Test of array method, of class POEpart3.
     */
    
    @Test
    public void testArray() {
        System.out.println("array");
        String[] args = null;
        POEpart3 instance = new POEpart3();
        instance.array(args);
        // TODO review the generated test code and remove the default call to fail.
           }

    /**
     * Test of arraylong method, of class POEpart3.
     */
    @Test
    public void testArraylong() {
        System.out.println("arraylong");
        String[] args = null;
        POEpart3 instance = new POEpart3();
        instance.arraylong(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of counter1 method, of class POEpart3.
     */
    @Test
    public void testCounter1() {
        System.out.println("counter1");
        int counter = 0;
        POEpart3 instance = new POEpart3();
        instance.counter1(counter);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of send method, of class POEpart3.
     */

    @Test
    public void testSend() {
        System.out.println("send");
        int counter2 = 0;
        String message = "hello";
        String pnum = "+275432334";
        String hash = "99:3hash";
        String id = "1234567890";
        POEpart3 instance = new POEpart3();
        instance.counter1(1);
        instance.send(counter2, message, pnum, hash, id);
        // TODO review the generated test code and remove the default call to fail.
       
    }


    /**
     * Test of disregard method, of class POEpart3.
     */
    @Test
    public void testDisregard() {
        System.out.println("disregard");
        int counter2 = 0;
        String message = "hello";
        String pnum = "+275432334";
        String hash = "99:3hash";
        String id = "1234567890";
        POEpart3 instance = new POEpart3();
        instance.counter1(1);
        instance.disregard(counter2, message, pnum, hash, id);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of idmethod method, of class POEpart3.
     */
    @Test
    public void testIdmethod() {
        System.out.println("idmethod");
        int counter2 = 0;
        String id = "1234567890";
        POEpart3 instance = new POEpart3();
        instance.counter1(1);
        instance.idmethod(counter2, id);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of hashmethod method, of class POEpart3.
     */
    @Test
    public void testHashmethod() {
        System.out.println("hashmethod");
        int counter2 = 0;
        String hash = "23:5hash";
        POEpart3 instance = new POEpart3();
        instance.counter1(1);
        instance.hashmethod(counter2, hash);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of printsend method, of class POEpart3.
     */
    @Test
    public void testPrintsend() {
        System.out.println("printsend");
        POEpart3 instance = new POEpart3();
        instance.printsend();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printdisreagard method, of class POEpart3.
     */
    @Test
    public void testPrintdisreagard() {
        System.out.println("printdisreagard");
        POEpart3 instance = new POEpart3();
        instance.printdisreagard();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printid method, of class POEpart3.
     */
    @Test
    public void testPrintid() {
        System.out.println("printid");
        POEpart3 instance = new POEpart3();
        instance.printid();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of printhash method, of class POEpart3.
     */
    @Test
    public void testPrinthash() {
        System.out.println("printhash");
        POEpart3 instance = new POEpart3();
        instance.printhash();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of findid method, of class POEpart3.
     */
    @Test
    public void testFindid() {
        System.out.println("findid");
        String searchkey = "";
        POEpart3 instance = new POEpart3();
        instance.findid(searchkey);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of findid2 method, of class POEpart3.
     */
    @Test
    public void testFindid2() {
        System.out.println("findid2");
        String searchkey = "";
        POEpart3 instance = new POEpart3();
        instance.findid2(searchkey);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of findLongestSend method, of class POEpart3.
     */
    @Test
    public void testFindLongestSend() {
        System.out.println("findLongestSend");
        POEpart3 instance = new POEpart3();
        instance.findLongestSend();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of findLongestDis method, of class POEpart3.
     */
    @Test
    public void testFindLongestDis() {
        System.out.println("findLongestDis");
        POEpart3 instance = new POEpart3();
        instance.findLongestDis();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findhash method, of class POEpart3.
     */
    @Test
    public void testFindhash() {
        System.out.println("findhash");
        String searchkey = "";
        POEpart3 instance = new POEpart3();
        instance.findhash(searchkey);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findhash2 method, of class POEpart3.
     */
    @Test
    public void testFindhash2() {
        System.out.println("findhash2");
        String searchkey = "";
        POEpart3 instance = new POEpart3();
        instance.findhash2(searchkey);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}
