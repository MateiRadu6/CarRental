package ro.jademy.carrental.carlist;

import ro.jademy.carrental.cars.TransmissionType;
import ro.jademy.carrental.cars.*;

public class Bentley extends Car {

    public Bentley(String make, String model, Integer year, CarBodyStyle carBodyStyle, Integer doorNumber, Color color, TransmissionType transmissionType, Engine engine, int basePrice, Boolean isRented) {
        super(make, model, year, carBodyStyle, doorNumber, color, transmissionType, engine, basePrice, isRented );
    }

}
