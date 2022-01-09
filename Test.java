import org.junit.Assert.*;

import static junit.framework.TestCase.*;

public class Test {

    @org.junit.Test
    public void testMultiplication() {
        Dollar five= new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @org.junit.Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}
