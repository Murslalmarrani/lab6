
class Node:
    def __init__(self, data=None):
        self.data = data
        self.next = None
        self.prev = None

class CircularDoublyLinkedList:
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
            if current == self.head:
                break
        return count

    def __str__(self):
        result = []
        current = self.head
        while current:
            result.append(str(current.data))
            current = current.next
            if current == self.head:
                break
        return ' -> '.join(result)

    def addFirst(self, data):
        newNode = Node(data)
        if self.isEmpty():
            self.head = newNode
            self.tail = newNode
        else:
            newNode.next = self.head
            self.head.prev = newNode
            self.head = newNode
        self.tail.next = self.head
        self.head.prev = self.tail

    def addLast(self, data):
        newNode = Node(data)
        if self.isEmpty():
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            newNode.prev = self.tail
            self.tail = newNode
        self.tail.next = self.head
        self.head.prev = self.tail

    def removeFirst(self):
        if self.isEmpty():
            raise Exception('List is empty')
        elif self.head == self.tail:
            self.head = None
            self.tail = None
        else:
            newHead = self.head.next
            newHead.prev = None
            self.head.next = None
            self.head = newHead
        self.tail.next = self.head
        self.head.prev = self.tail

    def removeLast(self):
        if self.isEmpty():
            raise Exception('List is empty')
        elif self.head == self.tail:
            self.head = None
            self.tail = None
        else:
            newTail = self.tail.prev
            newTail.next = None
            self.tail.prev = None
            self.tail = newTail
        self.tail.next = self.head
        self.head.prev = self.tail

    def rotate(self):
        if self.isEmpty():
            raise Exception('List is empty')
        self.head, self.tail = self.tail, self.head

    def rotateBackward(self):
        if self.isEmpty():
            raise Exception('List is empty')
        self.head, self.tail = self.tail, self.head
        self.head, self.tail = self.head.next, self.tail.prev
