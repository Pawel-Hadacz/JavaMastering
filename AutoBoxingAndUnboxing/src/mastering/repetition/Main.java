package mastering.repetition;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       /* ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Paweł");
        System.out.println(strArrayList);

        ArrayList<Integer> intArray =  new ArrayList<>();
        for(int i = 0; i<=10;i++){
            intArray.add(Integer.valueOf(i));
            // autoboxing
        }
        for(int i=0;i<10;i++){
            System.out.println(i + " ----> " + intArray.get(i));
        }

        ArrayList<Double> myDoubleArray = new ArrayList<>();
        for(double dbl = 0.0; dbl<10;dbl++ ){
            myDoubleArray.add(dbl);
        }
        for(int i  = 0; i<10;i++ ){
            System.out.println(i + " -> " + myDoubleArray.get(i));
        }*/
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Warsaw");
        bank.addCustomer("Warsaw","Tom",40.45);
        bank.addCustomer("Warsaw","John",200);
        bank.addCustomer("Warsaw","Mike",345.33);

        bank.addBranch("Krakow");
        bank.addCustomer("Krakow","Kate", 33.44);

        bank.addCustomerTransaction("Warsaw","Tom",40.45);
        bank.addCustomerTransaction("Warsaw","John",200);
        bank.addCustomerTransaction("Warsaw","Mike",345.33);

        bank.listCustomers("Warsaw", true);
    }
}
