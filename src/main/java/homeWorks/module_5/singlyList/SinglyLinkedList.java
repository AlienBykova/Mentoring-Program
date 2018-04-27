package homeWorks.module_5.singlyList;

import static java.util.Optional.ofNullable;

public class SinglyLinkedList<T> {
    private ListElement head;
    private ListElement tail;

    public void addFront(T data) {
        ListElement element = new ListElement(data);
        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.setNext(head);
            head = element;
        }
    }

    public void addBack(T data) {
        ListElement element = new ListElement(data);
        if (tail == null) {
            head = element;
            tail = element;
        } else {
            tail.setNext(element);
            tail = element;
        }
    }

    public T get(int index) {
        ListElement element = ofNullable(head).orElseThrow(() -> new RuntimeException("List is empty"));
        for (int i = 0; i < index; i++) {
            element = ofNullable(element.getNext())
                    .orElseThrow(() -> new IndexOutOfBoundsException("There is no elemenet with such index"));
            ;
        } return (T) element.getData();
    }


    public void printList() {
        ListElement element = head;
        while (element != null) {
            System.out.print(element.getData() + " ");
            element = element.getNext();
        }
    }

    public void del(T data) {
        if (head == null) return;

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
                if (tail == element.getNext()) {
                    tail = element;
                }
                element.setNext(element.getNext().getNext());
                return;
            }
            element = element.getNext();
        }
    }

}
