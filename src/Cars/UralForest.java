package Cars;

import Beepers.Beeper;
import Documents.Document;
import Engines.Engine;
import FuelTank.FuelTank;
import Tires.Tire;
import TruckModules.TruckDevice;

public class UralForest extends BigCar{
    public UralForest(Beeper beeper, Engine engine, FuelTank fuelTank, Tire tire, Document document, TruckDevice truckDevice) {
        super(beeper, engine, fuelTank, tire, document, truckDevice);
    }

    public String getInSwamp() {
        return "How to get out of this ass?";
    }
}
