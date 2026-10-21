
public class Encapsulation {
    public static void main(String[] args){
        BankAccount ba=new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);
        System.out.println(ba.getbalance());


    }
}

class BankAccount{
    private double balance;
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public double getbalance(){
        return balance;
    }
}
