package Personal;

import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {

        Scanner gee = new Scanner(System.in);

        System.out.println("enter a value for feet");

        double lil = gee.nextDouble();

        double feet = 0.305;

        double meters = feet * lil;

        System.out.println(lil + " feet is " + meters + " meters.");







    }








}
