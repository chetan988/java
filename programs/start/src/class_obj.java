class person {
	private String name;
	private String sex;
	private int age;
	// set and get method
	person() {
		System.out.println("This ia an empty constructor");
	}  // called default constructor
	//constructor override
	person(String name,String sex) {
		this.name = name;
		this.sex = sex;
		System.out.println("This a constructor with name and sex only");
	}
	person(String name,String sex,int age) {
		this(name,sex);
		this.age=age;
		System.out.println("This a constructor with name ,sex,age ");
	}
	void setName(String name) {
		this.name=name;
	}
	void setSex(String sex) {
		this.sex=sex;
	}
	void setAge(int age) {
		this.age=age;
	}
	
	String getName() {
		return name;
	}
	String getSex() {
		return sex;
	}
	int getAge() {
		return age;
	}
	void sayHello() {
		System.out.println("Hello world!!\nI am "+name+ "\nI am "+ age +" old "+ sex);
	}
}


public class class_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new person(); // this is valid and will call constructor
		person p1 = new person();
		
		p1.setName("Chetan");
		p1.setSex("male");
		p1.setAge(26);
		
		person p2 = new person("Ram","male");
		p2.setAge(27);
		
		person p3 = new person("Swapna","male",29);
		System.out.println("p1 attributes :");
		System.out.println("name : " + p1.getName() + " age : "+ p1.getAge() + " sex : " + p1.getSex());
		System.out.println("p2 attributes :");
		System.out.println("name : " + p2.getName() + " age : "+ p2.getAge() + " sex : " + p2.getSex());
		System.out.println("p3 attributes :");
		System.out.println("name : " + p3.getName() + " age : "+ p3.getAge() + " sex : " + p3.getSex());
		
		p1.sayHello();
		p2.sayHello();
		p3.sayHello();
	}
}
