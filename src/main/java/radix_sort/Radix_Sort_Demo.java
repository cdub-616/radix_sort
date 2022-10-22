package radix_sort;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Radix_Sort_Demo {

   static String years = "years.txt",
                 pokemon = "pokemon.txt",
                 stooges = "stooges.txt",
                 areacode = "areacode.txt",
                 zipcodes = "zipcodes.txt";
   static int numDigits = 0;

   static SingleLinkedList_Entry createList() {
   
      SingleLinkedList_Entry unsorted = new SingleLinkedList_Entry();
   
      try {
         File file = new File(years);
         Scanner sc = new Scanner(file);
   
         numDigits = sc.nextInt();
         while (sc.nextLine() != "END" && sc.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(),",");  
            while (st.hasMoreTokens()) {  
               String key = st.nextToken();
               String value = st.nextToken();  
               unsorted.addTail(key,  value);
            }  
         }
         sc.close();
      }
      catch(Exception e) {
         System.out.println("Unable to open file!");
      }
      return unsorted;
   }

   public static void main(String[] args) {
   
   SingleLinkedList_Entry list = createList();
   Radix_Sort unsorted = new Radix_Sort(list, numDigits);
   
   
   }
}
