package homeWorks.module_5.singlyList;

public class main {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addBack(1);
        singlyLinkedList.addBack(2);
        singlyLinkedList.addBack("asc");
        singlyLinkedList.addFront(6);

        singlyLinkedList.printList();
        System.out.println();

        singlyLinkedList.del(6);
        singlyLinkedList.del(5);
        singlyLinkedList.del(12);
        singlyLinkedList.del(2);

        singlyLinkedList.printList();
        System.out.println();

        System.out.println(singlyLinkedList.get(0));

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addBack(1);
        doublyLinkedList.addBack(2);
        doublyLinkedList.addBack("asc");
        doublyLinkedList.addFront(6);

        doublyLinkedList.printList();
        System.out.println();

        doublyLinkedList.del(6);
        doublyLinkedList.del(5);
        doublyLinkedList.del(12);
        doublyLinkedList.del("asc");

        doublyLinkedList.printList();
        System.out.println();
    }
}
