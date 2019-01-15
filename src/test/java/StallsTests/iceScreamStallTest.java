package StallsTests;

import Stalls.IceCreamStall;
import Stalls.Stall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class iceScreamStallTest {
    private IceCreamStall icy;

    @Before
    public void before(){
        icy = new IceCreamStall("Icycle", "Isla", "23");
    }

    @Test
    public void hasName(){
        assertEquals("Icycle", icy.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Isla", icy.getOwnerName());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(2.8, icy.defaultPrice(), 0.0002);
    }
}
