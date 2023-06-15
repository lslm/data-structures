package org.example;

import java.util.ArrayList;

public class Main {

    // Stack
    public static void main(String[] args) {
        String hello = "hello"; // "olleh"
        // Forma errada
        ArrayList<Character> letras = new ArrayList<>();

        for(int i = 0; i < hello.length(); i++) {
            letras.add(hello.charAt(i));
        }

        System.out.println(letras);

        String palavraInvertida = "";
        for (int i = letras.size() - 1; i > -1; i--) {
            palavraInvertida += letras.get(i);
        }

        System.out.println(palavraInvertida);

        // Forma certa
        String reversedWord = WordInverter.reverse(hello);
        System.out.println(reversedWord);
    }
}