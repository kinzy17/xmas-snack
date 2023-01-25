package xmasSnack;

import java.security.SecureRandom;

public class CounterPrinter2 {
    public static void main(String[] args) {


        for(int counter = 0; counter < 10; counter++){
            SecureRandom secureRandom = new SecureRandom();
            int num = secureRandom.nextInt(10);
            System.out.println(num);
        }
    }
}
