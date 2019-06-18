import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Mooby's Ice Cream", "Mooby", 52, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Mooby's Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Mooby", iceCreamStall.getOwner());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(52, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(3, iceCreamStall.getRating());
    }
}
