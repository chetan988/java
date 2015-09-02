package polymorphism;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		deer d = new deer("moondel","deer");
		Animal animal = d;
		Animal a = new Animal("tiger");
		a.whatIEat("non vegiterian");
		
		animal.whatIEat("Vegiterian");
		
		// this can not be called as animal is a polymorhic object but the method is not declared in the parent class
		//animal.whatPlantIeat();
	}

}
