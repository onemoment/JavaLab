package jlab.ex04;


public class Zadanie04 {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		if (args.length == 2){
			driver.withArgs(args);
			driver.compare(true);
		}
		else
		{
			driver.noArgs();
		}
	}

}
