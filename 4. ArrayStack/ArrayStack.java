package ArrayStack;

public class ArrayStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack with a given size
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);//top=-1
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack");
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // Return a sentinel value indicating failure
        } else {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack");
            return poppedValue;
        }
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1; // Return a sentinel value indicating failure
        } else {
            return stackArray[top];
        }
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();

        System.out.println("Peek: " + stack.peek());

        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}

