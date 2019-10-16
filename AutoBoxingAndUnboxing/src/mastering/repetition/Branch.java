package mastering.repetition;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialAmount){
        System.out.println("Adding new customer");
        if(findCustomer(customerName)==null){
            customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName){
        for(int i = 0;i < customers.size();i++){
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
