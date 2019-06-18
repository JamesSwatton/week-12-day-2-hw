import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Funtimes", 4);
        visitor1 = new Visitor(17, 152, 15);
        visitor2 = new Visitor(12, 130, 10);
    }

    @Test
    public void canRefuseVisitorIfOver15(){
        assertFalse(playground.isAllowedTo(visitor1));
    }

    @Test
    public void canAllowVisitorIf15orUnder(){
        assertTrue(playground.isAllowedTo(visitor2));
    }
}
