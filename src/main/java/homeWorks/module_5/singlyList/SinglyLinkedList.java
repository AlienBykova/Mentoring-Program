package main.java.homeWorks.module_5.singlyList;

public class SinglyLinkedList {
    private ListElement head;
    private ListElement tail;

    void addFront(int data) {
        ListElement element = new ListElement(data);
        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.setNext(head);
            head = element;
        }
    }

    void addBack(int data) {
        ListElement element = new ListElement(data);
        if (tail == null) {
            head = element;
            tail = element;
        } else {
            tail.setNext(element);
            tail = element;
        }
    }


    void printList() {
        ListElement element = head;
        while (element != null) {
            System.out.print(element.getData() + " ");
            element = element.getNext();
        }
    }

    void delEl(int data)
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.getData() == data) {
            head = head.getNext();
            return;
        }

        ListElement element = head;
        while (element.getNext() != null) {
            if (element.getNext().getData() == data) {
                if(tail == element.getNext())
                {
                    tail = element;
                }
                element.setNext(element.getNext().getNext());
                return;
            }
            element = element.getNext();
        }
    }

}
