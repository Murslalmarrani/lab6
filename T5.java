
public class DoublyLinkedList<E> {
    private Node sentinel;

    private class Node {
        public E data;
        public Node prev;
        public Node next;

        public Node(E data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
