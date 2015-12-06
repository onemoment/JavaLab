public class Zadanie04 {

	public static void main(String[] args) {
		
		Driver drv;
		
		if (args.length == 2){
			drv = new Driver(args);
		}
		else
		{
			drv = new Driver();
		}

		drv.porownaj(true);
	}

}
