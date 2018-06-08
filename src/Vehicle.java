
public abstract class Vehicle implements Travel,Owner{

}
class Car extends Vehicle{

	@Override
	public void getSpeed() {
		System.out.println("speed of car");
	
	}

	@Override
	public void ownerName() {
	
		System.out.println("ownername of car");
	}
	
}
class Cycle extends Vehicle{

	@Override
	public void getSpeed() {
		System.out.println("speed of cycle");
	
	}

	@Override
	public void ownerName() {
		System.out.println("ownername of cycle");
		
	}
	
}
class Bike extends Vehicle{
	@Override
	public void getSpeed() {
		System.out.println("speed of bike");
	
	}

	@Override
	public void ownerName() {
		System.out.println("ownername of bike");
		
	}
	
}