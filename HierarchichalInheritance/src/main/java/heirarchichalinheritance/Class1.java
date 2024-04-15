package heirarchichalinheritance;

public class Class1 extends ParentClass {
	public void display1() {
		System.out.println("In childclass 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj1=new Class1();
		obj1.display1();
		obj1.displayparent();		
	}
}
