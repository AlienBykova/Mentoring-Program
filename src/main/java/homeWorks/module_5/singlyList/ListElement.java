package main.java.homeWorks.module_5.singlyList;

public class ListElement {
    private ListElement next;
    private int data;

    public int getData() {
        return data;
    }

    public ListElement(int data) {
        this.data = data;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }
}
