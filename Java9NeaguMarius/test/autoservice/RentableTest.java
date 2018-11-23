/*
 * Test Class for Rentable
 */
package autoservice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class RentableTest {
    
    public RentableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDailyRentPrice method, of class Rentable.
     */
    @Test
    public void testGetDailyRentPrice() {
        System.out.println("getDailyRentPrice");       
        Rentable instance = new RentableImpl();                 
        int expResult = 100;
        int result = instance.getDailyRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class RentableImpl implements Rentable {

        public int getDailyRentPrice() {
            return 100;
        }
    }
    
}
