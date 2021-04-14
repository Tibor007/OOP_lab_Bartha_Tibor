package lab8.stack;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {

    private final int capacity;

    public StackInheritance(int capacity){
        super(capacity);
        this.capacity = capacity;
    }

    public void push(Object o){
        if(super.size()< capacity){
            super.add(o);
        }
        else {
            System.out.println("Megtelt a verem");
        }
    }



}
