package cliff;

public class Loops {

    public static void main(String[] args) {
        int counter = 15;

        while (counter >= 6){
            System.out.println(counter);
            counter--;
       }

        for (int count = 15; count >= 6; count--){
            System.out.println(count);
        }

        int counting = 15;
        do {
            System.out.println(counting);
            counting--;

        } while (counting >= 6);
    }





}
