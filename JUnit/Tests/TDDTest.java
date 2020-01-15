import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TDDTest {
    @Test
    void numbersSRoot(){
        TDD math = new TDD();
        int testData = 34;
        int expected = 34*34;
        int actual = math.numberSroot(testData);
        assertEquals(expected,actual);
    }

}