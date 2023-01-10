package xmasSnack;

import java.util.Scanner;

public class GrossPayCalculator {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (true) {
                System.out.println("Name(empty - Exit):");
                String name = in.nextLine();
                if(name.length()==0){
                    break;
                }
                System.out.println("Hours");
                double hours = Double.parseDouble(in.nextLine());
                System.out.println("Rate:");
                double rate = Double.parseDouble(in.nextLine());
                System.out.println(name + " Gross: " + (hours <= 40 ? rate * hours : (rate * 40) + (rate * (hours - 40) * 1.5)));
            }
        }
    }
    
