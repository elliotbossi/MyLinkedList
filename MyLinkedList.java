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
     Node newnode = new Node(value);
     start = newnode;
     end = newnode;
     size = size + 1;
   }
   else if (index==size-1){
     Node newnode = new Node(value);
     end.setNext(newnode);
     end = newnode;

   }
   else if (index==0){

     Node newnode = new Node(value);
     start.setPrevious(newnode);
     newnode.setNext(start);
     start = newnode;
   }

   else{

     Node newnode10 = new Node(value);
     ///////////////////////////////////////
             if ((index-1) == 0){
               Node newPrev = start;
             }
             if ((index-1) == size - 1){
               Node newPrev = end;
             }

             Node newnode = start;
             int i = 0;
             while (i < (index-1)) {
                 newnode = newnode.getNext();
                 i++;
             }
             Node newPrev = newnode;
     ///////////////////////////////////////
             if ((index) == 0){
               Node newNext = start;
             }
             if ((index) == size - 1){
               Node newNext = end;
             }

             Node newnode1 = start;
             int x = 0;
             while (x < (index)) {
                 newnode1 = newnode1.getNext();
                 x++;
             }
             Node newNext = newnode1;
       ///////////////////////////////////////
        newnode10.setPrevious(newPrev);
        newnode10.setNext(newNext);
        newPrev.setNext(newnode10);
        newNext.setPrevious(newnode10);
   }

   size = size + 1;
   return true;
}


 public String get(int index){
   if ((index < 0)||(index > size-1)) {
      throw new IndexOutOfBoundsException();
    }
    Node newnode = start;
    int i = 0;
    while (i < index){
      newnode = newnode.getNext();
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
