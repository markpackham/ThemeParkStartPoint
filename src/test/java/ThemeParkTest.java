import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        visitor1 = new Visitor(1,1,1);
        visitor2 = new Visitor(100,100,100000);
        visitor3 = new Visitor(1000,1000,100000);
        visitor4 = new Visitor(1,1000,100000);
        themePark = new ThemePark();
    }

    @Test
    public void getAllReviewed() {
        themePark.add(rollerCoaster);
        themePark.add(candyflossStall);
        assertEquals(2,themePark.getAllReviewed().size());
    }
}