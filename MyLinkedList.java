public class MyLinkedList{
 private int size;
 private Node start, end;

 public MyLinkedList(){
   size = 0;
 }

 public int size(){
   return size;
 }


 public boolean add(String value){
   Node newnode = new Node(value);
   if (size == 0){
     size = size + 1;
     start = newnode;
     end = newnode;
   }
   else{
     size = size + 1;
     newnode.setPrevious(end);
     end.setNext(newnode);
     end = newnode;
   }
 }

 public boolean add(int index, String value){
   if ((index > size)||(index < 0)){
     throw new IndexOutOfBoundsException();
   }
   if (size==0){
     size = size + 1;
     Node newnode = new Node(value);
     start = newnode;
     end = newnode;
   }
   if (index==0){
     size = size + 1;
     Node newnode = new Node(value);
     start.setPrevious(newnode);
     newnode.setNext(start);
     start = newnode;
   }
   if (index==size-1){
     size = size + 1;
     Node newnode = new Node(value);
     end.setNext(newnode);
     newnode.setPrevious(end);
     end = newnode;
   }
   if (index==size){
     size = size + 1;
     add(value);
   }
   Node newnode1 = start;
		for (int i = 0; i < index; i++) {
			newnode1 = newnode1.getNext();

			if (newnode1 == null) throw new IndexOutOfBoundsException();
		}
    Node prev = newnode1.getPrevious();
		Node next = newnode1.getNext();

		Node newnode = new Node(value);
		newnode.setPrevious(next.getPrev());
		newnode.setNext(prev.getNext());

		prev.setNext(newNode);
		next.setPrevious(newNode);
		size++;

   return true;
 }

 public String get(int index){
   if ((index < 0)||(index > size-1)) {
      throw new IndexOutOfBoundsException();
    }
    Node newnode = start;
    int i = 0;
    while (i < index){
      newnode = start.getNext();
      i = i + 1;
    }
    return newnode.getData();
 }


 public String set(int index, String value);
 public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
