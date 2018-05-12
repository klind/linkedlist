public class Main {

    public static void main(String[] args) {

        Element<Integer> element1 = new Element(1);
        Element<Integer> element2 = new Element(2);
        Element<Integer> element3 = new Element(3);
        Element<Integer> element4 = new Element(4);
        Element<Integer> element5 = new Element(5);

        element4.setNext(element5);
        element3.setNext(element4);
        element2.setNext(element3);
        element1.setNext(element2);

        // element1 -> element2 -> element3 -> element4 -> element5
        Element next = element1;
        while (next != null) {
            System.out.println(next.getData());
            next = next.getNext();
        }

        // reverse
        Element current = element1;
        Element p = null;
        Element n;
        while (current != null) {
            n = current.getNext();
            current.setNext(p);
            p = current;
            current = n;
        }
        // element5 -> element4 -> element3 -> element2 -> element1
        current = p;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
