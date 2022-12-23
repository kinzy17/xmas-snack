package tdd;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositMoneyTest() {

//        given that malik has an account
        Account malikAccount = new Account();
//        when malik deposits 23
        malikAccount.deposit(23);
//        check that the balance is 23
        int balance = malikAccount.getBalance();

        assertEquals(23, balance);
    }
        @Test
                public void depositTwiceTest(){
//            given malik has an account;
        Account malikAccount = new Account();
//        given there is 300 in the account;
        malikAccount.deposit(300);
        int balance = malikAccount.getBalance();
        assertEquals(300, balance);

//        when i try to deposit 200;
        malikAccount.deposit(200);

//        check that balance is 500;
        balance = malikAccount.getBalance();
        assertEquals(500, balance);


        }
        @Test
        public void depositNegativeAmountTest(){
//        given i have an account with zero balance;
            Account malikAccount = new Account();

//        when i try to deposit negative amount (-2300);
            malikAccount.deposit(-2300);

//        check that the balance is zero;
            int balance = malikAccount.getBalance();
            assertEquals(0, balance);

        }

        @Test
        public void withdrawTest() {
//        given i have an account with an available balance
            Account malikAccount = new Account();
            malikAccount.deposit(100);

//            when i try to withdraw 20
            malikAccount.withdraw(20);

//        check that balance is 80

            assertEquals(80, malikAccount.getBalance());











        }
}