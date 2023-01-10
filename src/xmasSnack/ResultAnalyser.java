package xmasSnack;

import java.util.Scanner;

public class ResultAnalyser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int result = 0;
        int counter = 1;


        while(counter <= 10){
            System.out.print("enter result (1 for passed and 2 for failed)");
            counter = input.nextInt();

            if(result == 1){
                passes = passes + 1;
            }
            else {
                failures = failures + 1;
            }
            counter++;
        }

        System.out.println("passes: ");
        System.out.println("failures: ");

        if (passes > 8) {
            System.out.println("Bonus for Grace");
        }

        }

    }

