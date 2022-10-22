package radix_sort;

public class Radix_Sort {

   public SingleLinkedList_Entry unsorted,    
                                 bucketZero,
                                 bucketOne,
                                 bucketTwo,
                                 bucketThree,
                                 bucketFour,
                                 bucketFive,
                                 bucketSix,
                                 bucketSeven,
                                 bucketEight,
                                 bucketNine;
          int numDigits = 0;

   Radix_Sort() {
      SingleLinkedList_Entry unsorted = new SingleLinkedList_Entry();
   }
   
   Radix_Sort(SingleLinkedList_Entry unsort, int numDig) {
      unsorted = unsort;
      numDigits = numDig;
   }
   
   SingleLinkedList_Entry sortBuckets() {
      return unsorted;
   }

   SingleLinkedList_Entry sortList() {
      return unsorted;
   }
}
