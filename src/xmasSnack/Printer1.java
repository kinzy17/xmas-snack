package xmasSnack;

import java.util.Scanner;

public class Printer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input grade");
        int grade = input.nextInt();

        if (grade >= 60) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }


    }
}
