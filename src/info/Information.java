package info;

public class Information {
	public static void main(String[] args) {
		Student s1=new Student();
	    s1.setFirstName("Boopathi");
		s1.setLastName("Raja");
		s1.setGender("Male");
		s1.setBranch("A");
		s1.setId(007);
		s1.setDept("CSE");
		System.out.println(s1.toString());
	}

}
