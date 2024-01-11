package lab6;

public class Stack<T> {
    private final T[] data;
    private int size;
    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T element) throws Exception {
        if (size == data.length) {
            throw new Exception("Стэк заполнен");
        }
        data[size++] = element;
    }
    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("Стэк пуст");
        }
        T poppedElement = data[size - 1];
        data[size - 1] = null;
        size--;
        return poppedElement;
    }
    public T peek() throws Exception {
        if (size == 0) {
            throw new Exception("Стэк пуст");
        }
        return data[size - 1];
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(3);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Int you popped: " + stack.pop());
            System.out.println("Int you peeked at: " + stack.peek());
            stack.push(4);
            System.out.println("Int you popped: " + stack.pop());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
