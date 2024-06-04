package dataTypeVar;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(3); 
        stack.push(4); 
        stack.push(6); 
        stack.push(7); 
        stack.push(8);

        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.printStack();
    }
}
