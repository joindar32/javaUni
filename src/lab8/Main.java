package lab8;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        dataManager.registerDataProcessor(new FilterDataProcessor());
        //dataManager.registerDataProcessor(new TransformDataProcessor());
        dataManager.registerDataProcessor(new AggregateDataProcessor());

        dataManager.loadData("data_input.txt");
        dataManager.processData();
        dataManager.saveData("data_output.txt");
    }
}
