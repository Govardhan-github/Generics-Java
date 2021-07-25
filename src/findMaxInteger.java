
public class findMaxInteger {	 
	/*
	 * Ask User To Find Max Integer By Using Generics
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
	 System.out.printf("Maximum of %d, %d and %d is %d\n\n", 44, 33, 88, max(44, 33, 88));
	  	  }
}