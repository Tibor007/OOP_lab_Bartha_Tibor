package lab12_3;

import java.util.ArrayList;

public class Stack {

    private ArrayList<Double> items;
    private final int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    public boolean isEmpty() throws SatckException {
        if (items.size() == 0) {
            throw new SatckException(0, capacity);
        }

        return false;
    }

    public boolean isFull() throws SatckException {
        if (items.size() >= capacity) {
            throw new SatckException(1, capacity);
        }
        return false;
    }

    public void push(Double o) throws SatckException {
        if (!isFull()) {
            items.add(o);
        }
    }

    public void pop() throws SatckException {
        if (!isEmpty()) {
            items.remove(items.size() - 1);
        }
    }

    public Double top() throws SatckException {
        if (!isEmpty()) {

            return items.get(items.size() - 1);
        }
        return null;
    }

    public int getSize() {
        return items.size();
    }
}

