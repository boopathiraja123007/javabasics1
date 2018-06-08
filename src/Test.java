
public class Test {
	public static void main(String[] args) {
		Travel ani=new Bike();
		Owner vehi=new Cat();
	
		ani.getSpeed();
		((Owner) ani).ownerName();
		((Travel) vehi).getSpeed();
		
		vehi.ownerName();
		
	}
	

	
}
