package CircularDoublyLinkedList;

// Node class represents a node in the circular doubly linked list
class Node {
    int data;
    Node next;
    Node prev;

    // Constructor to create a new node with the given data
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
