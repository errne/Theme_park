import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {
    Visitor visitor1;

    @Before
    public void setUp() {
        visitor1 = new Visitor(19, 180, 75.00);
    }

    @Test
    public void getAge() {
        assertEquals(19, visitor1.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(180, visitor1.getHeight());
    }

    @Test
    public void getMoney() {
        assertEquals(75.00, visitor1.getMoney(), 0.001);
    }
}