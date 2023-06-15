package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class StackTest {
    @Test
    public void shouldAddANewItemToStack() {
        Stack stack = new Stack();
        stack.push('h');
        stack.push('e');
        assertEquals(2, stack.size());

        stack.push('l');
        assertEquals(3, stack.size());
    }

    @Test
    public void shouldRemoveItemFromStack() {
        Stack stack = new Stack();
        stack.push('h');
        stack.push('e');
        stack.push('l');

        assertEquals('l', stack.pop());
        assertEquals(2, stack.size());

        stack.push('d');
        assertEquals(3, stack.size());
    }

    @Test
    public void shouldReturnIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void shouldCorrectlyRemoveAndStackAgain() {
        Stack stack = new Stack();

        stack.push('h');
        stack.push('e');
        stack.push('l');
        stack.push('l');

        stack.pop();

        stack.push('l');
        stack.push('o');

        String reversedString = "";
        while(!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        assertEquals("olleh", reversedString);
    }
}
