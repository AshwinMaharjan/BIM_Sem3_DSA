package LinkedListQueue;

public class LinkedListQueue {
    private Node front;
    private Node rear;

    // Constructor to initialize an empty queue
    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue (insert) an element into the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued " + value + " into the queue");
    }

    // Dequeue (remove) an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1; // Return a sentinel value indicating failure
        } else {
            int dequeuedValue = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            System.out.println("Dequeued " + dequeuedValue + " from the queue");
            return dequeuedValue;
        }
    }

    // Peek at the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek");
            return -1; // Return a sentinel value indicating failure
        } else {
            return front.data;
        }
    }

    // Display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
