public class Element<T> {

    private Element next;
    private T data;

    public Element(Element element, T data) {
        this.next = element;
        this.data = data;
    }

    public Element(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }
}
