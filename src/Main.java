public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // 5 -> 4 -> 3 -> 2 -> 1
        System.out.println(linkedList);
        linkedList.reverse();
        // 1 -> 2 -> 3 -> 4 -> 5
        System.out.println(linkedList);
        linkedList.remove(3);
        // 1 -> 2 -> 4 -> 5
        System.out.println(linkedList);
    }
}
