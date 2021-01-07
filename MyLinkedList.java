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
   return true;
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
		newnode.setPrevious(next.getPrevious());
		newnode.setNext(prev.getNext());

		prev.setNext(newnode);
		next.setPrevious(newnode);
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


 public String set(int index, String value){
   if ((index < 0) || (index > size-1)) {
     throw new IndexOutOfBoundsException();
    }
    Node newnode = start;
    int i = 0;
    while (i < index){
      newnode = newnode.getNext();
      i = i + 1;
    }
    String temp = newnode.getData();
    newnode.setData(value);
    return temp;
 }


 public String toString(){
   if (size==0){
     return "[]";
   }
   String result = "[";
   Node newnode = start;
   while (newnode.getNext() != null){
     result = result + newnode.getData() + ", ";
     newnode = newnode.getNext();
   }
   result = result + newnode.getData() + "]";
   return result;
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
