package lab7;

public class Product {
    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return name.toLowerCase() + " весом " + weight + " кг";
    }
}
