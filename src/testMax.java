//Declaring Generic Class With Extends Comparable
public class testMax<G extends Comparable<G>> {
G x ,y,z;
/*
 * Declaring Parameter Constructor
 */
public testMax(G x,G y,G z) {
	this.x = x;
	this.y = y;
	this.z = z;
}
	//Declaring Maximum Method
	public G maximum() {
		return testMax.maximum(x,y,z);
	}
	
	//To Find Maximum Number
	//Using CompareTo Method To Find Max Number
	public static <G extends Comparable <G>> G maximum (G x, G y ,G z) {
		G max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
	
		printMax(x,y,z,max);
		return max;
		}

	//To Find Maximum String
	//Using CompareTo Method To Find Max String
	public static String testMaximum(String x,String y,String z) {
		String max =x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
	
		printMax(x,y,z,max);
		return max;
	}
	
	//Printing Max Of Integer,Float,String
	public static <G> void printMax(G x ,G y,G z,G max) {
		 System.out.printf("Maximum of %s, %s and %s is %s\n", x,y,z,max);
	}
	
	/*
	 * Declaring Main Method 
	 * Declaring Variables For Integer , Float,String
	 */
	public static void main(String[] args) {

		Integer xInt = 32, yInt = 56 , zInt = 89;
		Float xF1 = 5.6f, yF1 = 2.8f , zF1 = 7.9f;
		String xStr = "Govardhan" , yStr = "Reddy" , zStr = "Bajjuri";	
		new testMax(xInt,yInt,zInt).maximum();
		new testMax(xF1,yF1,zF1).maximum();
		new testMax(xStr,yStr,zStr).maximum();
	}
}