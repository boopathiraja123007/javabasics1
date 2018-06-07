
public abstract class AbstractEx {
	public abstract void getString();
	public void normalMethod()
	{
		System.out.println("normal method");
	}

	public static void main(String[] args) {
		AbstractEx1 a=new  AbstractEx1();
        a.getString();
        a.normalMethod();
        
	}
}
  class AbstractEx1 extends AbstractEx{

	@Override
	public void getString() {
		System.out.println("getstring in subclass");
		
	}
	
}
