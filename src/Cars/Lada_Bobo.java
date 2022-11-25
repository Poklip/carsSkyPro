package Cars;

import Beepers.Beeper;
import Engines.Engine;
import FuelTank.FuelTank;
import Tires.Tire;

public class Lada_Bobo extends Car {
    public Lada_Bobo(Beeper beeper, Engine engine, FuelTank fuelTank, Tire tire) {
        super(beeper, engine, fuelTank, tire);
    }

    public String howToBuy () {
        return "Go to old renault.";
    }
}
