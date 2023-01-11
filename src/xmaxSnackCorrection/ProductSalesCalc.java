package xmaxSnackCorrection;

import java.util.Scanner;

public class ProductSalesCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;


        System.out.println("input product number or -1 to end");
        int proNum = input.nextInt();
        System.out.println("input quantity sold or -1 to end");
        int quantity = input.nextInt();

        while (quantity != -1){
            total = total + quantity;
            counter++;
            System.out.println("input product number or -1 to end");
            proNum = input.nextInt();
            System.out.println("input quantity sold or -1 to end");
            quantity = input.nextInt();

        }
        if (counter != 0){

        }


    }
}
