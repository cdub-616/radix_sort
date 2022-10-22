/*******************************************************************************
 *                       class Node_Single                                     *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class constructs a node for use in single linked lists.                *
 *                                                                             *
 * SingleNode_Entry()                                                          *
 *    default constructor                                                      *
 * SingleNode_Entry(String)                                                    *
 *    constructor                                                              *
 * boolean contains(String)                                                    *
 *    Uses an unnecessary recursive call to traverse a linked list.  Returns   *
 *    true if the String is contained within the linked list.                  *
 * void print()                                                                *
 *    Uses an unnecessary recursive call to traverse a linked list and prints  *
 *    the value at each node.                                                  *
 ******************************************************************************/

package radix_sort;

public class SingleNode_Entry {

   SingleNode_Entry next;  //next node in linked list
   String key;             //key of data in node
   String value;           //value of data in node
   
   SingleNode_Entry() {
      Entry entry = new Entry();
      key = entry.key;
      value = entry.value;
      this.next = null;
   }
   
   SingleNode_Entry(String ky, String val){
      Entry entry = new Entry(ky, val);
      key = entry.key;
      value = entry.value;
      this.next = null;
   }
   
   boolean contains(String val) {
      if (this.value == val)              //if value is in node
         return true;
      else if (this.next != null)         //if value isn't in node and there's
         return this.next.contains(val);  //  another node in linked list
      else return false;                  //if value is in none of the nodes
   }
   
   void print() {
      System.out.println("key: " + this.key);
      System.out.println("value: " + this.value);
      if (this.next != null)  //if there's another node in linked list
         this.next.print();   //print next one
   }
}