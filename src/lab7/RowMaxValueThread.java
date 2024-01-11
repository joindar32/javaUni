package lab7;

public class RowMaxValueThread extends Thread{
    private final int[] row;
    private int maxValue;
    public RowMaxValueThread(int rowIndex, int[][] matrix) {
        maxValue = Integer.MIN_VALUE;
        row = matrix[rowIndex];
    }
    public void run() {
        for (int i = 0; i < row.length; i++) {
            for (int value : row) {
                maxValue = Math.max(maxValue, value);
            }
        }
    }
    public int getMaxValue() {
        return maxValue;
    }
}
