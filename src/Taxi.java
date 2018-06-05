import com.basic.Car;


	public class Taxi extends Car{
		public Taxi()
		{
			System.out.println("Taxi cons with no args");
		}
		public Taxi(int a)
		{
			System.out.println("Taxi cons with one args");
		}

		@Override
		public void brake() {
			System.out.println("brake in taxi");
			//super.brake();
		}
		public static void main(String[] args) {
			Taxi taxi=new Taxi(10);
			taxi.brake();
		}
	}

