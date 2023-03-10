
class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def isEmpty(self):
        return self.head is None

    def __len__(self):
        count = 0
        current = self.head
        while current:
            count += 1
            current = current.next
        return count

    def __str__(self):
