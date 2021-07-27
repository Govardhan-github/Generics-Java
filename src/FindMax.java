
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
  * And Printing The Maximum Float Number
  * And Printing The Maximum String
  */
  public static void main(String args[]) {
      System.out.println("Maximum Integer Is : " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89)));//To Print Maximum Integer
      System.out.println("Maximum of 5.6 7.8 2.9 Float Number is : " + max(Float.valueOf( 5.6f), Float.valueOf(7.8f), Float.valueOf(2.9f)));//To Print Maximum Float Number
      System.out.println("Maximum String Is : " + max("Govardhan", "Reddy" ,"Bajjuri"));//To Print Maximum String

  }
}
