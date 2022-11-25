package Cars;

import Beepers.Beeper;
import Documents.Document;
import Engines.Engine;
import FuelTank.FuelTank;
import Tires.Tire;
import TruckModules.TruckDevice;

public abstract class BigCar {
    public Beeper beeper;
    public Engine engine;
    public FuelTank fuelTank;
    public Tire tire;
    public Document document;
    public TruckDevice truckDevice;

    public BigCar(Beeper beeper, Engine engine, FuelTank fuelTank, Tire tire, Document document, TruckDevice truckDevice) {
        this.beeper = beeper;
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.tire = tire;
        this.document = document;
        this.truckDevice = truckDevice;
    }
}
