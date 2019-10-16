package mastering.repetition;

public class Main {

    public static void main(String[] args) {
        Contacts Kamil = new Contacts("Kamil","255667");
        Contacts Pawel = new Contacts("Pawel","75564467");
        Contacts Jan = new Contacts("Jan","3213123");
        Contacts Agata = new Contacts("Agata","556632317");

        MobilePhone m1 = new MobilePhone("5000032");
        m1.Contacts.add(Kamil);
        System.out.println(m1.getMyNumber());
        m1.print();
        m1.Contacts.add(Pawel);
        m1.print();
        m1.Contacts.remove(Kamil);
        m1.print();
        m1.add(Jan);
        m1.print();
        m1.add(Jan);
        m1.print();
        m1.Contacts.add(Jan);
        m1.print();
        m1.removeConctact(Jan);
        m1.print();
        m1.Contacts.remove(Jan);
        m1.print();
        m1.removeConctact(Jan);
        m1.print();
        m1.modifyContact(0,Kamil);
        m1.print();
        m1.removeContact(Jan);
        m1.print();
        m1.queryConcact(Kamil);
        m1.print();
        m1.add(Agata);
        m1.print();
        m1.findContact(Agata);
        m1.update(Kamil,Jan);
        m1.print();
        m1.update(Jan,Pawel);
        m1.print();
// to update

    }
}
