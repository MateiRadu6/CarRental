package ro.jademy.carrental.cars;

public class Engine {

    int nummberCylinders;
    int cubicCapacity;
    EngineType engineType;

    public Engine(int nummberCylinders, int cubicCapacity, EngineType engineType) {
        this.nummberCylinders = nummberCylinders;
        this.cubicCapacity = cubicCapacity;
        this.engineType = engineType;
    }
}
