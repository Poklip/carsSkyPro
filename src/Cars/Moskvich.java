package Cars;

import Beepers.Beeper;
import Engines.Engine;
import FuelTank.FuelTank;
import Tires.Tire;

public class Moskvich extends Car {

    public Moskvich(Beeper beeper, Engine engine, FuelTank fuelTank, Tire tire) {
        super(beeper, engine, fuelTank, tire);
    }

    String callingUSSR () {
        return "V sovke luchshe.";
    }
}
