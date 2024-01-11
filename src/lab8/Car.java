package lab8;

public class Car {
    private final String model;
    private final String maker;
    private final String color;
    private final String location;
    private final int price;

    public Car(String model, String maker, String color, String location, int price) {
        this.model = model;
        this.maker = maker;
        this.color = color;
        this.location = location;
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public String getMaker() {
        return maker;
    }
    public String getColor() {
        return color;
    }
    public String getLocation() {
        return location;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return this.getMaker() + " " + this.getModel() + " in " + this.getColor() + " located in " +
                this.getLocation() + " is for sale for " + this.getPrice() + "$";
    }
}
