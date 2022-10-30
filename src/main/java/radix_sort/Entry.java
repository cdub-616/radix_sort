/*******************************************************************************
 *                               class Entry                                   *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class constructs an Entry class containing two Strings.                *
 *                                                                             *
 * public Entry()                                                              *
 *    default constructor                                                      *
 * public Entry(String, String)                                                *
 *    constructor                                                              *
 ******************************************************************************/
package radix_sort;

public class Entry {
	
   public String key,    //used to sort data
                 value;  //data associated with key
	
   public Entry() {
      this.key = "0";
      this.value = "";
   }
    
   public Entry(String ky, String val) {
      this.key = ky;
      this.value = val;
   }
}