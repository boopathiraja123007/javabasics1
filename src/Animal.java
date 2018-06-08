
public  abstract class Animal implements Travel,Owner{

}
class Cat extends Animal{

	@Override
	public void getSpeed() {
		System.out.println("speed of cat");
	
	}

	@Override
	public void ownerName() {
	
		System.out.println("ownername of cat ");
	
}
class Dog extends Animal{

	@Override
	public void getSpeed() {
		System.out.println("speed of dog");
	
	}

	@Override
	public void ownerName() {
		System.out.println("ownername of dog ");
	}
		
	}
	
}
class Rabbit extends Animal{

	@Override
	public void getSpeed() {
		System.out.println("speed of rabbit");
	
	}

	@Override
	public void ownerName() {
		System.out.println("ownername of rabbit");
		
	}
	
}