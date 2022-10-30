/*******************************************************************************
 *                              Radix_Sort_Demo                                *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class demonstrates the Radix_Sort class                                *
 ******************************************************************************/

package radix_sort;
import java.io.File;
import java.util.Scanner;

public class Radix_Sort_Demo {

   public static String years = "years.txt",
                        pokemon = "pokemon.txt",
                        stooges = "stooges.txt",
                        areacode = "areacode.txt",
                        zipcodes = "zipcodes.txt";
   public static int numDigits = 0;

   public static SingleLinkedList_Entry createList(String text) {
   
      SingleLinkedList_Entry unsorted = new SingleLinkedList_Entry();
   
      try {
         File file = new File(text);
         Scanner sc = new Scanner(file);
         
         numDigits = Integer.parseInt(sc.nextLine());
         
         while (sc.hasNextLine()) {
            String[] token = sc.nextLine().split(",");          
            String key = token[0];   
            if (token.length > 1) {
               String value;
               if (token.length > 2) {
                  value = token[1] + "," + token[2];
               }
               else
                  value = token[1];
               unsorted.addTail(key, value);
            }
         }
         sc.close();
      
   }
      catch(Exception e) {
         System.out.println("Unable to open file!");
         System.out.println(e.toString());
      }
      return unsorted;
   }

   public static void main(String[] args) {
   
   SingleLinkedList_Entry list = createList(zipcodes);
   Radix_Sort unsorted = new Radix_Sort(list, numDigits);
   
   SingleLinkedList_Entry newList = unsorted.sortList();
   newList.print();
   
   }
}
