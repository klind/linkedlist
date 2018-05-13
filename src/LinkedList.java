public class LinkedList {

    private Element newestElement;

    public LinkedList() {
    }

    public LinkedList(Integer i) {
        Element newElement = new Element(i);
        this.newestElement = newElement;
    }

    public boolean isEmpty() {
        return newestElement == null;
    }

    public void add(Integer i) {

        Element newElement = new Element(i);

        if (isEmpty()) {
            newestElement = newElement;
        } else {
            newElement.setNext(newestElement);
            newestElement = newElement;
        }
    }

    public void remove(Integer i) {
        Element c = newestElement;
        Element p = newestElement;
        while (c != null) {
            if (c.getData().equals(i)) {
                if (c.equals(p)) {
                    newestElement = newestElement.getNext();
                } else {
                    p.setNext(c.getNext());
                }
                return;
            }
            p = c;
            c = c.getNext();
        }
    }

    public void reverse() {
        Element current = newestElement;
        Element p = null;
        Element n;
        while (current != null) {
            n = current.getNext();
            current.setNext(p);
            p = current;
            current = n;
        }
        newestElement = p;
    }

    @Override
    public String toString() {

        if (newestElement != null) {
            StringBuilder stringBuilder = new StringBuilder();
            Element next = newestElement;
            while (next != null) {
                stringBuilder.append(next.getData()).append(" - ");
                next = next.getNext();
            }
            return stringBuilder.substring(0, stringBuilder.length() - 3);

        } else {
            return null;
        }

    }
}
