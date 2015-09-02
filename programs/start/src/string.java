class person_new {
	private String name;
	private int id;
	
	person_new(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ").append(id).append("-->").append(name);
		return sb.toString();
	}
	
}


public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// inefficient
		String info = "";
		info += "India is a beautiful country.";
		info += " Indians are very helpful.";
		System.out.println(info);
		
		// efficient stringbuilder
		
		StringBuilder sb = new StringBuilder();
		sb.append("India is a beautiful country.");
		sb.append(" ");
		sb.append("India is full of cultural heritage");
		
		System.out.println(sb.toString());
		System.out.printf("%s : %d\n","hello world!!",10);
		
		for (int i=9;i<13;i++) {
			System.out.printf("%2d: formatted output\n",i);
			
		}
		

		for (int i=9;i<13;i++) {
			System.out.printf("%5.2f: formatted output\n",i*1.1);  // here 5 is total string character i.e all number before '.' , '.' itself then after '.'
		}
		*/
		
		
		person_new p1 = new person_new("chetan",10);
		person_new p2 = new person_new("Tiger",20);
		System.out.println(p1);
		System.out.println(p2);
		
		person p = new person();
		p.setAge(10);
		p.setName("deer");
		p.setSex("M");
		p.sayHello();
		
	}
	

}
