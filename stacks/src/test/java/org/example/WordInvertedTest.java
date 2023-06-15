package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WordInvertedTest {
    @Test
    public void shouldInvertAWord() {
        String word = "hello";
        String reversedWord = WordInverter.reverse(word);
        assertEquals("olleh", reversedWord);
    }
}
