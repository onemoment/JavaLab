public class Zadanie04 {

	public static void main(String[] args) {
		
		Driver driver;
		
		if (args.length == 2){
			driver = new Driver(args);
		}
		else
		{
			driver = new Driver();
		}

		driver.compare(true);
	}

}
