package Beepers;

public class Blow implements Beeper {
    @Override
    public String autoSound() {
        return "Boom!";
    }
}
