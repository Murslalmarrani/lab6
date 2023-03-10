
public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
    DoublyLinkedList otherList = (DoublyLinkedList) o;
    if (this.size() != otherList.size()) {
        return false;
    }
    Node currentNode = header.next;
    Node otherNode = otherList.header.next;
    while (currentNode != trailer) {
        if (!currentNode.data.equals(otherNode.data)) {
            return false;
        }
        currentNode = currentNode.next;
        otherNode = otherNode.next;
    }
    return true;
}
