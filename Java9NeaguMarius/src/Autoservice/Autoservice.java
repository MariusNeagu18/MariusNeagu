/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autoservice;

/**
 *
 * @author mario
 */
public class Autoservice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autoservice obj = new Autoservice();

        Car v1 = new Car("Audi", "Red", 260, 200, 10000);
        Car v2 = new Car("Bmw", "Black", 300, 250, 15000);
        Car v3 = new Car("Mercedes", "Blue", 240, 300, 20000);
        
        obj.displayAutoservice(v1,v2,v3);
        
        v1.increaseSpeed(10);
        v2.decreaseSpeed(10);
        v3.increaseRentingPrice(15);
        v3.decreaseSalePrice(1200);
        
        System.out.println("New parameters: " );
        
        obj.displayAutoservice(v1, v2, v3);
    }
    
     private static void displayAutoservice(Car parametru1, Car parametru2, Car parametru3){
            System.out.println("The available cars are:");
         
            System.out.println("");
            
            System.out.println("Car name: " + parametru1.getName() );
            System.out.println("Car color: " + parametru1.getColor());
            System.out.println("Car speed: " + parametru1.getSpeed());
            System.out.println("Car renting price: " + parametru1.getRentingPrice());
            System.out.println("Car sale price: " + parametru1.getSalePrice());
            
            System.out.println("");
            
            System.out.println("Car name: " + parametru2.getName() );
            System.out.println("Car color: " + parametru2.getColor());
            System.out.println("Car speed: " + parametru2.getSpeed());
            System.out.println("Car renting price: " + parametru2.getRentingPrice());
            System.out.println("Car sale price: " + parametru2.getSalePrice());
            
            System.out.println("");
            
            System.out.println("Car name: " + parametru3.getName() );
            System.out.println("Car color: " + parametru3.getColor());
            System.out.println("Car speed: " + parametru3.getSpeed());
            System.out.println("Car renting price: " + parametru3.getRentingPrice());
            System.out.println("Car sale price: " + parametru3.getSalePrice());
            
            System.out.println("");
            
            System.out.println("End");
            
            System.out.println("");
            
        }
 
}


