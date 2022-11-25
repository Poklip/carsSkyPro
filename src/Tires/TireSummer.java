package Tires;

public class TireSummer implements Tire {
    @Override
    public String checkSafety() {
        return "Not safe in northern hemisphere.";
    }
}
