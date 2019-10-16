package mastering.repetition;

public class PC {
    private Case aCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

   public void powerUp(){
        getaCase().pressPowerButton();
        drawLogo();
   }
    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
    private Case getaCase() {
        return aCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
