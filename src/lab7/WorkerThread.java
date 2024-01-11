package lab7;

import java.util.Random;

public class WorkerThread extends Thread {
    private final String[] possibleProducts;
    private final Warehouse warehouse;
    private final String name;

    public WorkerThread(Warehouse warehouse, String name) {
        possibleProducts = new String[]{"Телевизор", "Диван", "Холодильник", "Стиральная машина", "Микроволновая печь"};
        this.warehouse = warehouse;
        this.name = name;
    }

    public void run() {
        Random rnd = new Random();
        synchronized (warehouse) {
            while (true) {
                if (warehouse.isFull()) {
                    System.out.println(name + " переходит на новый склад. " +
                            "Текущий склад был заполнен товарами: " + warehouse.getItems());
                    break;
                }
                Product product = new Product(possibleProducts[rnd.nextInt(possibleProducts.length)] ,
                        (int) (Math.random() * 40) + 1);
                warehouse.addProduct(product);
            }
        }
    }
}
