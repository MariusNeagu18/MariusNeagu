
package Autoservice;

/**
 *
 * @author mario
 */
public class Car implements Rentable, Saleable {

    private String name;
    private String color;
    private int speed;
    private int rentingPrice;
    private int salePrice;


    public Car(String nameCar, String colorCar, int speedCar, int rentPriceCar, int salePriceCar) {
        name = nameCar;
        color = colorCar;
        speed = speedCar;
        rentingPrice = rentPriceCar;
        salePrice = salePriceCar;
    }

    public String getColor() {
        return (color);
    }
    public String getName() {
        return (name);
    }
    public int getSpeed() {
        return (speed);
    }
    @Override
    public int getRentingPrice() {
        return (rentingPrice);
    }
    @Override
    public int getSalePrice() {
        return (salePrice);
    }
   
    public void increaseSpeed(int increaseSpeedValue){
        speed = speed + increaseSpeedValue;
    }
    public void decreaseSpeed(int decreaseSpeedValue){
        speed = speed - decreaseSpeedValue;
    }
    public void increaseRentingPrice(int increaseRentingPriceValue){
        rentingPrice = rentingPrice + increaseRentingPriceValue;
    }
    public void decreaseSalePrice(int decreaseSalePriceValue){
        salePrice = salePrice - decreaseSalePriceValue;
    }

}
