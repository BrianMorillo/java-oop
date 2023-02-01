import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Author: Brian Morillo
 * Description: Factorial Calculator Test
 */
class FactorialCalculatorTest {
    @Test
    void factorialOfTen() {
        assertEquals(BigInteger.valueOf(3628800),
                FactorialCalculator.fact(10));
    }

    @Test
    void negativeNumberIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.fact(-1));
    }
}