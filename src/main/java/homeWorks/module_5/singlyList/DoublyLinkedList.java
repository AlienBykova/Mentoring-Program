package homeWorks.module_5.singlyList;

public class DoublyLinkedList {
    private ListElement head;
    private ListElement tail;

    public void addFront(Object data) {
        ListElement element = new ListElement(data);
        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.setNext(head);
            head.setPrev(element);
            head = element;
        }
    }

    public void addBack(Object data) {
        ListElement element = new ListElement(data);
        if (tail == null) {
            head = element;
            tail = element;
        } else {
            tail.setNext(element);
            element.setPrev(tail);
            tail = element;
        }
    }

    public void printList() {
        ListElement element = head;
        while (element != null) {
            System.out.print(element.getData() + " ");
            element = element.getNext();
        }
    }

    public void del(Object data) {
        if (head == null) return;

        else if (head == tail) {
            head = null;
            tail = null;
            return;
        } else if (head.getData() == data) {
            head = head.getNext();
            head.setPrev(null);
            return;
        } else if (tail.getData() == data) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            ListElement element = head;
            while (element.getNext() != null) {
                if (element.getNext().getData() == data) {
                    if (tail == element.getNext()) {
                        tail = element;
                    }
                    element.setNext(element.getNext().getNext());
                    element.getNext().setPrev(element.getPrev());
                    return;
                }
                element = element.getNext();
            }
        }
    }
}
