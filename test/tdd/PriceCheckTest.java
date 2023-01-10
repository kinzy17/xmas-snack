package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceCheckTest {

     PriceCheck checkPrice = new PriceCheck();

    @Test

    public void testBagAmount() {

        checkPrice.checkBagPrice();

        int bagPrice = checkPrice.checkBagPrice();

        assertEquals(300, bagPrice);
    }

        @Test

        public void testShoePrice() {

            checkPrice.checkShoePrice();

            int shoePrice = checkPrice.checkShoePrice();

            assertEquals(500, shoePrice);

        }

            @Test

            public void testClothPrice () {
                checkPrice.checkClothPrice();


                int clothPrice = checkPrice.checkClothPrice();
            }


        }


