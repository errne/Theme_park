package StallsTests;

import Stalls.CandyFlossStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyFlossStallTest {
    private CandyFlossStall candyStall;
    private Visitor visitor11;

    @Before
    public void setUp() throws Exception {
        candyStall = new CandyFlossStall("Candysa", "Candelaria", "2");
        visitor11 = new Visitor(13, 161, 34.00);
    }

    @Test
    public void defaultPrice() {
        assertEquals(4.2, candyStall.defaultPrice(), 0.001);
    }

    @Test
    public void canGetpriceForVisitor() {
        assertEquals(4.2, candyStall.priceFor(visitor11), 0.0002);
    }

    @Test
    public void getName() {
        assertEquals("Candysa", candyStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Candelaria", candyStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("2", candyStall.getParkingSpot());
    }

    @Test
    public void getRating() {
        candyStall.setRating(8);
        assertEquals(8, candyStall.getRating());
    }
}