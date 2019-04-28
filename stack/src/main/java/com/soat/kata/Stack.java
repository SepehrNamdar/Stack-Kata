package com.soat.kata;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private int size = 0;
    private int stackLimit;
    private List<Integer> elements;

    public Stack(int stackLimit) {
        if(stackLimit < 0) {
            throw new IllegalCapacityException();
        }
        this.stackLimit = stackLimit;
        elements = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public void push(int element) {
        if(stackLimit == 0) {
            throw new StackLimitPassedException();
        }
        if(size == 0) {
            elements.add(size, element);
        } else {
            elements.add(size - 1, element);
        }
        size++;
    }

    public void pop() {
        if(stackLimit == 0) {
            throw new SteckUnderflowException();
        }
        elements.remove(0);
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int top() {
        return elements.get(0);
    }
}
