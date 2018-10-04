package ro.jademy.carrental.cars;

public abstract class Car {

    private String make;
    private String model;
    private Integer makeYear;
    private CarBodyStyle carBodyStyle;
    private Integer doorNumber;
    private Color color;
    private TransmissionType transmissionType;
    private Engine engine;
    private EngineType engineType;
    private int basePrice;
    private boolean isRented;


    public Car(String make, String model, Integer year, CarBodyStyle carBodyStyle, Integer doorNumber, Color color, TransmissionType transmissionType, Engine engine, int basePrice, Boolean isRented) {
        this.make = make;
        this.model = model;
        this.makeYear = year;
        this.carBodyStyle = carBodyStyle;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.basePrice = basePrice;
        this.isRented = isRented;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(Integer makeYear) {
        this.makeYear = makeYear;
    }

    public CarBodyStyle getCarBodyStyle() {
        return carBodyStyle;
    }

    public void setCarBodyStyle(CarBodyStyle carBodyStyle ) { this.carBodyStyle = carBodyStyle; }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        this.isRented = rented;
    }
}
