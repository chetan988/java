package polymorphism;

public class deer extends Animal implements Vegiterian {
	String name;
	deer(String name,String animalName) {
		super(animalName);
		this.name = name;
	}
	
	
	
	@Override
	public void whatIEat(String type) {
		// TODO Auto-generated method stub
		System.out.println("Deer always a vegitrian. Now check out what type of plan deer eats");
		whatPlantIeat("grass");
	}



	@Override
	public void whatPlantIeat(String type) {
		// TODO Auto-generated method stub
		System.out.println("I am "+ this.name + "  and i eat"+ type);
	}
	
}
