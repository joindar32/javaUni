package lab8;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class DataManager {
    private final List<Object> processors;
    private List<Car> data;
    private List<Car> processedData;

    public DataManager() {
        processors = new ArrayList<>();
        data = new ArrayList<>();
        processedData = new ArrayList<>();
    }

    public void registerDataProcessor(Object processor) {
        processors.add(processor);
    }

    public void loadData(String source) {
        StringBuilder res = new StringBuilder();

        try (FileReader reader = new FileReader(source)) {
            int c;
            while((c = reader.read()) != -1) {
                res.append((char) c);
            }
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        String[] resArr = res.toString().split("@");

        for (String i : resArr) {
            String[] j = i.split(" ");
            data.add(new Car(j[1], j[0], j[2], j[3], Integer.parseInt(j[4])));
        }
    }

    public void processData() {

        for (Object processor : processors) {
            Method[] methods = processor.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(DataProcessor.class)) {
                        try {
                            processedData = (List<Car>) method.invoke(processor, data);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                }
            }
        }
    }

    public void saveData(String destination) {
        try(FileWriter writer = new FileWriter(destination, false))
        {
            StringBuilder output = new StringBuilder();
            for (Car car : processedData) {
                output.append(car.toString());
            }

            writer.write(output.toString());

            writer.flush();

            System.out.println("Результат программы появился в файле.");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
