package com.soat.kata;

public class Stack {
    private int size = 0;
    private int stackLimit;

    public Stack(int stackLimit) {
        this.stackLimit = stackLimit;
    }

    public int getSize() {
        return size;
    }

    public void push(int element) {
        if(stackLimit == 0) {
            throw new StackLimitPassedException();
        }
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
}
