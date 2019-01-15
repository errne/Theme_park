package AttractionsTest;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    private Park park;

    @Before
    public void before(){
        park = new Park("Spark");
    }

    @Test
    public void hasName(){
        assertEquals("Spark", park.getName());
    }

    @Test
    public void canSetGetRating(){
        park.setRating(6);
        assertEquals(6, park.getRating());
    }
}
