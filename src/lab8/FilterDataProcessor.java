package lab8;

import java.util.*;
import java.util.stream.*;

public class FilterDataProcessor {
    @DataProcessor
    public List<Car> filterData(List<Car> data) {
        return data.stream()
                .filter(car -> car.getLocation().equals("Tokyo"))
                .collect(Collectors.toList());
    }
}
