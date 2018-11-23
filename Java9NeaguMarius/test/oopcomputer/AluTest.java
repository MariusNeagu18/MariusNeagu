/*
 * Test Class for ALU
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class AluTest {
    
    public AluTest() {
    }

    /**
     * Test of getOperator method, of class Alu.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Alu instance = new Alu();
        instance.setOperator('-');
        Character expResult = '-';
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class Alu.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = '-';
        Alu instance = new Alu();
        instance.setOperator(operator);
        Character result = instance.getOperator();
        assertEquals(operator, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandUnu method, of class Alu.
     */
    @Test
    public void testGetOperandUnu() {
        System.out.println("getOperandUnu");
        Alu instance = new Alu();
        instance.setOperandUnu(123);
        Integer expResult = 123;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandUnu method, of class Alu.
     */
    @Test
    public void testSetOperandUnu() {
        System.out.println("setOperandUnu");
        Integer operandUnu = 123;
        Alu instance = new Alu();
        instance.setOperandUnu(operandUnu);
        Integer expResult = operandUnu;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandDoi method, of class Alu.
     */
    @Test
    public void testGetOperandDoi() {
        System.out.println("getOperandDoi");
        Alu instance = new Alu();
        instance.setOperandDoi(321);
        Integer expResult = 321;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandDoi method, of class Alu.
     */
    @Test
    public void testSetOperandDoi() {
        System.out.println("setOperandDoi");
        Integer operandDoi = 321;
        Alu instance = new Alu();
        instance.setOperandDoi(operandDoi);
        Integer expResult = operandDoi;
        Integer result = instance.getOperandDoi();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRezultat method, of class Alu.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        Alu instance = new Alu();
        instance.setRezultat(444);
        Integer expResult = 444;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRezultat method, of class Alu.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Integer rezultat = 444;
        Alu instance = new Alu();
        instance.setRezultat(rezultat);
        Integer expResult = rezultat;
        Integer result = instance.getRezultat();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class Alu.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");               
        Alu instance = new Alu();
        instance.setOperandUnu(123);
        instance.setOperandDoi(321);
        instance.setOperator('+');
        instance.calculeaza();
        Integer expResult = 444;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
