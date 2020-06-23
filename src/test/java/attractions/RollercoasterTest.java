package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(1,1,1);
        visitor2 = new Visitor(100,100,100000);
        visitor3 = new Visitor(1000,1000,100000);
        visitor4 = new Visitor(1,1000,100000);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo() {
        assertEquals(true,rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void isAllowedTo__false__young_short() {
        assertEquals(false,rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedTo__false__too_short() {
        assertEquals(false,rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isAllowedTo__false__too_young() {
        assertEquals(false,rollerCoaster.isAllowedTo(visitor4));
    }
}
