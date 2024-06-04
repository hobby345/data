package dataTypeVar;

public class Stack {
    int size;
    int top;
    int[] array;

    public Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            array[++top] = item;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return array[top--];  
        }
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
