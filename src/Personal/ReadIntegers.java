package Personal;

import java.util.Scanner;

public class ReadIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int total = 0;
       int intCounter = 1;

       while (intCounter <= 5){
           System.out.println("input grade");
           int grade = input.nextInt();
           total = total + grade;
           intCounter = intCounter + 1;
       }

        System.out.printf("%nThe total sum of students grade is %d%n", total);


    }







}
