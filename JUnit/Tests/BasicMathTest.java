import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicMathTest {

    @Test
    void add() {
        BasicMath m = new BasicMath();
        int expect = 8;
        int actual = m.add(6,2);
        assertEquals(expect,actual);
    }
    @Test
    void divide() {
        BasicMath m = new BasicMath();
        double expect = 8;
        double actual = m.divide(16,2);
        assertEquals(expect,actual);
    }
    @Test
    void subtract() {
        BasicMath m = new BasicMath();
        int expect = 8;
        int actual = m.subtract(10, 2);
        assertEquals(expect, actual);
    }
    @Test
    void multiply() {
        BasicMath m = new BasicMath();
        int expect = 8;
        int actual = m.subtract(10 , 2);
        assertEquals(expect, actual);

    }
}