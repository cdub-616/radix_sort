/*******************************************************************************
 *                          class Node_Single                                  *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class constructs an Entry node for use in single linked lists.         *
 *                                                                             *
 * public SingleNode_Entry()                                                   *
 *    default constructor                                                      *
 * public SingleNode_Entry(String, String)                                     *
 *    constructor                                                              *                                         
 * public boolean contains(String)                                             *
 *    Uses an unnecessary recursive call to traverse a linked list.  Returns   *
 *    true if String is contained within linked list.                          *
 * public void print()                                                         *
 *    Prints value at each node.                                               *                                           
 ******************************************************************************/

package radix_sort;

public class SingleNode_Entry {

   public SingleNode_Entry next;      //next node in linked list
   public Entry entry = new Entry();  //contains line of file
   
   public SingleNode_Entry() {
      this.next = null;
   }
   
   public SingleNode_Entry(String ky, String val){
      entry.key = ky;
      entry.value = val;
      this.next = null;
   }
   
   public boolean contains(String val) {
      if (entry.value == val)             //if value is in node
         return true;
      else if (this.next != null)         //if value isn't in node and there's
         return this.next.contains(val);  //  another node in linked list
      else return false;                  //if value is in none of nodes
   }
   
   public void print() {
      System.out.println("key: " + entry.key);
      System.out.println("value: " + entry.value);
   }
}