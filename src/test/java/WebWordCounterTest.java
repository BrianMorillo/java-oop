import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WebWordCounterTest {

    /**
     * Tests counting words in sample html file
     */
    @Test
    void countTest() {
        try {
            final int EXPECTED_SIZE = 34;
            final int LOREM_COUNT = 2;
            final String LOREM = "LOREM";
            final String FILENAME = "sample.html";
            ClassLoader classLoader = getClass().getClassLoader();
            URL resource = classLoader.getResource(FILENAME);

            assert resource != null;
            Map<String, Integer> wordsCounted = WebWordCounter.count(resource);
            assertEquals(EXPECTED_SIZE, wordsCounted.size());
            assertTrue(wordsCounted.containsKey(LOREM));
            assertEquals(LOREM_COUNT, wordsCounted.get(LOREM));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}