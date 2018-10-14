package class11;

// it is a guidlines and specify behaviour that class must implement
// only methods are declared
// Can have variables but are default static in nature
// variables values will not change , its final (const)
// No static methods in Interface
// No main method
// Objects can't get created from interface class
// Interface is abstract in nature

public interface InterfaceClassSchool {

	int interfaceVar = 100;
	void open();  // Only method declaration
	void close();
	void students();
	void classes();
	//void playground();
}
