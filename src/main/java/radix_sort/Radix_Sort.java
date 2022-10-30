/*******************************************************************************
 *                       class Linked_List_Single                              *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class sorts an Entry linked list.                                      *
 *                                                                             *
 * public Radix_Sort()                                                         *
 *    default constructor                                                      *
 * public Radix_Sort(SingleLinkedList_Entry, int)                              *
 *    constructor                                                              *
 * public SingleLinkedList_Entry sortList()                                    *
 *    Sorts the linked list in ascending order.                                *
 * public void emptyBuckets(SingleLinkedList_Entry)                            *
 *    Puts contents of buckets back into linked list.                          *
 * public int numberSorted()                                                   *
 *    Returns number of lines sorted.                                          *
 ******************************************************************************/

package radix_sort;

public class Radix_Sort {

   private SingleLinkedList_Entry unsorted = new SingleLinkedList_Entry();
   private int numDigits,  //number of digits in key
               numSorted;  //number of lines sorted

   public Radix_Sort() {
      numDigits = 0;
   }
   
   public Radix_Sort(SingleLinkedList_Entry unsort, int numDig) {
      unsorted = unsort;
      numDigits = numDig;
   }
   
   public SingleLinkedList_Entry sortList() {

      //create buckets
      SingleLinkedList_Entry zeroesBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry onesBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry twosBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry threesBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry foursBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry fivesBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry sixesBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry sevensBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry eightsBucket = new SingleLinkedList_Entry();
      SingleLinkedList_Entry ninesBucket = new SingleLinkedList_Entry();

      while (numDigits != 0) {  
         while (!unsorted.isEmpty()) {
            String pKey = unsorted.peekHead().getKey(); 
            int[] number = new int[pKey.length()];     //convert key to array
            for (int i = 0; i < number.length; i++) {  // of ints
               number[i] = pKey.charAt(i) - '0';
            }
            int value = number[numDigits - 1];

            //empty data into buckets by key
            switch(value) {  
               case 0:  zeroesBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 1:  onesBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 2:  twosBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 3:  threesBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 4:  foursBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 5:  fivesBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 6:  sixesBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 7:  sevensBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               case 8:  eightsBucket.addTail(unsorted.peekHead().getKey(), 
                           unsorted.peekHead().getValue());
                        break;
               default:  ninesBucket.addTail(unsorted.peekHead().getKey(), 
                            unsorted.peekHead().getValue());   
                        break;
            }
            unsorted.removeHead();  //remove head after sorting into bucket
         } 

         //pour buckets back into linked list
         emptyBuckets(zeroesBucket);
         emptyBuckets(onesBucket);
         emptyBuckets(twosBucket);
         emptyBuckets(threesBucket);
         emptyBuckets(foursBucket);
         emptyBuckets(fivesBucket);
         emptyBuckets(sixesBucket);
         emptyBuckets(sevensBucket);
         emptyBuckets(eightsBucket);
         emptyBuckets(ninesBucket);
         numDigits--;        //decrement number of times to sort buckets
         sortList();         //recursive call
      }
      zeroesBucket = null;  //delete buckets
      onesBucket = null;
      twosBucket = null;
      threesBucket = null;
      foursBucket = null;
      fivesBucket = null;
      sixesBucket = null;
      sevensBucket = null;
      eightsBucket = null;
      ninesBucket = null;
      return unsorted;
   }

   public void emptyBuckets(SingleLinkedList_Entry ent) {
      while (!ent.isEmpty()) {
         unsorted.addTail(ent.peekHead().getKey(), 
            ent.peekHead().getValue());
         ent.removeHead();
      }
   }

   public int numberSorted() {
      numSorted = 0;
      SingleNode_Entry nodePtr = unsorted.head;
      if (nodePtr != null) {
         numSorted = 1;
         while (nodePtr.next != null) {
            numSorted++;
            nodePtr = nodePtr.next;
         }
      }
      return numSorted;
   }
}