package SinglyLinkedList;

// LinkedList class to manage operations on the linked list
class LinkedList {
    Node head; // Head of the linked list
    Node tail; // Tail of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to add a node at the beginning of the linked list
    public void addNodeAtBeginning(int newData) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(newData);

        // Step 2: Link the new node to the rest of the list
        newNode.next = head;

        // Step 3: Update the head to point to the new node
        head = newNode;

        // Step 4: Update tail if the list was empty
        if (tail == null) {
            tail = newNode;
        }
    }

    // Method to add a node at the end of the linked list
    public void addNodeAtEnd(int newData) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(newData);

        // Step 2: Check if the list is empty, update both head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Step 3: Link the last node to the new node
        tail.next = newNode;

        // Step 4: Update the tail to be the new node
        tail = newNode;
    }

    // Method to add a node at a specified position in the linked list
    public void addNodeAtPosition(int newData, int position) {
        // Step 1: Check for an empty list
        if (head == null) {
            System.out.println("List is empty. Adding node at the beginning.");
            addNodeAtBeginning(newData);
            return;
        }

        // Step 2: If position is 0, add node at the beginning
        if (position == 0) {
            addNodeAtBeginning(newData);
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
            addNodeAtEnd(newData);
            return;
        }

        // Step 6: Link the new node to the rest of the list
        newNode.next = current.next;
        current.next = newNode;

        // Step 7: Update tail if the new node is added at the end
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Method to remove a node from the beginning of the linked list
    public void removeNodeFromBeginning() {
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
        Node second=head.next;
        head.next=null;
        head = second;

    }

    // Method to remove a node from the end of the linked list
    public void removeNodeFromEnd() {
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

        // Step 3: Traverse the list to find the node before the last node
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Step 4: Remove the link to the last node
        current.next = null;

        // Step 5: Update tail to be the node before the last node
        tail = current;
    }

    // Method to remove a node from a specified position in the linked list
    public void removeNodeFromPosition(int position) {
        // Step 1: Check for an empty list
        if (head == null) {
            System.out.println("List is empty. Cannot remove from a specified position.");
            return;
        }

        // Step 2: If position is 0, remove node from the beginning
        if (position == 0) {
            removeNodeFromBeginning();
            return;
        }

        // Step 3: Traverse the list to find the node at position-1
        Node current = head;
        Node previous = null;
        for (int i = 0; i < position && current != null; i++) {
            previous = current;
            current = current.next;
        }

        // Step 4: Check if the position exceeds the length of the list
        if (current == null) {
            System.out.println("Position exceeds the length of the list. Cannot remove.");
            return;
        }

        // Step 5: Remove the link to the node at the specified position
        previous.next = current.next;

        // Step 6: Update tail if the last node is removed
        if (current.next == null) {
            tail = previous;
        }
    }

    //Method to search for given data
    public boolean isInList(int data){
        Node current=head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

