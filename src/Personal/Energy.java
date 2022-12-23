package Personal;

import java.util.Scanner;

public class Energy {

    public static void main(String[] args) {

        Scanner werey = new Scanner(System.in);

        System.out.println("enter the amount of water in kg");
        double userInput1 = werey.nextDouble();

        System.out.println("enter the initial temperature");
        double userInput2 = werey.nextDouble();

        System.out.println("enter the final temperature");
        double userInput3 = werey.nextDouble();

        double M = userInput1;

        double t1 = userInput2;

        double t2 = userInput3;

        double Q = M * (t2 - t1) * 4184;

        System.out.println("the energy needed is " + Q);



    }






}
