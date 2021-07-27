
public class FindMax {
	/*
	 * Ask User To Find Max Integer By Using Generics
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
  * And Printing The Maximum Integer Number
  */
  public static void main(String args[]) {
      System.out.println("Maximum Integer Is : " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89)));

  }
}
