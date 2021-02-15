package stalls;

import org.junit.Before;
import org.junit.Test;
import behaviours.ISecurity;
import people.Visitor;



import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor10;
    Visitor visitor20;

    @Before
    public void setUp() throws Exception {
        visitor10 = new Visitor(8, 144, 5);
        visitor20 = new Visitor(27, 171, 30);
        tobaccoStall = new TobaccoStall("Marlboro", "Al Capone", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Marlboro", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Al Capone", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void allows20YearOld() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor20));
    }

    @Test
    public void doesNotAllow10YearOld() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor10));
    }
}
