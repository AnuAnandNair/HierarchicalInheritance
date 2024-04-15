package heirarchichalinheritance;

public class Class2 extends ParentClass {
	public void display2() {
		System.out.println("In childclass 2");
	}
	
	 static public void main(String[] args) {
		// TODO Auto-generated method stub		
		Class2 obj2=new Class2();
		obj2.display2();
		obj2.displayparent();		
	}
}
