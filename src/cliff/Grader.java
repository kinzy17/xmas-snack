package cliff;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        System.out.println("input grade or -1 to end: ");
        int grade = input.nextInt();

        while(grade != -1){
            total = total + grade;
            counter++;
            System.out.println("input next grade or -1 to end: ");
            grade = input.nextInt();
        }

        if(counter != 0){
            int average = total / counter;
            System.out.printf("%nThe average is: %d ", average);
        }
        else {
            System.out.println("No grades were entered");
        }
    }
}
