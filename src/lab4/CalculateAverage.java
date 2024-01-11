package lab4;

public class CalculateAverage {
    public static void main(String[] args) {
        //int[] arr = new int[]{1, 2, 3, 4, 5};
        //int[] arr = new int[0];
        String[] arr = new String[]{"asd", "das", "ads"};
        try {
            if (arr.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Массив пуст");
            }
            int sum = 0;
            for (var i : arr) {
                try {
                    sum += Integer.parseInt(String.valueOf(i));
                } catch (NumberFormatException ex) {
                    throw new NumberFormatException("Элемент массива " + i + " не является числом");
                }
            }
            double avg = (double) sum / arr.length;
            System.out.println("Среднее арифметическое элементов массива: " + avg);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
