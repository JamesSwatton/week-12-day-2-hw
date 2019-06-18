import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(12, 152, 20);
    }

    @Test
    public void hasAge(){
        assertEquals(12, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(152, visitor.getHeight(), 0.01);
    }

    @Test
    public void hasMoney(){
        assertEquals(20, visitor.getMoney(), 0.01);
    }
}
