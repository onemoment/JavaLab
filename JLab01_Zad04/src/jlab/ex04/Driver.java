package jlab.ex04;

public class Driver{
	
	private Temperature temp1;
	private Temperature temp2;
	private Temperature temp3;
	private Temperature temp4;
	
	public Driver(){
		this.temp1 = new Temperature();
		this.temp2 = new Temperature(23.5);
		this.temp3 = new Temperature('F');
		this.temp4 = new Temperature(12.5, 'F');
	}
	
	private Temperature getObject(String Word){
		String str = Word;
		str.trim();
		
		double val;
		char sca;
		
		Temperature temp = new Temperature();
		
		if (str.length() > 1){
			sca = str.charAt(str.length() -1);
			
			if ( sca == 'F' ||  sca == 'C'){
				val = Double.parseDouble( str.substring(0, str.length()-1) );
				temp.setTemperature(val, sca);
			}
		}
		return temp;
	}
	
	public void noArgs(){
		temp1.print();
		temp2.print();
		temp3.print();
		temp4.print();
	}
	
	public void withArgs(String[] arguments){
		if (arguments.length == 2){
			this.temp1 = this.getObject(arguments[0]);
			this.temp2 = this.getObject(arguments[1]);
			
			//this.temp1.print();
			//this.temp2.print();
		}
	}
	
	public int compare(boolean Print){
		int result = this.temp1.compare(this.temp2);
		if (Print) System.out.println(result);
		return result;
	}
}