package tdd;

import Personal.Comparison;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest {
    Comparison comparison;

    @BeforeEach
    void GiveThemAll(){

        comparison = new Comparison();
    }

    @Test

    void addThreeIntegers(){

        int sum = comparison.addThreeIntegers(2,3,5);

        assertEquals(10, sum);

    }

    @Test

    void FindMinimumInteger(){

//        verify
        assertEquals(3, comparison.findMinimum(3,5,7) );
    }

    @Test

    void FindProduct(){

//        verify
        assertEquals(8, comparison.findProduct(4,1,2));

    }

    @Test

    void FindAverage(){

//        verify
        assertEquals(6, comparison.findAverage(7,2,3));

    }
    @Test

    void FindMax(){

        assertEquals(7, comparison.FindMax(4,1,7));



    }
}
