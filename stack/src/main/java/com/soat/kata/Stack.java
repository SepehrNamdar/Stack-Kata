package com.soat.kata;

import java.util.List;

public class Stack {
    private int size = 0;
    private int stackLimit;
    private int[] elements;

    public Stack(int stackLimit) {
        this.stackLimit = stackLimit;
        elements = new int[stackLimit];
    }

    public int getSize() {
        return size;
    }

    public void push(int element) {
        if(stackLimit == 0) {
            throw new StackLimitPassedException();
        }
        elements[size] = element;
        size++;
    }

    public void pop() {
        if(stackLimit == 0) {
            throw new SteckUnderflowException();
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int top() {
        return elements[0];
    }
}
