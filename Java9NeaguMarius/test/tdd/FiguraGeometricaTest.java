/*
 * Test Class for Figura Geometrica
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class FiguraGeometricaTest {
    
    public FiguraGeometricaTest() {
    }

    /**
     * Test of getDefinition method, of class FiguraGeometrica.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        FiguraGeometrica instance = new FiguraGeometrica();
        String expResult = " a figure ";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
