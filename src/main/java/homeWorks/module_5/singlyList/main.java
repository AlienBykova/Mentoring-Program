package main.java.homeWorks.module_5.singlyList;

public class main {
    public static void main(String[] args) {

        SinglyLinkedList ml = new SinglyLinkedList();
        ml.addBack(1);
        ml.addBack(2);
        ml.addBack(3);
        ml.addFront(6);

        ml.printList();
        System.out.println();

        ml.delEl(6);
        ml.delEl(5);
        ml.delEl(12);
        ml.delEl(2);

        ml.printList();
        System.out.println();
    }
}
