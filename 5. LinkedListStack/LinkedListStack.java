package LinkedListStack;

public class LinkedListStack {
    private Node top;

    // Constructor to initialize an empty stack
    public LinkedListStack() {
        this.top = null;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value + " onto the stack");
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // Return a sentinel value indicating failure
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            System.out.println("Popped " + temp.data + " from the stack");
            return temp.data;
        }
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1; // Return a sentinel value indicating failure
        } else {
            return top.data;
        }
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();

        System.out.println("Peek: " + stack.peek());

        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
