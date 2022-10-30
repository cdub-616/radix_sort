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
 * public String getKey()                                                      *
 *    returns data in key                                                      *
 * public String getValue()                                                    *
 *    returns data in value                                                    *                                            
 * public boolean contains(String)                                             *
 *    Uses an unnecessary recursive call to traverse a linked list.  Returns   *
 *    true if String is contained within linked list.                          *
 * public void print()                                                         *
 *    Prints value at each node.                                               *                                           
 ******************************************************************************/

package radix_sort;

public class SingleNode_Entry {

   public SingleNode_Entry next;   //next node in linked list
   private String key,             //key of data in node
                  value;           //value of data in node
   
   public SingleNode_Entry() {
      Entry entry = new Entry();
      key = entry.getKey();
      value = entry.getValue();
      this.next = null;
   }
   
   public SingleNode_Entry(String ky, String val){
      Entry entry = new Entry(ky, val);
      key = entry.getKey();
      value = entry.getValue();
      this.next = null;
   }
   
   public String getKey() {
      return this.key;
   }
   
   public String getValue() {
      return this.value;
   }
   
   public boolean contains(String val) {
      if (this.value == val)              //if value is in node
         return true;
      else if (this.next != null)         //if value isn't in node and there's
         return this.next.contains(val);  //  another node in linked list
      else return false;                  //if value is in none of the nodes
   }
   
   public void print() {
      System.out.println("key: " + getKey());
      System.out.println("value: " + getValue());
   }
}