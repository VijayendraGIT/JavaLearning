package class11;

public class ImplementSchool implements InterfaceClassSchool,InterfaceDaySchool{
	
	double openTimming;
	double closeTimming;
	int classes;
	public void open(){
		System.out.println("School should have Open timmings");
		openTimming = 8.30d;
	}
	public void close(){
		System.out.println("School should have Close timmings");
		closeTimming = 2.30d;
	}
	public void students(){
		System.out.println("School should have Stundents");
	}
	public void classes(){
		System.out.println("School should have Classes");
	}
	
	public void DayClass(){
		System.out.println("School have Day Classes only");
	}

	public static void main(String[] args) {
		
		//InterfaceClassSchool obj = new InterfaceClassSchool(); => Can't create interface object
		ImplementSchool DAV_School = new ImplementSchool();
		DAV_School.open();
		DAV_School.close();
		//DAV_School.interfaceVar = 200; => can't reassign value
		int a = interfaceVar;
		
		

	}

}
