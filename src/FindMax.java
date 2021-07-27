
public class FindMax {
	/*
	 * Ask User To Find Max  By Using Generics
	 */

// Determines The Largest Of Three Comparable Objects
 public static <T extends Comparable<T>> T max(T... elements) {
	    T max = elements[2];
	    for (T element : elements) {
	        if (element.compareTo(max) > 0) {
	            max = element;
	        }
	    }
	    return max;
	}
 /*
  * Declaring The Main Method 
  * And Printing The Maximum String
  */
  public static void main(String args[]) {
	       System.out.println("Maximum String Is : " + max("Govardhan", "Reddy" ,"Bajjuri"));

  }
}
