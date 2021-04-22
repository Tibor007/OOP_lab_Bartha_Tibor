public interface IQueue {

    boolean isFull();
    boolean isEmpty();
    void enQueue(Object obj);
    Object deQueue();
    void printQueue();

}
