
public int size() {
    int count = 0;
    Node current = header.next;
    while (current != trailer) {
        count++;
        current = current.next;
    }
    return count;
}
