import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TabaccoStallTest {

    TabaccoStall tabaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        tabaccoStall = new TabaccoStall("Weezy's", "Death", 666, 6);
        visitor1 = new Visitor(25, 170, 50);
        visitor2 = new Visitor(12, 130, 10);
    }

    @Test
    public void canRefuseVisitorIfUnder18(){
        assertFalse(tabaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void canAllowVisitorIf18orOver(){
        assertTrue(tabaccoStall.isAllowedTo(visitor1));
    }
}
