/*
 * Test Class for Patrulater Dreptunghic
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class PatrulaterDreptunghicTest {
    
    public PatrulaterDreptunghicTest() {
    }

    /**
     * Test of getDefinition method, of class PatrulaterDreptunghic.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        PatrulaterDreptunghic instance = new PatrulaterDreptunghic();
        String expResult = " a plane figure with four straight sides and four right angles";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
