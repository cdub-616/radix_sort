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
 ******************************************************************************/

package radix_sort;

public class Radix_Sort {

   private SingleLinkedList_Entry unsorted = new SingleLinkedList_Entry();
           int numDigits = 0;

   public Radix_Sort() {
      SingleLinkedList_Entry unsorted = new SingleLinkedList_Entry();
   }
   
   public Radix_Sort(SingleLinkedList_Entry unsort, int numDig) {
      unsorted = unsort;
      numDigits = numDig;
   }
   
   public SingleLinkedList_Entry sortList() {
      while (numDigits != 0) {
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
         while (!unsorted.isEmpty()) {
            String pKey = unsorted.peekHead().getKey(); 
            int[] number = new int[pKey.length()];     //convert key to array
            for (int i = 0; i < number.length; i++) {  // of ints
               number[i] = pKey.charAt(i) - '0';
            }
            int value = number[numDigits - 1];
            switch(value) { //empty the data into buckets by key
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
            unsorted.removeHead();
         } //pour buckets back into linked list
         SingleLinkedList_Entry sorted = new SingleLinkedList_Entry();
         while (!zeroesBucket.isEmpty()) {
            sorted.addTail(zeroesBucket.peekHead().getKey(), 
               zeroesBucket.peekHead().getValue());
            zeroesBucket.removeHead();
         }
         while (!onesBucket.isEmpty()) {
         sorted.addTail(onesBucket.peekHead().getKey(), 
            onesBucket.peekHead().getValue());
         onesBucket.removeHead();
      }
         while (!twosBucket.isEmpty()) {
         sorted.addTail(twosBucket.peekHead().getKey(), 
            twosBucket.peekHead().getValue());
         twosBucket.removeHead();
      }
         while (!threesBucket.isEmpty()) {
         sorted.addTail(threesBucket.peekHead().getKey(), 
            threesBucket.peekHead().getValue());
         threesBucket.removeHead();
      }
         while (!foursBucket.isEmpty()) {
         sorted.addTail(foursBucket.peekHead().getKey(), 
            foursBucket.peekHead().getValue());
         foursBucket.removeHead();
      }
         while (!fivesBucket.isEmpty()) {
         sorted.addTail(fivesBucket.peekHead().getKey(), 
            fivesBucket.peekHead().getValue());
         fivesBucket.removeHead();
      }
         while (!sixesBucket.isEmpty()) {
         sorted.addTail(sixesBucket.peekHead().getKey(), 
            sixesBucket.peekHead().getValue());
         sixesBucket.removeHead();
      }
         while (!sevensBucket.isEmpty()) {
         sorted.addTail(sevensBucket.peekHead().getKey(), 
            sevensBucket.peekHead().getValue());
         sevensBucket.removeHead();
      }
         while (!eightsBucket.isEmpty()) {
         sorted.addTail(eightsBucket.peekHead().getKey(), 
            eightsBucket.peekHead().getValue());
         eightsBucket.removeHead();
      }
         while (!ninesBucket.isEmpty()) {
         sorted.addTail(ninesBucket.peekHead().getKey(), 
            ninesBucket.peekHead().getValue());
         ninesBucket.removeHead();
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
         unsorted = sorted;   //point unsorted at new linked list
         sorted = null;       //delete sorted
         numDigits--;
         sortList();          //recursive call with one less digit to sort
      }
      return unsorted;
   }
}
