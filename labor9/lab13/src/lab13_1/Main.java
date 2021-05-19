package lab13_1;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage("data100.txt");
        //storage1.listProducts();

        long startTime = System.nanoTime();
        storage1.update("update10.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
