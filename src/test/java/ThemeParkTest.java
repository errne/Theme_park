import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class ThemeParkTest {
    private ThemePark park;
    private IceCreamStall icy;
    private TobaccoStall tabby;
    private CandyFlossStall candy;
    private Rollercoaster rolly;
    private Park parky;
    private Playground playground;
    private Visitor vip;


    @Before
    public void setUp(){
        park = new ThemePark("Fun Park");
        icy = new IceCreamStall("Icicle", "I.C. Wiener", "12" );
        icy.setRating(5);
        tabby = new TobaccoStall("Smoks", "Molly", "01");
        tabby.setRating(2);
        candy = new CandyFlossStall("Candida", "Kunigunda", "43");
        candy.setRating(4);
        rolly = new Rollercoaster("Hills");
        parky = new Park("Parky");
        parky.setRating(3);
        playground = new Playground("Bunnies");
        vip = new Visitor(35, 199, 500.00);
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

    @Test
    public void getAllAllowed(){
        park.addAttraction(parky);
        park.addStall(icy);
        park.addStall(tabby);
        park.addAttraction(rolly);
        park.addAttraction(playground);
        park.addStall(candy);
        assertEquals(4, park.getAllAllowedFor(vip).size());
    }

    @Test
    public void canGetReviewsString(){
        park.addAttraction(parky);
        park.addStall(icy);
        park.addStall(tabby);
        park.addAttraction(rolly);
        park.addAttraction(playground);
        park.addStall(candy);
        assertEquals("Parky: 3, Icicle: 5, Smoks: 2, Candida: 4, ", park.getReviewsString());
    }
}