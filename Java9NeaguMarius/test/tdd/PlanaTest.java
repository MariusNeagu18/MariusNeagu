/*
 * Test Class for Plana
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class PlanaTest {
    
    public PlanaTest() {
    }

    /**
     * Test of getDefinition method, of class Plana.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Plana instance = new Plana();
        String expResult = " a plane figure ";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
