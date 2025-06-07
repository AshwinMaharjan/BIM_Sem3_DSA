package DoublyLinkedList;

// Main class to demonstrate doubly linked list operations
public class Main {
    public static void main(String[] args) {
        // Step 1: Create a doubly linked list
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Step 2: Insert nodes at the beginning of the doubly linked list
        doublyLinkedList.insertAtBeginning(3);
//        doublyLinkedList.insertAtBeginning(2);
//        doublyLinkedList.insertAtBeginning(1);

        // Step 3: Print the doubly linked list from head to tail
        System.out.println("Doubly Linked List from head to tail:");
        doublyLinkedList.printForward();

        // Step 4: Insert a node at the end of the doubly linked list
//        doublyLinkedList.insertAtEnd(4);
//        doublyLinkedList.insertAtEnd(5);

        // Step 5: Print the doubly linked list from head to tail
//        System.out.println("\nDoubly Linked List from head to tail after inserting at the end:");
//        doublyLinkedList.printForward();

        // Step 6: Insert a node at a specified position in the doubly linked list
        //doublyLinkedList.insertAtPosition(10, 2);

        // Step 7: Print the doubly linked list from head to tail
//        System.out.println("\nDoubly Linked List from head to tail after inserting at a specified position:");
//        doublyLinkedList.printForward();

        // Step 8: Remove a node from the beginning of the doubly linked list
        doublyLinkedList.removeFromBeginning();

        // Step 9: Print the doubly linked list from head to tail
        System.out.println("\nDoubly Linked List from head to tail after removing from the beginning:");
        doublyLinkedList.printForward();

        // Step 10: Remove a node from the end of the doubly linked list
//        doublyLinkedList.removeFromEnd();

        // Step 11: Print the doubly linked list from head to tail
//        System.out.println("\nDoubly Linked List from head to tail after removing from the end:");
//        doublyLinkedList.printForward();

        // Step 12: Remove a node from a specified position in the doubly linked list
        //doublyLinkedList.removeFromPosition(1);

        // Step 13: Print the doubly linked list from head to tail
//        System.out.println("\nDoubly Linked List from head to tail after removing from a specified position:");
//        doublyLinkedList.printForward();

        // Step 14: Print the doubly linked list from tail to head
//        System.out.println("\nDoubly Linked List from tail to head:");
//        doublyLinkedList.printBackward();
    }
}
