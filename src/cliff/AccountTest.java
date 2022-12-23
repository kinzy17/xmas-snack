package cliff;

public class AccountTest {

    public static void main(String[] args){

        Account account = new Account();
        account.setName("Lawal Sulaimon");

        String theName = account.getName();

        System.out.println("Account name is " + theName);

        System.out.println("the initial balance is " + account.getBalance());

        account.Deposit(25000);
        System.out.println("the balance after deposit is " + account.getBalance());

        account.Withdraw(24000);
        System.out.println("the balance after withdrawal is " + account.getBalance());

    }

}

