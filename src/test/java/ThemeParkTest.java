import Attractions.Park;
import Attractions.Rollercoaster;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {
    private ThemePark park;
    private IceCreamStall icy;
    private TobaccoStall tabby;
    private Rollercoaster rolly;
    private Park parky;

    @Before
    public void setUp(){
        park = new ThemePark("Fun Park");
        icy = new IceCreamStall("Icicle", "I.C. Wiener", "12" );
        icy.setRating(5);
        tabby = new TobaccoStall("Smoks", "Molly", "01");
        tabby.setRating(2);
        rolly = new Rollercoaster("Hills");
        parky = new Park("Parky");
        parky.setRating(3);
    }

    @Test
    public void hasName(){
        assertEquals("Fun Park", park.getName());
    }

    @Test
    public void getAllReviewed() {
        park.addAttraction(parky);
        park.addStall(icy);
        park.addStall(tabby);
        park.addAttraction(rolly);
        assertEquals(3, park.getAllReviewed().size());
    }
}