/*******************************************************************************
 *                       class Entry                                           *
 * Chris Wright                                                                *
 * Version 1.0.0  10/21/2022                                                   *
 *                                                                             *
 * This class constructs an Entry class containing two Strings                 *
 *                                                                             *
 * Entry()                                                                     *
 *    default constructor                                                      *
 * Entry(String, String)                                                       *
 *    constructor                                                              *
 ******************************************************************************/
package radix_sort;

public class Entry {
	
   String key;
   String value;
	
   Entry() {
      this.key = "0";
      this.value = "";
   }
    
   Entry(String ky, String val) {
      this.key = ky;
      this.value = val;
   }
 }
