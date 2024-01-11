package lab7;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------\nПервое задание:");
        Counter counter = new Counter();

        final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CountingThread thread1 = new CountingThread(counter, 0, arr.length / 2, arr);
        CountingThread thread2 = new CountingThread(counter, arr.length / 2, arr.length, arr);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + counter.getCount());

        final int[][] matrix = {
                {64, -22, -6, 32, 59, 87, 13, -45},
                {-52, 71, 3, 94, 26, 62, -87, -73},
                {27, 5, -15, 46, -92, 25, 91, 12},
                {89, 73, 1, -56, 98, 74, -38, 99},
                {16, -3, -65, 86, 47, 93, 28, -19},
        };

        System.out.println("\n---------------\nВторое задание:");
        RowMaxValueThread[] threads = new RowMaxValueThread[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            threads[i] = new RowMaxValueThread(i, matrix);
            threads[i].start();

        }

        int max = Integer.MIN_VALUE;
        for (RowMaxValueThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (thread.getMaxValue() > max) {
                max = thread.getMaxValue();
            }
        }

        System.out.println("Наибольший элемент в матрице: " + max);

        System.out.println("\n---------------\nТретье задание:");
        Warehouse warehouse = new Warehouse();

        WorkerThread worker1 = new WorkerThread(warehouse, "Matt");
        WorkerThread worker2 = new WorkerThread(warehouse, "Pete");
        WorkerThread worker3 = new WorkerThread(warehouse, "George");

        worker1.start();
        worker2.start();
        worker3.start();

        try {
            worker1.join();
            worker2.join();
            worker3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
