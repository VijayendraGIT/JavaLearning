package class10;

public class MainArgs {
	
	String args[] = {"1","2"};

	// Reading command line arguments
	public static void main(String[] args) {

		if(args.length > 0){
			System.out.println("Print argument length ="+args.length);
			System.out.println("parameter 1 ="+args[0]);
			System.out.println("parameter 2 ="+args[1]);
			System.out.println("parameter 3 ="+args[2]);
		} else {
			System.out.println("Print argument length in Else = "+args.length);
		}
	}

}
