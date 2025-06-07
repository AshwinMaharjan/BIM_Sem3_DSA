package DoublyLinkedList;

// DoublyLinkedList class to manage operations on the doubly linked list
class DoublyLinkedList {
    Node head; // Head of the doubly linked list
    Node tail; // Tail of the doubly linked list

    // Constructor to initialize an empty doubly linked list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to add a node at the beginning of the doubly linked list
    public void insertAtBeginning(int newData) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(newData);
        // Step 2: Link the new node to the rest of the list
        newNode.next = head;
        newNode.prev = null;
        // Step 3: Update the previous reference of the current head
        if (head != null) {
            head.prev = newNode;
        }
        // Step 4: Update the head to point to the new node
        head = newNode;
        // Step 5: Update the tail if the list was empty
        if (tail == null) {
            tail = newNode;
        }
    }

    // Method to add a node at the end of the doubly linked list
    public void insertAtEnd(int newData) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(newData);
        // Step 2: Check if the list is empty, update both head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // Step 3: Link the new node to the last node
        newNode.prev = tail;
        newNode.next = null;
        // Step 4: Update the next reference of the current tail
        tail.next = newNode;
        // Step 5: Update the tail to be the new node
        tail = newNode;
    }

    // Method to add a node at a specified position in the doubly linked list
    public void insertAtPosition(int newData, int position) {
        // Step 1: Check for an empty list
        if (head == null) {
            System.out.println("List is empty. Adding node at the beginning.");
            insertAtBeginning(newData);
            return;
        }

        // Step 2: If position is 0, add node at the beginning
        if (position == 0) {
            insertAtBeginning(newData);
            return;
        }

        // Step 3: Create a new node with the given data
        Node newNode = new Node(newData);

        // Step 4: Traverse the list to find the node at position-1
        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        // Step 5: Check if the position exceeds the length of the list
        if (current == null) {
            System.out.println("Position exceeds the length of the list. Adding at the end.");
            insertAtEnd(newData);
            return;
        }

        // Step 6: Link the new node to the rest of the list
        newNode.prev = current;
        newNode.next = current.next;
        current.next = newNode;

        // Step 7: Update the previous reference of the next node
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        // Step 8: Update tail if the new node is added at the end
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Method to remove a node from the beginning of the doubly linked list
    public void removeFromBeginning() {
        // Step 1: Check if the list is empty
        if (head == null) {
            System.out.println("List is empty. Cannot remove from the beginning.");
            return;
        }

        // Step 2: If there is only one node, set both head and tail to null
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }

        // Step 3: Remove the link of 1st node from the list and Update the head to the next node
        Node second = head.next;
        head.next = null;
        second.prev=null;

        // Step 4: Update the head to the next node
        head = second;
    }

    // Method to remove a node from the end of the doubly linked list
    public void removeFromEnd() {
        // Step 1: Check if the list is empty
        if (head == null) {
            System.out.println("List is empty. Cannot remove from the end.");
            return;
        }

        // Step 2: If there is only one node, set both head and tail to null
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        // Step 3: Update the previous reference of the current tail
        tail.prev.next = null;

        // Step 4: Update the tail to be the node before the last node
        tail = tail.prev;
    }

    // Method to remove a node from a specified position in the doubly linked list
    public void removeFromPosition(int position) {
        // Step 1: Check for an empty list
        if (head == null) {
            System.out.println("List is empty. Cannot remove from a specified position.");
            return;
        }

        // Step 2: If position is 0, remove node from the beginning
        if (position == 0) {
            removeFromBeginning();
            return;
        }

        // Step 3: Traverse the list to find the node at position
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }

        // Step 4: Check if the position exceeds the length of the list
        if (current == null) {
            System.out.println("Position exceeds the length of the list. Cannot remove.");
            return;
        }

        // Step 5: Update the next reference of the previous node
        current.prev.next = current.next;

        // Step 6: Update the previous reference of the next node
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        // Step 7: Update tail if the last node is removed
        if (current.next == null) {
            tail = current.prev;
        }
    }

    // Method to print the doubly linked list from head to tail
    public void printForward() {
        // Step 1: Check if the list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Step 2: Traverse the list from head to tail and print each node's data
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to print the doubly linked list from tail to head
    public void printBackward() {
        // Step 1: Check if the list is empty
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        // Step 2: Traverse the list from tail to head and print each node's data
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
