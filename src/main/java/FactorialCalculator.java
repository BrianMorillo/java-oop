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
        BigInteger result = new BigInteger(String.valueOf(n));

        if(n < 0)
            throw new IllegalArgumentException("Number must be > or = to 0");
        else if (n == 1 || n == 0)
            return BigInteger.ONE;
        else // uses BigInteger multiply function to calculate factorial
            return result.multiply(fact(result.subtract(BigInteger.ONE).longValue()));
    }
}
