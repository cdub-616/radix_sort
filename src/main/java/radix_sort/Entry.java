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
 * public String getKey()                                                      *
 *    returns data in key                                                      *
 * public String getValue()                                                    *
 *    returns data in value                                                    *
 ******************************************************************************/
package radix_sort;

public class Entry {
	
   private String key,    //used to sort data
                  value;  //data associated with key
	
   public Entry() {
      this.key = "0";
      this.value = "";
   }
    
   public Entry(String ky, String val) {
      this.key = ky;
      this.value = val;
   }
   
   public String getKey() {
      return this.key;
   }
   
   public String getValue() {
      return this.value;
   }
 }