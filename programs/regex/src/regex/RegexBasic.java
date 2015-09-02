package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic {

	public static void main(String[] args) {
		// method 1
		Pattern p = Pattern.compile("c.t");
		Matcher m = p.matcher("cat");
		boolean flag = m.matches();
		
		System.out.println(flag);
		
		// method 2
		
		boolean flag1 = Pattern.compile("c.t").matcher("cut").matches();
		System.out.println(flag1);
		
		// method3
		
		Matcher m1 = Pattern.compile("c.t.").matcher("cote");
		boolean flag2 = m1.matches();
		
		System.out.println(flag2);
		
		// method 4
		
		boolean flag4 = Pattern.matches("c.t", "cat");
		System.out.println(flag4);
	}

}
