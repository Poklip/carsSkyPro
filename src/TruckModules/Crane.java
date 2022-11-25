package TruckModules;

public class Crane implements TruckDevice{
    @Override
    public String canDoSomething() {
        return "I have a crane, I can lift heavy things.";
    }
}
