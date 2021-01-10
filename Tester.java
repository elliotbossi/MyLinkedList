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
            System.out.println(linkedlist.toStringReversed());
            /////

            MyLinkedList linkedlist1 = new MyLinkedList();
            MyLinkedList linkedlist2 = new MyLinkedList();

            linkedlist1.add("0");
            linkedlist1.add("1");
            linkedlist1.add("2");
            linkedlist1.add("3");
            //
            linkedlist2.add("4");
            linkedlist2.add("5");
            linkedlist2.add("6");
            linkedlist2.add("7");
            linkedlist1.extend(linkedlist2);

            System.out.println(linkedlist1.toString());
            System.out.println(linkedlist2.toString());

            linkedlist1.remove(0);
            linkedlist1.remove(6);
            linkedlist1.remove(2);

            System.out.println(linkedlist1.toString());




}
}
