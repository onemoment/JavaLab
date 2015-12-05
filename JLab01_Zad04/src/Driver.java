public class Driver{
	private Temperature temp1 = new Temperature();
	private Temperature temp2 = new Temperature(23.5);
	private Temperature temp3 = new Temperature('F');
	private Temperature temp4 = new Temperature(12.5, 'F');
	
	public Driver(){
		temp1.drukuj();
		temp2.drukuj();
		temp3.drukuj();
		temp4.drukuj();
	}
	
	private Temperature getObiekt(String Wpis){
		String str = Wpis;
		str.trim();
		
		double wart;
		char skal;
		
		Temperature temp = new Temperature();
		
		if (str.length() > 1){
			skal = str.charAt(str.length() -1);
			
			if ( skal == 'F' ||  skal == 'C'){
				wart = Double.parseDouble( str.substring(0, str.length()-1) );
				temp.setTemperatura(wart, skal);
			}
		}
		return temp;
	}
	
	public Driver(String[] argumenty){
		if (argumenty.length == 2){
			this.temp1 = this.getObiekt(argumenty[0]);
			this.temp2 = this.getObiekt(argumenty[1]);
			
			this.temp1.drukuj();
			this.temp2.drukuj();
		}
	}
	
	public void porownaj(){
		System.out.println(temp1.porownaj(temp1, temp2));
	}
}