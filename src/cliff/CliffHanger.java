package cliff;

import java.util.Scanner;

public class CliffHanger {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number");

        int userInput = input.nextInt();

        if(userInput==0) System.out.println("desiderata");

        if(userInput==1) System.out.println("equipment");

    }
}
