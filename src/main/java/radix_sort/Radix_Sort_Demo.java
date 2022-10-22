package radix_sort;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Radix_Sort_Demo {

   public static void main(String[] args) {
   
   String years = "years.txt",
          pokemon = "pokemon.txt",
          stooges = "stooges.txt",
          areacode = "areacode.txt",
          zipcodes = "zipcodes.txt";
   int numDigits = 0;
   
      try {
      
         File file = new File(years);
         Scanner sc = new Scanner(file);
         
         numDigits = sc.nextInt();
         while (sc.nextLine() != "END" && sc.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(),",");  
            while (st.hasMoreTokens()) {  
               System.out.println(st.nextToken());  
            }  
         }      
         sc.close();
      }
      catch(Exception e) {
         System.out.println("Unable to open file!");
      }
   }
}
