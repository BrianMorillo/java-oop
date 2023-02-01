import java.math.BigInteger;

/**
 * Author: Brian Morillo
 * Date: 1/30/2022
 * Description: Recursion Number Factorial Calculator
 */
public class FactorialCalculator {
    /**
     * Calculates a number's factorial using Recursion
     * @param n number to calculate the factorial from
     * @return n's factorial
     */
    public static BigInteger fact(long n){
        BigInteger result = new BigInteger(n + "");
        if (n <= 1)
            return BigInteger.ONE;
        else // uses BigInteger multiply function to calculate factorial
            return result.multiply(fact(result.subtract(BigInteger.ONE).longValue()));
    }
}
