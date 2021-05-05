package lab9_3;

public class Product implements Comparable<Product>{
private final int ID;
private String name;
private int amount;
private int price;

    public Product(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.ID=;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public int increseAmount(int newAmount){

    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
