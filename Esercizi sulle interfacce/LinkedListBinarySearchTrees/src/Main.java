public class Main {

    public static void main(String[] args) {

        Node node1 = new Node("25");
        Node node2 = new Node("30");

        MyLinkedList firstList = new MyLinkedList(node1);
        firstList.addItem(node2);
        firstList.traverse(node1);
        Node nodeNull = null;
        firstList.removeItem(nodeNull);
    }
}
