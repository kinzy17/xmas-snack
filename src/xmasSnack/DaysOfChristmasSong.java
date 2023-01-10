package xmasSnack;

public class DaysOfChristmasSong {


    public static void main(String [] args)
    {




        for(int i=1; i<=12; i++)
        {
            System.out.print("On the ");

            switch (i) {
                case 1 -> System.out.print("First");
                case 2 -> System.out.print("Second");
                case 3 -> System.out.print("Third");
                case 4 -> System.out.print("Fourth");
                case 5 -> System.out.print("Fifth");
                case 6 -> System.out.print("Sixth");
                case 7 -> System.out.print("Seventh");
                case 8 -> System.out.print("Eighth");
                case 9 -> System.out.print("Ninth");
                case 10 -> System.out.print("Tenth");
                case 11 -> System.out.print("Eleventh");
                case 12 -> System.out.print("Twelfth");
            }


            System.out.println(" Day of Christmas my true love gave to me ");

            for(int m=1; m<=i; m++)
            {
                switch (m) {
                    case 1 -> System.out.println(" A partridge in a pear tree ");
                    case 2 -> System.out.println(" two Turtle Doves ");
                    case 3 -> System.out.println(" three French Hens ");
                    case 4 -> System.out.println(" four Calling Birds ");
                    case 5 -> System.out.println(" five Golden Rings ");
                    case 6 -> System.out.println(" six Geese a laying ");
                    case 7 -> System.out.println(" seven Swans a swimming ");
                    case 8 -> System.out.println(" eight Maids a milking ");
                    case 9 -> System.out.println(" nine Ladies Dancing ");
                    case 10 -> System.out.println(" ten Lords a leaping ");
                    case 11 -> System.out.println(" eleven Pipers piping ");
                    case 12 -> System.out.println(" twelve Drummers Drumming ");
                }
            }


        }
    }
}
