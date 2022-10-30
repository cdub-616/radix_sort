/*******************************************************************************
 *                              Radix_Sort_Demo                                *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class demonstrates the Radix_Sort class.                               *
 *                                                                             *
 * public static SingleLinkedList_Entry createList(String)                     *
 *    Opens text file and creates linked list from file entrees.               *
 * public static Radix_Sort sortFile(String)                                   *
 *    Sorts and prints file.  Returns sorted linked list.                      *
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

   public static void main(String[] args) {
   
      //sort and print files
      System.out.println(years);
      Radix_Sort yrs = sortFile(years);
      System.out.println();
      System.out.println(pokemon); 
      Radix_Sort pkmn = sortFile(pokemon);
      System.out.println();
      System.out.println(stooges);
      Radix_Sort stgs = sortFile(stooges);
      System.out.println();
      System.out.println(areacode);
      Radix_Sort rcd = sortFile(areacode);
      System.out.println();
      System.out.println(zipcodes);
      Radix_Sort zpcd = sortFile(zipcodes);
      System.out.println();

      //print number of lines sorted
      System.out.println("The number of lines sorted in " + years + " is " + 
         yrs.numberSorted() + ".");
      System.out.println("The number of lines sorted in " + pokemon + " is " + 
         pkmn.numberSorted() + ".");
      System.out.println("The number of lines sorted in " + stooges + " is " + 
         stgs.numberSorted() + ".");
      System.out.println("The number of lines sorted in " + areacode + " is " + 
         rcd.numberSorted() + ".");
      System.out.println("The number of lines sorted in " + zipcodes + " is " + 
         zpcd.numberSorted() + ".");
   }

   public static SingleLinkedList_Entry createList(String text) {
   
      SingleLinkedList_Entry unsorted = new SingleLinkedList_Entry();
   
      try {  //try to open file
         File file = new File(text);
         Scanner sc = new Scanner(file);
         
         numDigits = Integer.parseInt(sc.nextLine());  //first line of file
         
         while (sc.hasNextLine()) {  //while there are more lines
            String[] token = sc.nextLine().split(",");   //split lines
            String key = token[0];   
            if (token.length > 1) {  //skip END
               String value;
               if (token.length > 2) {
                  value = token[1] + "," + token[2];
               }
               else value = token[1];
               unsorted.addTail(key, value);  //add tail node to linked list
            }
         }
         sc.close();
   }
      catch(Exception e) {  //if there's a problem with file
         System.out.println("Error processing file!");
         System.out.println(e.toString());
      }
      return unsorted;
   }

   public static Radix_Sort sortFile(String file) {
      SingleLinkedList_Entry list = createList(file);  //create from file
      Radix_Sort unsorted = new Radix_Sort(list, numDigits);
      unsorted.sortList().print();                     //sort and print
      return unsorted;
   }
}