public class stackA<E> {// E is generic object
    private E[] stack;
    private int top;
    private int defaultSize = 10;

    public stackA(int size) {
        stack = (E[]) new Object[10];
        top = -1;
    }

    public void push(E obj) {
        if (top + 1 == capacity()) {
            // TODO: double capacity
            return;
        }

        stack[++top] = obj;
    }

    public E pop() {
        if (top == -1) {
            return null;
        }

        return stack[top--];
    }

    public E peek() {
        return stack[top];
    }

    public int capacity() {
        return stack.length;
    }

    public int size() {
        return top + 1;
    }
}
