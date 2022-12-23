package Personal;

import java.util.Scanner;

public class ScoreLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n%s%n", "what is your predicted scoreline", "for the FIFA world cup final match between", "Argentina and France?");

        System.out.printf("%s%n", "input the amount of goals to be scored by Argentina....");
        int userInput1 = input.nextInt();

        System.out.println("input the amount of goals to be scored by France....");
        int userInput2 = input.nextInt();

        if (userInput1 > userInput2){
            System.out.printf("%s%n%s%n", "Argentina are World Champions", "VAMOS!, VAMOS!!, VAMOS!!!");
        }
        else {
            System.out.println("LIFE IS UNFAIR");
        }

    }
}
