package datastructure.linkedList.doublyLinkedList;

public class DLLtest {
    private static DoublyLinkedList list = new DoublyLinkedList();

    public static void main(String[] args) {
        DLLtest test = new DLLtest();
        test.createDummyList();
        list.printListIteratively();
    }

    private void createDummyList() {
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
    }
}
