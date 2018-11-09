/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class PatrulaterTest {
    
    public PatrulaterTest() {
    }

    /**
     * Test of getDefinition method, of class Patrulater.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Patrulater instance = new Patrulater();
        String expResult = " a plane figure with four straight sides";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
