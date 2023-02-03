import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Brian Morillo
 * Description: Roman Numeral System Utility tests
 */
class RomanUtilTest {

    @Test
    void toInt1804Test() {
        int expected = 1804;
        int actual = RomanUtil.toInt("MDCCCIV");

        assertEquals(expected, actual);
    }
    @Test
    void toInt4949Test() {
        int expected = 4949;
        int actual = RomanUtil.toInt("MMMMCMXLIX");

        assertEquals(expected, actual);
    }
}