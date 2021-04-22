import java.util.ArrayList;

public class ArrayListQuueue {
    public class ArrayListQueue implements IQueue {
        private ArrayList<Object> items;
        private final int CAPACITY;

        public ArrayListQueue(int CAPACITY) {
            this.CAPACITY = CAPACITY;
            items = new ArrayList<>(CAPACITY);
        }

    /*
        IQueue methods
     */

        @Override
        public boolean isFull() {
            return this.items.size() == this.CAPACITY;
        }

        @Override
        public boolean isEmpty() {
            return this.items.size() == 0;
        }

        @Override
        public void enQueue(Object o) {
            if(!this.isFull())
                this.items.add(o);
        }

        @Override
        public Object deQueue() {
            if(!this.isEmpty()) {
                Object o = this.items.get(0);
                this.items.remove(0);
                return o;
            }

            return null;
        }

        @Override
        public void printQueue() {
            for(int i = 0; i < this.items.size(); i++)
                System.out.print(this.items.get(i) + " ");
            System.out.println();
        }
    }
}
