import org.junit.Assert.*;

import static junit.framework.TestCase.*;

public class Test {

    @org.junit.Test
    public void testMultiplication() {
        Dollar five= new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @org.junit.Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }

    @org.junit.Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
