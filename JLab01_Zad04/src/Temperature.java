public class Temperature{
	
	// pola prywatne
	private double value;
	private char scale;

	// konstruktory
	public Temperature(){
		this.value = 0;
		this.scale = 'C';
	}
	
	public Temperature(double Value){
		this.value = Value;
		this.scale = 'C';
	}
	
	public Temperature(char Scale){
		this.value = 0;
		this.scale = Scale;
	}
	
	public Temperature(double Value, char Scale){
		this.value = Value;
		this.scale = Scale;
	}
	
	// gettery
	public double getValue(){
		return this.value;
	}
	
	public char getScale(){
		return this.scale;
	}

	public double getCelsius(){
		if (this.scale == 'C')
		{ return this.value;}
		else 
		{ return 5 * (this.value - 32) / 9; }
	}
	
	public double getFahrenheit(){
		if (this.scale == 'F')
		{ return this.value;}
		else 
		{ return 9 * (this.value/5) + 32; }
	}
	
	// settery
	public void setValue(double Value){
		this.value = Value;
	}
	
	public void setScale(char Scale){
		this.scale = Scale;
	}
	
	public void setTemperature(double Value, char Scale){
		this.value = Value;
		this.scale = Scale;
	}
	
	// metody publiczne
	public int compare(Temperature Temperatura){
		double diff = this.getCelsius() - Temperatura.getCelsius();
		
		if (diff > 0.0){
			return 1;
		}else if (diff < 0.0){
			return -1;
		}
		
		return 0;
	}
	
	public void print(){
		System.out.println("Temperatura: " + this.value + this.scale);
	}
}
