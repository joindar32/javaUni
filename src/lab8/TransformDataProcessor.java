package lab8;

import java.util.*;
import java.util.stream.*;

public class TransformDataProcessor {
    @DataProcessor
    public List<Car> transformData(List<Car> data) {
        return data.stream()
                .map(car -> new Car(car.getModel(), car.getMaker(), car.getColor(), "USA", car.getPrice()))
                .collect(Collectors.toList());
    }
}
