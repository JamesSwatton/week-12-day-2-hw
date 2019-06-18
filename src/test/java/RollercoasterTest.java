import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before(){

        rollercoaster = new Rollercoaster("Uppydowner", 5);
        visitor1 = new Visitor(17, 152, 15);
        visitor2 = new Visitor(12, 130, 10);
        visitor3 = new Visitor(14, 130, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Uppydowner", rollercoaster.getName());
    }

    @Test
    public void canRefuseVisitorIfUnder12AndHeightUnder145(){
        assertFalse(rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canRefuseVisitorIfOver12ButHeightUnder145(){
        assertFalse(rollercoaster.isAllowedTo(visitor3));
    }

    @Test
    public void canAllowVisitorIfOver12andHeightOver145(){
        assertTrue(rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(5, rollercoaster.getRating());
    }
}
