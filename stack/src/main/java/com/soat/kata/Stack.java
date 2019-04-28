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
        int index = size;
        elements.add(index - size, element);
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
        if(stackLimit == 0 || isEmpty()) {
            throw new StackIsEmptyException();
        }
        return elements.get(0);
    }

    public List<Integer> getElements() {
        return elements;
    }

    public int find(int element) {
        return elements.indexOf(element);
    }
}
