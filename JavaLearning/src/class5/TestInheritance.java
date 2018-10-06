package class5;

import class3.*; // To use classes of different packages
import class6.AccessSpecifier;
import class6.AccessSpecifierChild;


public class TestInheritance {

	public static void main(String[] args) {

		Dog obj = new Dog();
		obj.eat(); // Accessing Parent -Animal class method
		obj.Bark(); // Accessing own methods
		
		Animal ani = new Animal();
		ani.eat();
	 //	ani.Bark(); // Parent 
		
		BabyDog baby = new BabyDog();
		baby.eat();  // Accessing base parent method - Animal Class
		baby.Bark(); // Accessing parent method - Dog class
		baby.Cry(); // Accessing own methods
		
		//Arrays arr = new Arrays();
	
		Cat catobj = new Cat();
		catobj.eat();
		catobj.Meow();
		
		AccessSpecifier obj1 = new AccessSpecifier();
		//obj1.b => Default variable not able to access in different package
		obj1.publicMethod();
		
		AccessSpecifierChild obj2 = new AccessSpecifierChild();
		//obj2.pro => no access 
		obj2.publicMethod();
	}

}
