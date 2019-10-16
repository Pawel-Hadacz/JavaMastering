package mastering.repetition;

public class Printer {
    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel > 0 &&  tonerLevel <= 200){
            this.tonerLevel = tonerLevel;
        }
        else{
            System.out.println("Not enough toner");
        }


        this.isDuplexPrinter = isDuplexPrinter;
    }
    public double changeTonner(double tonerAmout){
        if(this.tonerLevel < 2 && this.tonerLevel < 200){
            this.tonerLevel = tonerAmout;
            return tonerAmout;
        }else {
            return -1;
        }
    }
    public void fillToner(){
        if(this.tonerLevel < 15 ){
            System.out.println("Need to fill the Toner");
        }
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }

    public void print(int pages){
        if(isDuplexPrinter){
            pages = (pages/2) + (pages%2);
            numberOfPagesPrinted = numberOfPagesPrinted + pages;
            tonerLevel = (tonerLevel - (0.5*pages));
            System.out.println("Printed Pages " + numberOfPagesPrinted);
        }
        else {
            numberOfPagesPrinted = numberOfPagesPrinted + pages;
            tonerLevel = (tonerLevel - (0.25* pages));
            System.out.println("Printed Pages " + numberOfPagesPrinted);
        }

    }
}
