package dataStructures.stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyIntStack<>();

        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(13);

        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
