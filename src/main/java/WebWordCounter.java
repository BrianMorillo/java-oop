import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * @author Brian Morillo
 * Date: 2/4/2022
 * Html word counter
 */
public class WebWordCounter {

    private static final String BODY_TAG = "<body>";
    private static final String HTML_TAGS = "<.*?>";
    private static final String HTML_ENTITIES = "&.*?;";
    private static final String SPECIAL_CHARACTERS =
            "[+^.:|,()©*%$#!?><{}\\\\[\\\\]]*";

    /**
     * Counts words in passed html URL
     * @param url
     * @return Map with all words and their ocurrences
     * @throws IOException
     */
    public static Map<String, Integer> count(URL url) throws IOException {
        Map<String, Integer> wordMap = new TreeMap<>();
        Scanner input = new Scanner(url.openStream());

        // sets the input to an index where the actual content of the page starts
        input.findAll(BODY_TAG).findFirst();

        // formats each line and adds it to the words arraylist
        while(input.hasNext()){
            String line = getFormattedLine(input.nextLine());

            for (String wordInLine: line.split(" ")) {
                if(!wordInLine.isEmpty())
                    addToMap(wordMap, wordInLine);
            }
        }

        input.close();

        return wordMap;
    }

    /** Adds a word to the map*/
    private static void addToMap(Map<String, Integer> wordMap, String wordToAdd) {
        int count = 1;

        if(wordMap.containsKey(wordToAdd)) {
            count = wordMap.get(wordToAdd);
            count++;
        }

        wordMap.put(wordToAdd, count);
    }

    /** formats a string by removing html properties and tags*/
    public static String getFormattedLine(String line){
        String formattedLine;
        // remove HTML tags
        formattedLine = line.replaceAll(HTML_TAGS, "");

        // remove HTML Entities
        formattedLine = formattedLine.replaceAll(HTML_ENTITIES, "");

        // removes special characters
        formattedLine = formattedLine.replaceAll(SPECIAL_CHARACTERS, "");

        return formattedLine.toUpperCase(Locale.ROOT);
    }
}


