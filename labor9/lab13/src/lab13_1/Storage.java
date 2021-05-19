package lab13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Storage {
    private Map<Integer, Product> products = new HashMap<>();

    public Storage(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                Product p = new Product(Integer.parseInt(items[0]),
                        items[1].trim(),
                        Integer.parseInt(items[2].trim()),
                        Double.parseDouble(items[3].trim()));
                products.put(id, p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void update(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split("");
                int update = 0;
                int id = Integer.parseInt(items[0].trim());
                int amount = Integer.parseInt(items[1].trim());
                if (products.containsKey(id)) {
                    Product productToUpdate = products.get(id);
                    productToUpdate.updateAmount(amount);
                    update++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void listProducts() {
        /*for(Integer key : products.keySet()){
            System.out.println(key);
        }*/
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}



