package Beepers;

public class ExBeeper implements Beeper {
    @Override
    public String autoSound() {
        return "I forgot my toothbrush. Do you have a cup of coffee?";
    }
}