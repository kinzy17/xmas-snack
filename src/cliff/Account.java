package cliff;

public class Account{

    private String  name;

    private double balance;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void Deposit(double cash){
        if(cash>=0)
            balance += cash;
    }

    public void Withdraw(double cash){
        balance -= cash;
    }

}


