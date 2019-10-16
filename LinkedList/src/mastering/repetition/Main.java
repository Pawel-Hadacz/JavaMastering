package mastering.repetition;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("Paweł",44.44);
	Customer anotherCustomer;
	anotherCustomer = customer;
	anotherCustomer.setBalance(12.44);
        System.out.println("Balance for customer " + customer.getName() + " IS " +  customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(3);
		intList.add(5);
		for (int i = 0; i<intList.size();i++){
			System.out.println(i + ": " + intList.get(i));
		}
		intList.add(1,2);
		for(int i=0; i<intList.size();i++){
			System.out.println(i + ": " + intList.get(i));
		}

    }
}
