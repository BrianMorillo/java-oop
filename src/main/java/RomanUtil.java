import java.util.HashMap;
import java.util.Map;

/**
 * Author: Brian Morillo
 * Date: 6/20/2022
 * Description: Roman numeral system utility
 */
public class RomanUtil {
public static final Character ONE = 'I';
public static final Character FIVE = 'V';
public static final Character TEN = 'X';
public static final Character FIFTY = 'L';
public static final Character ONE_HUNDRED = 'C';
public static final Character FIVE_HUNDRED = 'D';
public static final Character ONE_THOUSAND = 'M';
public static final String FOUR = "IV";
public static final String NINE = "IX";
public static final String FORTY = "XL";
public static final String NINETY = "XC";
public static final String FOUR_HUNDRED = "CD";
public static final String NINE_HUNDRED = "CM";
private static final String CONVERTED_FOUR = "IIII";
private static final String CONVERTED_NINE = "VIIII";
private static final String CONVERTED_FORTY = "XXXX";
private static final String CONVERTED_NINETY = "LXXXX";
private static final String CONVERTED_FOUR_HUNDRED = "CCCC";
private static final String CONVERTED_NINE_HUNDRED = "DCCCC";

    /**
     * Converts a Roman number String to integer value
     * @param romanStr to convert
     * @return int value holding conversion
     */
    public static int toInt(String romanStr){
        int value = 0;
        romanStr = romanStr.replace(FOUR, CONVERTED_FOUR).
                replace(NINE, CONVERTED_NINE).
                replace(FORTY, CONVERTED_FORTY).
                replace(NINETY, CONVERTED_NINETY).
                replace(FOUR_HUNDRED, CONVERTED_FOUR_HUNDRED).
                replace(NINE_HUNDRED, CONVERTED_NINE_HUNDRED);

        Map<Character, Integer> romanIntMap = getRomanSymbolIntMap();

        for(int idx = 0; idx < romanStr.length(); idx++)
            value += romanIntMap.get(romanStr.charAt(idx));

        return value;
    }

    /**
     * Creates a map with Roman letters as Keys and their equivalent values as integers
     * @return map holding Roman letters and their values
     */
    public static Map<Character, Integer> getRomanSymbolIntMap(){
        Map<Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put(ONE, 1);
        romanIntMap.put(FIVE, 5);
        romanIntMap.put(TEN, 10);
        romanIntMap.put(FIFTY, 50);
        romanIntMap.put(ONE_HUNDRED, 100);
        romanIntMap.put(FIVE_HUNDRED, 500);
        romanIntMap.put(ONE_THOUSAND, 1000);

        return romanIntMap;
    }

}
