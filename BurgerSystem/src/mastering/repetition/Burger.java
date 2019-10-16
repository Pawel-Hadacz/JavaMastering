package mastering.repetition;

public class Burger {
    private String name;
    private Bread bread;
    private Meat meat;
    private int additions;
    private String firstAddition;
    private String secondAddition;
    private String thirdAddition;
    private String fourthAddition;
    private double addidionCost;
    private double basicPrice;
    private double totalPrice;

    public Burger(String name, Bread bread, Meat meat, double totalPrice) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.totalPrice = totalPrice;
    }

    public Burger(String name, DarkBread darkBread, Meat meat, double addidionCost, double basicPrice) {
    }

    public void setfirstAddition(String firstAddition, double price) {
        this.firstAddition = firstAddition;

    }

    public void setSecondAddition(String secondAddition) {
        this.secondAddition = secondAddition;
    }

    public void setThirdAddition(String thirdAddition) {
        this.thirdAddition = thirdAddition;
    }

    public void setFourthAddition(String fourthAddition) {
        this.fourthAddition = fourthAddition;
    }

    public String getName() {
        return name;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public int getAdditions() {
        return additions;
    }

    public String getfirstAddition() {
        return firstAddition;
    }

    public String getSecondAddition() {
        return secondAddition;
    }

    public String getThirdAddition() {
        return thirdAddition;
    }

    public String getFourthAddition() {
        return fourthAddition;
    }

    public double getAddidionCost() {
        return addidionCost;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Burger(String name) {
        this.name = name;
    }
    public void Addtionals(int additions){
        if(additions > 0 && additions < 4){
            switch (additions){
                case 1:
                    getfirstAddition();
                    break;
                case 2:
                    getfirstAddition();
                    getSecondAddition();
                    break;
                case 3:
                    getfirstAddition();
                    getSecondAddition();
                    getThirdAddition();
                    break;
                case 4:
                    getfirstAddition();
                    getSecondAddition();
                    getThirdAddition();
                    getFourthAddition();
                    break;
                default:
                    System.out.println("Błędna liczba dodatków");
            }
        }

    }
}
