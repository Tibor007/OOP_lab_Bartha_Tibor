package lab8.stack;

import java.util.ArrayList;

public class StackAggregation {
    private final int capacity;
    private ArrayList<Object> items;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    public boolean isFull() {
        if (items.size() >= capacity) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (items.size() == 0) {
            return true;
        }

        return false;
    }

    public void push(Object o) {
        if (!isFull()) {
            items.add(o);
        } else {
            System.out.println("Megtelt a verem");
        }
    }

    public void pop() {
        int a;

        if (items.size() == 0) {
            System.out.println("Ures a verem");
        } else {
            items.remove(items.size() - 1);
        }

    }

    public int getSize() {
        return items.size();
    }

    public Object Top() {
        if (items.size() < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return items.get(items.size() - 1);
        }
    }
}
