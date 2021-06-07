package dataStructures.stack;

public interface MyStack<T> {
    void push(T t);

    T pop();

    T peek();

    boolean isEmpty();

    int size();
}