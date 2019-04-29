package com.soat.kata;

public class Stack {
    private int size;

    public boolean isEmpty() {
        return true;
    }

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
