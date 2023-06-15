package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Character> stackList;
    private int top;

    public Stack() {
        stackList = new ArrayList<>();
        top = -1;
    }

    public void push(Character character) {
        stackList.add(character);
        top += 1;
    }

    public char pop() {
        char character =  stackList.remove(top);
        top--;
        return character;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
