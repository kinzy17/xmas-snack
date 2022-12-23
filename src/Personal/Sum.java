package Personal;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner addInt = new Scanner(System.in);

        System.out.printf("%s%n", "input first decimal");
        double userInput1 = addInt.nextDouble();

        System.out.printf("%s%n", "input second decimal");
        double userInput2 = addInt.nextDouble();

        double add = userInput1 + userInput2;

        System.out.printf("The sum of both decimals are %.3f%n", add);
        
    }
}
