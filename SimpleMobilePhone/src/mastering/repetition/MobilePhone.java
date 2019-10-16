package mastering.repetition;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contacts> Contacts;
    private String myNumber;

    public String getMyNumber() {
        return myNumber;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.Contacts = new ArrayList<>();
    }

    public void print(){
        System.out.println("contact list");
        for(int i=0;i<Contacts.size();i++){
            System.out.println(i+1 + ". " + Contacts.get(i).getName()+ " Phone number: " + Contacts.get(i).getPhoneNumber());
        }

    }
    public boolean add(Contacts contacts){
        if(findContact(contacts)>=0){
            System.out.println("contact is already on file");
            return false;
        }
        Contacts.add(contacts);
        return true;
    }
    public boolean update(Contacts oldContact, Contacts newCotact){
        int foundPostion = findContact(oldContact);
        if(foundPostion>0){
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        }else if(findContact(newCotact.getName())!=-1){
            System.out.println("This contact already exists");
        }
        this.Contacts.set(foundPostion,newCotact);
        System.out.println(oldContact.getName()+ " , was repleced with " + newCotact.getName());
        return true;
    }
    public void modifyContact(int position, Contacts contacts){
        Contacts.set(position,contacts);
        System.out.println("New verioson of contact: " + (position+1 + " has been updated"));
    }
    public boolean removeConctact(Contacts contacts){
        int foundPostion = findContact(contacts);
        if(foundPostion>0){
            System.out.println(contacts.getName() + ", was not found");
            return false;
        }
        this.Contacts.remove(foundPostion);
        System.out.println(contacts.getName()+ ", was deleted.");
        return true;
    }
    public void removeContact(Contacts contacts){
        Contacts.remove(contacts);
    }
    public int findContact(Contacts contacts){
       return Contacts.indexOf(contacts);
    }
    public int findContact(String contactName){
        for(int i = 0; i<this.Contacts.size();i++){
            Contacts contacts = this.Contacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public String queryConcact(Contacts contacts){
        if(findContact((contacts))>0){
            return contacts.getName();
        }
        return null;
    }
}
