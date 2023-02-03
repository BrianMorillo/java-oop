import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Brian Morillo
 * Description: Generic Stack Tests
 */
class GenericStackTest {

    @Test
    void getSizeTest() {
        int expectedSize = 2;
        GenericStack<String> stack = new GenericStack<>();
        stack.push("One");
        stack.push("Two");

        assertEquals(expectedSize, stack.getSize());
    }

    @Test
    void peekTest() {
        String expected = "Three";
        int expectedSize = 3;
        GenericStack<String> stack = new GenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push(expected);

        assertEquals(expected, stack.peek());
        assertEquals(expectedSize, stack.getSize());
    }

    @Test
    void pushTest() {
        String expected = "One";
        GenericStack<String> stack = new GenericStack<>();
        stack.push(expected);

        assertEquals(expected, stack.peek());
    }

    @Test
    void popTest() {
        String expected = "Three";
        int expectedSize = 2;
        GenericStack<String> stack = new GenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push(expected);

        assertEquals(expected, stack.pop());
        assertEquals(expectedSize, stack.getSize());
    }

    @Test
    void toStringTest() {
        String expected = "Stack: [One, Two, Three, Four]";
        GenericStack<String> stack = new GenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        assertEquals(expected, stack.toString());
    }
}