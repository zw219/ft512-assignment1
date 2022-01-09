import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;

public class Test {

    @org.junit.Test
    public void testMultiplication() {
        Dollar five= new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
