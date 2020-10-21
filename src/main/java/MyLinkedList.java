import java.util.Arrays;


public class MyLinkedList<E> {

    private Node<E> head;
    private int size;


    public void add(E value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) temp = temp.getNext();
            temp.setNext(new Node(value));
        }
        size++;
    }

    public void set(int index, E value) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                temp.setValue(value);
            }
            temp = temp.getNext();
            count++;
        }
    }

    public boolean contains(E value) {
        Node temp = head;
        int count = 0;
        E[] array = (E[]) new Object[size];
        while (temp != null) {
            array[count++] = (E) temp.getValue();
            temp = temp.getNext();
        }
        for (E e : array) {
            if (e == value) {
                return true;
            }
        }
        return false;
    }


    public String toString() {
        E[] array = (E[]) new Object[size];
        int count = 0;
        Node temp = head;
        while (temp != null) {
            array[count++] = (E) temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(array);
    }


    public E get(int index) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (count == index) {
                return (E) temp.getValue();
            } else {
                temp = temp.getNext();
                count++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if ((count + 1) == index) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                count++;
            }
        }
    }


    public int size() {
        return size;
    }


    private static class Node<E> {

        private E value;
        private Node<E> next;
        private int index;

        public Node(E value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
