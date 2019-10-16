package mastering.repetition;

public class Main {

    public static void main(String[] args) {
        Account Kowalski = new Account("12345",6000,"Tomasz", "mail","592394234");
        System.out.println(Kowalski.getBalance());
        Kowalski.withdraw(6000);
        System.out.println(Kowalski.getBalance());
        /*
        Kowalski.setPhoneNumber("55623442");
        Kowalski.setBalance(5000);
        Kowalski.setCastomerName("Krzysztof");
        System.out.println(Kowalski.getBalance());
        Kowalski.desposit(200);
        System.out.println(Kowalski.getBalance());
        Kowalski.withdraw(4900);
        System.out.println(Kowalski.getBalance());
        Kowalski.withdraw(300);
        System.out.println(Kowalski.getBalance());
        Kowalski.withdraw(1);
        System.out.println(Kowalski.getBalance());
        Account Kamil = new Account("Kamil","Kamil@gmail.com","59023480");
        System.out.println(Kamil.getCastomerName() + " " + Kamil.getNumber());
*/
        /*VipCustomer p1 = new VipCustomer();
        System.out.println(p1.getName());
        VipCustomer p2 = new VipCustomer("Pawel",25000);
        System.out.println(p2.getName());
        VipCustomer p3 = new VipCustomer("Adrian", 3000, "mail2");
        System.out.println(p3.getName() +" " + p3.getEmail());*/



    }
}
