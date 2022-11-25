import Beepers.Beeper;
import Beepers.Horn;
import Cars.Lada_Bobo;
import Cars.UralForest;
import Documents.Document;
import Documents.Local;
import Engines.Engine;
import Engines.EngineV12;
import Engines.EngineV4;
import FuelTank.FuelTank;
import FuelTank.fuelTankSedan;
import FuelTank.fuelTankTruck;
import Tires.Tire;
import Tires.TireSummer;
import Tires.TireWinter;
import TruckModules.Grip;
import TruckModules.TruckDevice;

public class Main {

    public static void main(String[] args) {
        //creating car
        Beeper horn = new Horn();
        Engine engineLada = new EngineV4();
        FuelTank fuelTankLada = new fuelTankSedan();
        Tire tireSummer = new TireSummer();

        Lada_Bobo v134de77 = new Lada_Bobo(horn, engineLada, fuelTankLada, tireSummer);
        System.out.println(v134de77.tire.checkSafety());

        Document documentLocal = new Local();
        TruckDevice truckDevice = new Grip();
        FuelTank fuelTankUral = new fuelTankTruck();
        Engine engineUral = new EngineV12();
        Tire tireUral = new TireWinter();

        UralForest a666a152 = new UralForest(horn, engineUral, fuelTankUral, tireUral, documentLocal, truckDevice);
        System.out.println(a666a152.document.getPermission());
        System.out.println(a666a152.getInSwamp());

        /*ArrayList<Car> transporter = new ArrayList();
        transporter.add(v134de77);
        transporter.add(b666or05);


        transporter.forEach((Car car) -> {
            System.out.println(car.engine.getSpeed());
            System.out.println(car.beeper.autoSound());
        });*/

    }
}