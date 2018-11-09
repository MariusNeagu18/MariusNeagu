/*
 * JUnit test class Car
 */
package Autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        String expResult = "Gray";
        String result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        String expResult = "Bmw";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        int expResult = 260;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Audi";
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.setName(name);
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "Black";
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.setColor(color);
       
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        int speed = 240;
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.setSpeed(speed);
        
    }

    /**
     * Test of setRentingPrice method, of class Car.
     */
    @Test
    public void testSetRentingPrice() {
        System.out.println("setRentingPrice");
        int rentingPrice = 160;
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.setRentingPrice(rentingPrice);
        
    }

    /**
     * Test of setSalePrice method, of class Car.
     */
    @Test
    public void testSetSalePrice() {
        System.out.println("setSalePrice");
        int salePrice = 12600;
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.setSalePrice(salePrice);
        
    }

    /**
     * Test of getRentingPrice method, of class Car.
     */
    @Test
    public void testGetRentingPrice() {
        System.out.println("getRentingPrice");
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        int expResult = 125;
        int result = instance.getRentingPrice();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        int expResult = 9500;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        int increaseSpeedValue = 270;
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.increaseSpeed(increaseSpeedValue);
        
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        int decreaseSpeedValue = 250;
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.decreaseSpeed(decreaseSpeedValue);
        
    }

    /**
     * Test of increaseRentingPrice method, of class Car.
     */
    @Test
    public void testIncreaseRentingPrice() {
        System.out.println("increaseRentingPrice");
        int increaseRentingPriceValue = 150;
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.increaseRentingPrice(increaseRentingPriceValue);
        
    }

    /**
     * Test of decreaseSalePrice method, of class Car.
     */
    @Test
    public void testDecreaseSalePrice() {
        System.out.println("decreaseSalePrice");
        int decreaseSalePriceValue = 10000;
        Car instance = new Car("Bmw", "Gray", 260, 125, 9500);
        instance.decreaseSalePrice(decreaseSalePriceValue);
        
    }
    
}
