/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class ButonTest {
    
    public ButonTest() {
    }

    /**
     * Test of apasa method, of class Buton.
     */
    @Test
    public void testApasa() {
        System.out.println("apasa");
        Carcasa carcasa = new Carcasa();
        Buton instance = new Buton('8',carcasa);
        instance.apasa();
        Character expResult = '8';
        Character result = instance.getSimbol();
        assertEquals(expResult, result);
    }
    
}
