package Cars;

import Beepers.Beeper;
import Engines.Engine;
import FuelTank.FuelTank;
import Tires.Tire;

public abstract class Car {

    public Beeper beeper;
    public Engine engine;
    public FuelTank fuelTank;
    public Tire tire;

    public Car(Beeper beeper, Engine engine, FuelTank fuelTank, Tire tire) {
        this.beeper = beeper;
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.tire = tire;
    }
}
