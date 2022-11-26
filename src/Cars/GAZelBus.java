package Cars;

import Beepers.Beeper;
import Documents.Document;
import Engines.Engine;
import FuelTank.FuelTank;
import Tires.Tire;
import TruckModules.TruckDevice;

public class GAZelBus extends BigCar{
    public GAZelBus(Beeper beeper, Engine engine, FuelTank fuelTank, Tire tire, Document document, TruckDevice truckDevice) {
        super(beeper, engine, fuelTank, tire, document, truckDevice);
    }

    public String getCapacity() {
        return "I can accommodate 20 passengers.";
    }
}
