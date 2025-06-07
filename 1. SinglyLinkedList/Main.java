package SinglyLinkedList;

// Main class to demonstrate linked list operations
public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList linkedList = new LinkedList();

        // Add nodes at the beginning of the linked list
        linkedList.addNodeAtBeginning(3);
        linkedList.addNodeAtBeginning(2);
        linkedList.addNodeAtBeginning(1);

        // Print the linked list
        System.out.println("Linked List after adding nodes at the beginning:");
        linkedList.printList();

        // Add a node at the end of the linked list
        //linkedList.addNodeAtEnd(4);
        //linkedList.addNodeAtEnd(5);

        // Print the linked list
        System.out.println("\nLinked List after adding nodes at the end:");
        linkedList.printList();

        // Add a node at a specified position in the linked list
        //linkedList.addNodeAtPosition(10, 2);

        // Print the linked list
        //System.out.println("\nLinked List after adding a node at a specified position:");
       // linkedList.printList();

        // Remove a node from the beginning of the linked list
        //linkedList.removeNodeFromBeginning();

        // Print the linked list
       // System.out.println("\nLinked List after removing a node from the beginning:");
        //linkedList.printList();

        // Remove a node from the end of the linked list
        //linkedList.removeNodeFromEnd();

        // Print the linked list
        //System.out.println("\nLinked List after removing a node from the end:");
        //linkedList.printList();

        // Remove a node from a specified position in the linked list
        //linkedList.removeNodeFromPosition(3);

        //check the data is in list or not
        //System.out.println(linkedList.isInList(4));

        // Print the linked list
        //System.out.println("\nLinked List after removing a node from a specified position:");
        linkedList.printList();
    }
}
