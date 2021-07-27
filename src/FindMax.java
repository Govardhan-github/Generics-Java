
public class FindMax {
	/*
	 * Ask User To Find Max  By Using Generics
	 */

// Determines The Largest Of Three Comparable Objects
 public static <T extends Comparable<T>> T max(T... elements) {
	    T max = elements[0];
	    for (T element : elements) {
	        if (element.compareTo(max) > 0) {
	            max = element;
	        }
	    }
	    return max;
	}
 /*
  * Declaring The Main Method 
  * And Printing The Maximum Number
  */
  public static void main(String args[]) {
	     System.out.printf(" Max of 5.6 ,7.8 ,2.9 Float Number is : " + max(Float.valueOf( 5.6f), Float.valueOf(7.8f), Float.valueOf(2.9f)));
	     
  }
}
