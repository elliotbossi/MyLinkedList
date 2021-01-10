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


   else if (index==size){
     Node newnode = new Node(value);
     end.setNext(newnode);
     newnode.setPrevious(end);
     end = newnode;

     size = size + 1;
   }


   else if (index==0){

     Node newnode = new Node(value);
     start.setPrevious(newnode);
     newnode.setNext(start);
     start = newnode;

     size = size + 1;
   }


   else{

     Node newnode10 = new Node(value);
     ///////////////////////////////////////
             if ((index-1) == 0){
               Node newnode11 = start;
             }
             if ((index-1) == size - 1){
               Node newnode11 = end;
             }

             Node newnode = start;
             int i = 0;
             while (i < (index-1)) {
                 newnode = newnode.getNext();
                 i++;
             }
             Node newnode11 = newnode;
     ///////////////////////////////////////
             if ((index) == 0){
               Node newnode12 = start;
             }
             if ((index) == size - 1){
               Node newnode12 = end;
             }

             Node newnode1 = start;
             int x = 0;
             while (x < (index)) {
                 newnode1 = newnode1.getNext();
                 x++;
             }
             Node newnode12 = newnode1;
       ///////////////////////////////////////
        newnode10.setPrevious(newnode11);

        newnode10.setNext(newnode12);

        newnode11.setNext(newnode10);

        newnode12.setPrevious(newnode10);

        size = size + 1;
   }

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

 public String toStringReversed(){
   if (size==0){
     return "[]";
   }

   String result = "[";
   Node newnode = end;

   while (newnode.getPrevious() != null){
     result = result + newnode.getData() + ", ";
     newnode = newnode.getPrevious();
   }
   result = result + newnode.getData() + "]";
   return result;
 }

 public String remove(int index){
   if ((index > size-1)||(index < 0)){
     throw new IndexOutOfBoundsException();
   }
   if (size==1){
     String result = start.getData();
     start = null;
     end = null;
     size = size - 1;
     return result;
   }
   else if (index==0){
     String result = start.getData();
     Node start1 = start.getNext();
     start1.setPrevious(null);
     start.setNext(null);
     start = start1;
     size = size - 1;
     return result;
   }
   else if (index==(size-1)){
     String result = end.getData();
     Node end1 = end.getPrevious();
     end1.setNext(null);
     end.setPrevious(null);
     end = end1;
     size = size - 1;
     return result;
   }
   else{
     //////
     if ((index) == 0){
       Node newnode = start;
     }
     if ((index) == size - 1){
       Node newnode = end;
     }
     Node newnode1 = start;
     int x = 0;
     while (x < (index)) {
         newnode1 = newnode1.getNext();
         x++;
     }
     Node newnode = newnode1;
     ///////
     String result = newnode.getData();
     newnode.getPrevious().setNext(newnode.getNext());
     newnode.getNext().setPrevious(newnode.getPrevious());
     newnode.setPrevious(null);
     newnode.setNext(null);
     size = size - 1;
     return result;

   }

 }

 public void extend(MyLinkedList other){
   Node n1 = other.start;
   Node n2 = other.end;

   end.setNext(n1);
   end = n2;
   n1.setPrevious(end);
   size = size + other.size();

   other.size = 0;

   n2 = null;

   n1 = null;

 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
