package CircularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        // Insert nodes at the beginning, end, and a given position
        list.insertAtBeginning(10);//10
        list.insertAtBeginning(5);//5 10
        list.insertAtPosition(15, 2);//5 10 15
        list.insertAtEnd(20);//5 10 15 20

        System.out.println("Original list:");
        list.display();

        // Delete nodes at a given position, from the beginning, and from the end
        list.deleteAtPosition(0);//10 15 20
        list.deleteFromBeginning();//15 20
        list.deleteFromEnd();//15
//
        System.out.println("List after deletions:");
        list.display();
    }
}
