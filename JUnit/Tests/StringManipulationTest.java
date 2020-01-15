import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    void returnInitialsInCaps() {
        StringManipulation str = new StringManipulation();
        String testData = "selVin pEndejo Putto";
        String expected = "SPP";
        String actual = str.returnInitialsInCaps(testData);
        String message = "This is fail!";
        assertEquals(expected,actual,message);

    }
}