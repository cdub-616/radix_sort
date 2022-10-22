/*******************************************************************************
 *                       class Linked_List_Single                              *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class constructs a single linked list.                                 *
 *                                                                             *
 * SingleLinkedList_Entry()                                                    *
 *    default constructor                                                      *
 * SingleLinkedList_Entry(String)                                              *
 *    constructor                                                              *
 * String about()                                                              *
 *    Returns the author's name.                                               *
 * boolean isEmpty()                                                           *
 *    Returns true if the linked list is empty.                                *
 * void addHead(String)                                                        *
 *    Adds a node to the head of the linked list.                              *
 * void addTail(String)                                                        *
 *    Adds a node to the tail of the linked list.                              *
 * void removeHead()                                                           *
 *    Removes the head node of the linked list and returns a String.           *
 * SingleNode_Entry peekHead()                                                 *
 *    Returns the Entry in the head node.                                      *
 * boolean contains(String)                                                    *
 *    Returns true if the value is contained within the linked list.           *
 * void print()                                                                *
 *    Prints the values held within the linked list.                           *
 ******************************************************************************/

package radix_sort;

public class SingleLinkedList_Entry {

   private SingleNode_Entry head,  //head node pointer
                            tail;  //tail node pointer
   
   SingleLinkedList_Entry() {
	  SingleNode_Entry node = new SingleNode_Entry();
      head = node;  //point head at new node
      tail = node;  //point tail at new node
   }
   
   SingleLinkedList_Entry(String key, String value) {
	  SingleNode_Entry node = new SingleNode_Entry(key, value);
      head = node;  //point head at new node
      tail = node;  //point tail at new node
   }

   String about() {
      return "Chris Wright";
   }
   
   boolean isEmpty() {
      if (head == null)  //if the list is empty
         return true;
      else return false;
   }
   
   void addHead(String key, String value) {
	  SingleNode_Entry newNode = new SingleNode_Entry(key, value);
      if (isEmpty()) {    //if the list is empty
         head = newNode;  //point head at new node
         tail = newNode;  //point tail at new node
      }
      else if (head.key == "0" && head.value == "") {
         head.key = key;
         head.value = value;
         head = newNode;
         tail = newNode;
      }
      else
         newNode.next = head;  //new node points to old head
         head = newNode;       //head points to new node
   }
   
   void addTail(String key, String value) {
	  SingleNode_Entry newNode = new SingleNode_Entry(key, value);
      if (isEmpty()) {    //if the list is empty
         head = newNode;  //point head at new node
         tail = newNode;  //point tail at new node 
      }
      else if (head.key == "0" && head.value == "") {
         tail.key = key;
         tail.value = value;
         head = newNode;
         tail = newNode;
      }
      else
         tail.next = newNode;  //old tail points to new node
         tail = newNode;       //tail points to new node
   }
   
   String removeHead() {
      String data;
      if (isEmpty()) {    //if the list is empty
         data = "";
         tail = null;
      }
      else data = head.value;
      head = head.next;  //move head to next node
      return data;
   }
   
   SingleNode_Entry peekHead() {
      return head;
   }
   
   boolean contains(String value) {
      if (isEmpty())
         return false;
      else return head.contains(value);
   }
   
   void print() {
      if (!isEmpty())
         head.print();
      else System.out.println("");
   }
}