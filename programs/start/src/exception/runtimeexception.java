package exception;

public class runtimeexception {
	public static void main (String[] args){
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch(RuntimeException e) {
			System.out.println(e.toString());
		}
		System.out.println("next step");
	}

}
