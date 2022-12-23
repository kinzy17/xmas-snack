package Personal;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number in pounds: ");

        double userInput = input.nextDouble();

        double pounds = 0.454;

        double kilogram = pounds * userInput;

        System.out.println(userInput + " pounds is " + kilogram);





    }











}
