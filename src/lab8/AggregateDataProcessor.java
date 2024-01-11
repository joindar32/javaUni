package lab8;

import java.util.*;
import java.util.stream.*;
public class AggregateDataProcessor {
    @DataProcessor
    public List<Car> calculateAveragePrice(List<Car> data) {
        double averagePrice = data.stream()
                .mapToInt(Car::getPrice)
                .average()
                .orElse(0);

        return data.stream()
                .map(car -> new Car(car.getModel(), car.getMaker(),
                        car.getColor(), car.getLocation(), (int) averagePrice))
                .collect(Collectors.toList());
    }
}
