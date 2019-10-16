package mastering.repetition;

public class Account {
    private String number;
    private double balance;
    private String castomerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this("????????",0,"Default name","Default mail","Default phoneNumber");
        System.out.println("Empty constructor");
    }
    public Account(String number, double balance,String castomerName,String email, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.castomerName = castomerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String castomerName, String email, String phoneNumber) {
        this("9999999",100.55,castomerName,email,phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String account) {
        this.number = account;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCastomerName() {
        return castomerName;
    }

    public void setCastomerName(String castomerName) {
        this.castomerName = castomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void desposit(int desposit){
        this.balance = this.balance + desposit;
    }
    public void withdraw(int withdraw){
        if(balance >= withdraw ) {
            balance = balance - withdraw;
        }else{
            System.out.println("Insufficient funds");
        }
    }
}
