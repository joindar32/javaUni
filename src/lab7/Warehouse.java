package lab7;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final List<Product> list;
    public Warehouse() {
        list = new ArrayList<>();
    }
    public synchronized void addProduct(Product product) {
        if (this.getWeight() + product.getWeight() <= 150) {
            list.add(product);
            System.out.println("Был добавлен товар: " + product);
        }
    }
    public boolean isFull() {
        return this.getWeight() >= 150;
    }
    public synchronized int getWeight() {
        int sum = 0;
        for (Product product : list) {
            sum += product.getWeight();
        }
        return sum;
    }
    public List<Product> getItems() {
        return list;
    }
}
