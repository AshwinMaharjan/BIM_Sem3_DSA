package DoublyLinkedList;

// Node class to represent a node in the doubly linked list
class Node {
    int data; // Data of the node
    Node prev; // Reference to the previous node in the list
    Node next; // Reference to the next node in the list

    // Constructor to initialize a node with data
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
