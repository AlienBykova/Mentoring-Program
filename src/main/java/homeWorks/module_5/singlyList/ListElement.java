package homeWorks.module_5.singlyList;

public class ListElement<T> {

    private ListElement next;
    private ListElement prev;
    private T data;

    public T getData() {
        return data;
    }

    public ListElement(T data) {
        this.data = data;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getPrev() {
        return prev;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }
}
