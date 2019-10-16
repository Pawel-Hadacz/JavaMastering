package mastering.repetition;

public class Gearbox {
    private boolean clutchIsIn;


    public Gearbox(boolean clutchIsIn) {
        this.clutchIsIn = clutchIsIn;

    }

    public void operateClutch(String inOrOut){
        clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
