package xmaxSnackCorrection;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 1;

        while(counter <=10){
            System.out.println("input grades");
            int grade = input.nextInt();
            total = total + grade;
            counter = counter + 1;
        }
        int average = total / 10;

        System.out.printf("%nThe total sum of grades is: %d", total);
        System.out.printf("%nThe average of the total grades is: %d", average);
    }
}
