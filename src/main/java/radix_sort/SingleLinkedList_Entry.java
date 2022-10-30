/*******************************************************************************
 *                       class Linked_List_Single                              *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class constructs a single linked list.                                 *
 *                                                                             *
 * public SingleLinkedList_Entry()                                             *
 *    default constructor                                                      *
 * public SingleLinkedList_Entry(String, String)                               *
 *    constructor                                                              *
 * public String about()                                                       *
 *    Returns the author's name.                                               *
 * public boolean isEmpty()                                                    *
 *    Returns true if the linked list is empty.                                *
 * public void addHead(String, String)                                         *
 *    Adds a node to the head of the linked list.                              *
 * public void addTail(String, String)                                         *
 *    Adds a node to the tail of the linked list.                              *
 * public void removeHead()                                                    *
 *    Removes the head node of the linked list and returns a String.           *
 * public SingleNode_Entry peekHead()                                          *
 *    Returns the Entry in the head node.                                      *
 * public boolean contains(String)                                             *
 *    Returns true if the value is contained within the linked list.           *
 * public void print()                                                         *
 *    Prints the values held within the linked list.                           *
 ******************************************************************************/

package radix_sort;

public class SingleLinkedList_Entry {

   public SingleNode_Entry head,  //head node pointer
                           tail;  //tail node pointer
 
   public SingleLinkedList_Entry() {
	  SingleNode_Entry node = new SingleNode_Entry();
      head = node;  //point head at node
      tail = node;  //point tail at node
   }
   
   public SingleLinkedList_Entry(String key, String value) {
	  SingleNode_Entry node = new SingleNode_Entry(key, value);
      head = node;  //point head at node
      tail = node;  //point tail at node
   }

   public String about() {
      return "Chris Wright";
   }
   
   public boolean isEmpty() {//if the list doesn't exist or is empty
      if (head == null || (head.getKey() == "0" && head.getValue() == ""))  
         return true;
      else return false;
   }
   
   public void addHead(String key, String value) {
	  SingleNode_Entry newNode = new SingleNode_Entry(key, value);
      if (isEmpty()) {       
         if (head != null) {   //if the list is empty
            head = null;       //delete old head
         }
         head = newNode;       //point head at newNode
      }
      else {
         newNode.getNext() = head;  //new node points to old head
         head = newNode;       //head points to newNode
      }
   }
   
   public void addTail(String key, String value) {
	  SingleNode_Entry newNode = new SingleNode_Entry(key, value);
      if (isEmpty()) {    
         if (head != null) {   //if the list is empty
         head = null;          //delete head
         }
         head = newNode;       //point head at newNode
         tail = newNode;       //point tail at newNode
      }
      else {
         tail.next = newNode;  //old tail points to newNode
         tail = newNode;       //tail points to newNode
      }   
   }
   
   public String removeHead() {
      String data;
      if (isEmpty()) {         //if the list is empty
         data = "";
         head = null;
         tail = null;
      }
      else {
         data = head.getValue();    //data of old head
         if (head.next != null) {
            head = head.next;  //move head to next node
         }
         else {
         head = null;
         }
      }
      return data;
   }
   
   public SingleNode_Entry peekHead() {
      return head;
   }
   
   public boolean contains(String value) {
      if (isEmpty())
         return false;
      else return head.contains(value);
   }
   
   public void print() {
      if (!isEmpty())
         head.print();
      else System.out.println("");
   }
}