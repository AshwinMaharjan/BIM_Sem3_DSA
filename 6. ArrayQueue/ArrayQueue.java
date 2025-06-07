package ArrayQueue;

public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    // Constructor to initialize the queue with a given size
    public ArrayQueue(int size) {
        maxSize = size + 1; // One extra space for avoiding confusion between full and empty conditions
        queueArray = new int[maxSize];
        front = 0;
        rear = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear+1)==maxSize;
    }

    // Enqueue (insert) an element into the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            queueArray[rear++] = value;
//            rear = (rear + 1) % maxSize;
            System.out.println("Enqueued " + value + " into the queue");
        }
    }

    // Dequeue (remove) an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1; // Return a sentinel value indicating failure
        } else {
            int dequeuedValue = queueArray[front++];
//            front = (front + 1) % maxSize;
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
            return queueArray[front];
        }
    }

    // Display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            int current = front;
            while (current != rear) {
                System.out.print(queueArray[current++] + " ");
//                current = (current + 1) % maxSize;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(2);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Is queue full? " + queue.isFull());
    }
}


