package lab7;

public class CountingThread extends Thread {
    private final Counter counter;
    private final int start;
    private final int end;
    private final int[] arr;

    public CountingThread(Counter counter, int start, int end, int[] arr) {
        this.counter = counter;
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            counter.increment(arr[i]);
        }
    }
}
