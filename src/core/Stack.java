package core;

public class Stack<T> {
    private T[] stack;
    private int top;
    private final int size;
    private static final int DEFAULT_SIZE = 10;

    @SuppressWarnings("unchecked")
	public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = (T[]) new Object[this.size];
    }

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public void push(T value) {
        if (this.top >= this.size - 1) {
            System.out.println("Stack is full. Cannot push elements");
        }
        this.top += 1;
        this.stack[top] = value;
    }

    public T pop() {
        if (this.top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        T data = this.stack[top];
        this.top -= 1;
        return data;
    }

    public void traverse() {
        for (int i = top; i >= 0; i--) {
            System.out.println(this.stack[i]);
        }
    }
    public T peek(int index){
        return this.stack[index];
    }

}