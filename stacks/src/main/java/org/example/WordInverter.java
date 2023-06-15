package org.example;

public class WordInverter {
    static Stack characterStack = new Stack();

    static String reverse(String word) {
        for (char character : word.toCharArray()) {
            characterStack.push(character);
        }

        String reversedString = "";
        while(!characterStack.isEmpty()) {
            reversedString += characterStack.pop();
        }

        return reversedString;
    }
}
