package tdd;

public class Account {
    private int balance;
    public void deposit(int owo) {
       if(owo >= 0) balance = owo + balance;
    }
    public int getBalance() {
        return balance;
    }

    public void withdraw(int owo) {
        if(owo >= 0) balance = balance - owo;

    }




}
