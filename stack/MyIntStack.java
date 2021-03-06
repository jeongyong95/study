package stack;

import java.util.ArrayList;
import java.util.List;

public class MyIntStack<T> implements MyStack<T> {

    private int ptr;
    private List<T> stack;

    public MyIntStack() {
        this.ptr = -1;
        this.stack = new ArrayList<>();
    }

    @Override
    public void push(T t) {
        this.stack.add(t);
        ptr++;
    }

    @Override
    public T pop() {
        return this.stack.remove(ptr--);
    }

    @Override
    public T peek() {
        return this.stack.get(ptr);
    }

    @Override
    public boolean isEmpty() {
        if (ptr == -1) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return ptr + 1;
    }

}
