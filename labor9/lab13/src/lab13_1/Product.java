package lab13_1;

public class Product {
    private final int id;
    private String name;
    private int amount;
    private double price;

    public Product(int id, String name, int amount, double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void updateAmount(int newAmount) {
        if (newAmount > 0) {
            amount += newAmount;
        }
    }

    @Override
    public String toString() {
        return name + " " + amount + " " + price;
    }
}
