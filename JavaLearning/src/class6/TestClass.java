package class6;

public class TestClass {

	public static void main(String[] args) {

		AccessSpecifier obj = new AccessSpecifier();
		//obj.a = 10; -> Not allowed due to Private member of base class
		obj.b = 20;  // allowed since this is default in base class
		obj.pro = 30; // allowed since this is protected
		obj.publicMethod(); // allowed due to Public method

		AccessSpecifierChild child = new AccessSpecifierChild();
		child.publicMethod(); // allowed due to public method in base class
		child.pro = 40; // allowed to access from Child class
		
	}

}
