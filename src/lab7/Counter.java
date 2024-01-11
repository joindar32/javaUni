package lab7;

public class Counter {
    private int count;
    public synchronized void increment(int num) {
        count += num;
    }
    public int getCount() {
        return count;
    }
}
