package mastering.repetition;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialAmout) {
        this.name = name;
        transactions.add(initialAmout);
    }
    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
