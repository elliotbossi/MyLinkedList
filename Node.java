public class Node{
 public Node(String v){/*create a constructor*/
   data = v;
 }
 private String data;
 private Node next,prev;
 //write get/set methods for all three instance variables.

 public String get(){
   return  data;
 }
 public void set(String v){
   data = v;
 }


}
