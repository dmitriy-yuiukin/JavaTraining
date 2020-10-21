public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.set(0, 3);

        System.out.println(myLinkedList.contains(4));
        System.out.println(myLinkedList);

    }
}
