package AttractionsTest;

import Attractions.Playground;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    private Playground playground;
    private Visitor visitor1;

    @Before
    public void before(){
        playground = new Playground("Bunnies");
        visitor1 = new Visitor(9, 137, 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bunnies", playground.getName());
    }

    @Test
    public void hasSecurity(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void canSetAndGetRating(){
        playground.setRating(4);
        assertEquals(4, playground.getRating());
    }
}
