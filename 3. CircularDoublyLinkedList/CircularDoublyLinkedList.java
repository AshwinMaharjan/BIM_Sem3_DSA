package CircularDoublyLinkedList;


public class CircularDoublyLinkedList {
    private Node head;

    // Constructor to initialize an empty circular doubly linked list
    public CircularDoublyLinkedList() {
        this.head = null;
    }

    // Insert at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            // If the list is not empty, adjust pointers to insert at the beginning
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode; // Update the head to the new node
        }
    }

    // Insert at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            // If the list is not empty, adjust pointers to insert at the end
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    // Insert at a given position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        if(position == 0){
            insertAtBeginning(data);
            return;
        }

        Node current = head;
        for (int i = 1; i < position ; i++) {
            // Traverse to the node before the desired position
            current = current.next;
            if (current == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        // Adjust pointers to insert at the given position
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    // Delete a node at a given position
    public void deleteAtPosition(int position) {
        if (head == null) {
            // If the list is empty, print a message and return
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            // Traverse to the node at the desired position
            current = current.next;
            if (current == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        // Adjust pointers to delete the node at the given position
        current.prev.next = current.next;
        current.next.prev = current.prev;

        // Update head if deleting the first node
        if (current == head) {
            head = current.next;
        }
    }

    // Delete from the beginning of the list
    public void deleteFromBeginning() {
        if (head == null) {
            // If the list is empty, print a message and return
            System.out.println("List is empty");
            return;
        }

        // Adjust pointers to delete the first node
        head.prev.next = head.next;
        head.next.prev = head.prev;

        // Update head to the next node
        head = head.next;
    }

    // Delete from the end of the list
    public void deleteFromEnd() {
        if (head == null) {
            // If the list is empty, print a message and return
            System.out.println("List is empty");
            return;
        }

        // Adjust pointers to delete the last node
        head.prev.prev.next = head;
        head.prev = head.prev.prev;
    }

    // Display the circular doubly linked list in both directions
    public void display() {
        if (head == null) {
            // If the list is empty, print a message and return
            System.out.println("List is empty");
            return;
        }

        Node forward = head;
        Node backward = head.prev;

        System.out.println("Forward traversal:");
        do {
            // Forward traversal and print the data of each node
            System.out.print(forward.data + " ");
            forward = forward.next;
        } while (forward != head);
//        System.out.println();
//
//        System.out.println("Backward traversal:");
//        do {
//            // Backward traversal and print the data of each node
//            System.out.print(backward.data + " ");
//            backward = backward.prev;
//        } while (backward != head.prev);
//        System.out.println();
    }
}