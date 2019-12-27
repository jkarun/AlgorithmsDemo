package datastructure.linkedList.doublyLinkedList;

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node previous, next = null;

        Node(int data) {
            this.data = data;
        }
    }

    public void printListIteratively() {
        if (head == null) {
            System.out.println("List is empty");
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

    public void pushHead(int data) {
        Node new_node = new Node(data);
        new_node.previous = null;
        new_node.next = head;
        if (head != null)
            head.previous = new_node;
        head = new_node;
    }

    /*insert data at list*/
    public void push(int data) {
        if (head == null) {
            this.pushHead(data);
            return;
        }

        Node new_node = new Node(data);
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        new_node.previous = temp;
        new_node.next = null;
        temp.next = new_node;

    }
}
