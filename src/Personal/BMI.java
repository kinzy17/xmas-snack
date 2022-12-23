package Personal;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);

        System.out.println("enter weight in pounds");
        double pounds = result.nextDouble();

        System.out.println("enter height in inches");
        double inches = result.nextDouble();

        pounds = 0.45359237 * pounds;

        inches = 0.0254 * inches;

        double bodyMass = pounds / Math.pow(inches, 2);

        System.out.println("BMI is " + bodyMass);







    }









}
