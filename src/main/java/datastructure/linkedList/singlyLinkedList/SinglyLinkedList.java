package datastructure.linkedList.singlyLinkedList;

public class SinglyLinkedList {
    Node head;

    class Node {
        Node next = null;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public void pushHead(int data) {
        head = new Node(data);
    }

    public void push(int data) {
        if (head == null) {
            this.pushHead(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNodeByPosition(int position) {
        if (this.checkEmptyList())
            return;
        if (position <= 0) {
            this.head = null;
            return;
        }
        int count = 0;
        Node temp = this.head;
        Node prev = null, next = temp;
        while (temp.next != null && count != position - 1) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        Node node = temp.next.next;
        temp = node;
    }

    public void delete(int data) {
        if (this.checkEmptyList())
            return;
        if (this.head.data == data) {
            this.head = null;
            return;
        }
        Node prev = null;
        Node temp = this.head;
        Node next = temp;
        while (temp.next != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (prev == null)
            return;
        prev.next = temp.next;
    }

    private boolean checkEmptyList() {
        if (this.head == null) {
            System.out.println("List is empty...");
            return true;
        }
        return false;
    }

    public int getNth(int data) {
        if (this.checkEmptyList())
            return -1;
        if (this.head.data == data)
            return 0;
        Node temp = this.head;
        int count = 0;
        while (temp.next != null) {
            if (temp.data == data)
                return count;
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void printListIteratively() {
        if (this.checkEmptyList()) {
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            System.out.println(String.format("List index[%d], data:%d", count, temp.data));
            temp = temp.next;
            count++;
        }
    }

    public void printListRecursively() {
        if (this.checkEmptyList())
            return;
        if (head.next != null) {
            this.printListIteratively();
            
        }
    }
}
