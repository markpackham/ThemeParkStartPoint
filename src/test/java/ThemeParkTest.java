import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
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
    Playground playground;
    Dodgems dodgems;
    Park park;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        visitor1 = new Visitor(1,1,1);
        visitor2 = new Visitor(100,100,100000);
        visitor3 = new Visitor(1000,1000,100000);
        visitor4 = new Visitor(1,1000,100000);
        themePark = new ThemePark();
    }

    @Test
    public void getAllReviewed() {
        themePark.add(rollerCoaster);
        themePark.add(playground);
        assertEquals(2,themePark.getAllReviewed().size());
    }

    @Test
    public void visit__visit_count() {
        themePark.visit(visitor1,rollerCoaster);
        themePark.visit(visitor2,rollerCoaster);
        themePark.visit(visitor1,playground);
        assertEquals(2,rollerCoaster.getVisitCount());
    }

    @Test
    public void visit__visitedAttractions() {
        themePark.visit(visitor1,rollerCoaster);
        themePark.visit(visitor1,playground);
        themePark.visit(visitor1,dodgems);
        themePark.visit(visitor1,park);
        assertEquals(4,visitor1.getVisitedAttractions().size());
    }
}