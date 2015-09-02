package polymorphism;

public class Animal {
	protected String animalName;
	Animal(String animalName) {
		this.animalName = animalName;
	}
	public void whatIEat(String type) {
		System.out.println("I am a "+ this.animalName + " and I am a " + type);
	}
}
