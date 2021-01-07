public class Node{
 public Node(String v){/*create a constructor*/
   data = v;
 }
 private String data;
 private Node next,prev;
 //write get/set methods for all three instance variables.

 public String getData(){
   return data;
 }
 public void setData(String v){
   data = v;
 }

 public Node getPrevious(){
   return prev;
 }
 public void setPrevious(Node v){
   prev = v;
 }

 public Node getNext(){
   return next;
 }
 public void setNext(Node v){
   next = v;
 }
}
