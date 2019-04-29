package com.soat.kata;

public class Stack {
    private int size;
    private int limit;

    public Stack(int limit) {
        this.limit = limit;
    }

    public boolean isEmpty() {
        return true;
    }

    public int getSize() {
        return size;
    }

    public void push(int element) {
        size++;
        if(size > limit) {
            throw new LimitPassedException();
        }
    }

    public void pop() {
        size--;
    }
}
