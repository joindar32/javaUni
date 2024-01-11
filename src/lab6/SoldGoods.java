package lab6;

import java.util.*;

public class SoldGoods {
    public static class Product {
        private final String name;
        private final int price;
        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return this.name;
        }
        public int getPrice() {
            return this.price;
        }
    }
    private static List<Product> list;
    public SoldGoods() {
        list = new ArrayList<>();
    }

    public void pushProduct(Product product) {
        list.add(product);
    }

    public void soldGoodsOut() {
        for (Product product : list) {
            System.out.println(product.getName() + " - цена: " + product.getPrice());
        }
    }

    public long totalPrice() {
        long totalPrice = 0;
        for (Product product : list) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public String mostPopular() {
        int max = 0;
        String mostPopular = "";
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getName().equals(list.get(j).getName())) {
                    count++;
                    if (count > max) {
                        max = count;
                        mostPopular = list.get(i).getName();
                    }
                }
            }
        }
        return mostPopular;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Мяч", 15);
        Product product2 = new Product("Велосипед", 150);
        Product product3 = new Product("Мяч", 15);
        Product product4 = new Product("Велосипед", 150);
        Product product5 = new Product("Мяч", 15);
        Product product6 = new Product("Лыжи", 100);

        SoldGoods soldGoodsList = new SoldGoods();

        soldGoodsList.pushProduct(product1);
        soldGoodsList.pushProduct(product2);
        soldGoodsList.pushProduct(product3);
        soldGoodsList.pushProduct(product4);
        soldGoodsList.pushProduct(product5);
        soldGoodsList.pushProduct(product6);

        soldGoodsList.soldGoodsOut();

        System.out.println("\nПолная стоимость всех товаров: " + soldGoodsList.totalPrice());
        System.out.println("\nСамый популярный товар: " + soldGoodsList.mostPopular().toLowerCase());
    }
}
