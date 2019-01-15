package AttractionsTest;

import Attractions.Dodgems;
import Attractions.Playground;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    private Dodgems dod;
    private Visitor visitor1;
    private Visitor visitor2;


    @Before
    public void before(){
        dod = new Dodgems("Bimp");
        visitor1 = new Visitor(19, 137, 10.00);
        visitor2 = new Visitor(11, 147, 45.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bimp", dod.getName());
    }

    @Test
    public void canSetAndGetRating(){
        dod.setRating(4);
        assertEquals(4, dod.getRating());
    }


    @Test
    public void hasDefaultPrice(){
        assertEquals(4.5, dod.priceFor(visitor1), 0.001);
    }

    @Test
    public void hasDiscountForkids(){
        assertEquals(2.25, dod.priceFor(visitor2), 0.001);
    }
}
