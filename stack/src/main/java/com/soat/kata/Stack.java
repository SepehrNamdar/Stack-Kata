package com.soat.kata;

public class Stack {
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void push(int element) {
        size++;
    }

    public void pop() {
        size--;
    }
}
