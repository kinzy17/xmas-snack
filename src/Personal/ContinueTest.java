package Personal;

import java.util.Scanner;

public class ContinueTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int count = 1; count <= 10; count++){
            if(count == 5 || count == 6){
                continue;
            }
            System.out.println(count);
        }
    }
}
