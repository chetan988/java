
public class Numericcasting {

	public static void main(String[] args){
		byte byteValue = 12;
		short si = 44;
		int intval = 55;
		long longval = 123456;
		
		float floatval = 22.2f;  // 22.2 is a double to make it float we can cast or put f at the end
		double d = 44.89;
		
		// to get the maximum value we can use <datatype>.MAX_VALUE
		
		System.out.println("maximum byte range = " + Byte.MIN_VALUE + " to "+ Byte.MAX_VALUE);
		System.out.println("maximum Integer range = " + Integer.MIN_VALUE + " to "+ Integer.MAX_VALUE);
		
		// now cast the variables:
		
		// this is risky as we are trying to assign a larg bucket value to small bucket, it may overflow
		int ci = (int) longval;
		System.out.println("ci = "+ci);
		
		// below will simply chop off the decimal not roundoff
		int castint = (int) d;
		System.out.println("castint = "+d);
		
		// this is perfectly fine as small bucket value is being transfered to large bucket
		int bytecast = (int) byteValue;
		System.out.println("bytecast =" +bytecast);
		
		// as 128 is large then byte range it will wrap up
		byte b = (byte)128;
		
		System.out.println("b = "+b);
		
		
		// we can cast constant directly
		float f = (float) 25.5; // casting double directly
		
		System.out.println("f ="+f);
		
		
	}
}
