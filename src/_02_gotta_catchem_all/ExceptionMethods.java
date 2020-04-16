package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double i, double j) {
		if(j==0.0) {
			throw new IllegalArgumentException();
		}
		return i/j;
	}
	String reverseString(String s) {
		String reverse="";
		if(s.isEmpty()==true) {
			throw new IllegalStateException();
		}
		for(int i=0; i<s.length(); i++) {
			reverse+=s.charAt(s.length()-(i+1));
			System.out.println(reverse);
		}
		return reverse;
	}
}
