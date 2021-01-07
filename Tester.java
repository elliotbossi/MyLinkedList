public class Tester {

    public static void main(String[] args) {
            Node newnode = new Node("a");
            System.out.println(newnode.getData());
            /////
            Node newnode1 = new Node("a");
            newnode1.setData("b");
            System.out.println(newnode1.getData());
            /////
            Node newnode2 = new Node("a");
            System.out.println(newnode2.getNext());
            /////
            MyLinkedList linkedlist = new MyLinkedList();
            linkedlist.add("a");
            linkedlist.add("b");
            linkedlist.add("c");
            linkedlist.add("d");
            linkedlist.add(1,"x");

            System.out.println(linkedlist);
            linkedlist.set(1,"why");
            System.out.println(linkedlist.toString());
            /////


}
}
