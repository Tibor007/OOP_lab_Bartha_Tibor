package lab12_3;

public class SatckException extends Throwable{

    public SatckException(int id, int capacity){

        switch (id) {
            case 0 -> System.out.println("Empty stck");
            case 1 -> System.out.println("Stack is full, the capacity is: " + capacity);
            default -> System.out.println("Exception occurred");
        }
    }

    public SatckException(String message){
        super(message);
    }
}
