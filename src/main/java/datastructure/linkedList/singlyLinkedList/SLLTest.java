package datastructure.linkedList.singlyLinkedList;

public class SLLTest {
    private static SinglyLinkedList sll = new SinglyLinkedList();

    public static void main(String[] args) {
        SLLTest test = new SLLTest();
        test.createDummyList();
        sll.printListIteratively();

        System.out.println("Delete Node by data 3");
        sll.delete(3);
        System.out.println("After deleting ");
        sll.printListIteratively();

        System.out.println("Delete Node by position: 2");
        sll.delete(2);
        System.out.println("After deleting ");
        sll.printListIteratively();

        System.out.println("Get data 1 position: " + sll.getNth(1) );
    }

    private void createDummyList() {
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        sll.push(5);
    }
}
