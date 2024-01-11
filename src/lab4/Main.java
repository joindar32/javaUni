package lab4;

public class Main {
    public static void calculateAverage(int[] arr)
            throws ArrayIndexOutOfBoundsException, NumberFormatException {
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Массив пуст");
        }
        int sum = 0;
        for (int i : arr) {
            try {
                sum += Integer.parseInt(String.valueOf(i));
            } catch (NumberFormatException ex) {
                throw new NumberFormatException("Элемент массива " + i + " не является числом");
            }
        }
        double avg = (double) sum / arr.length;
        System.out.println("Среднее арифметическое элементов массива: " + avg);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //int[] arr = new int[0];
        try {
            calculateAverage(arr);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
