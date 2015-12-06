public class Temperature{
	
	private double wartosc;
	private char skala;

	public Temperature(){
		this.wartosc = 0;
		this.skala = 'C';
	}
	
	public Temperature(double Wartosc){
		this.wartosc = Wartosc;
		this.skala = 'C';
	}
	
	public Temperature(char Skala){
		this.wartosc = 0;
		this.skala = Skala;
	}
	
	public Temperature(double Wartosc, char Skala){
		this.wartosc = Wartosc;
		this.skala = Skala;
	}
	
	public double getWartosc(){
		return this.wartosc;
	}
	
	public char getSkala(){
		return this.skala;
	}
	
	public void setWartosc(double Wartosc){
		this.wartosc = Wartosc;
	}
	
	public void setSkala(char Skala){
		this.skala = Skala;
	}
	
	public void setTemperatura(double Wartosc, char Skala){
		this.wartosc = Wartosc;
		this.skala = Skala;
	}
	
	public double getCelsius(){
		if (this.skala == 'C')
		{ return this.wartosc;}
		else 
		{ return 5 * (this.wartosc - 32) / 9; }
	}
	
	public double getFahrenheit(){
		if (this.skala == 'F')
		{ return this.wartosc;}
		else 
		{ return 9 * (this.wartosc/5) + 32; }
	}
	
	public int porownaj(Temperature Temperatura1){
		double roznica = this.getCelsius() - Temperatura1.getCelsius();
		
		if (roznica > 0.0){
			return 1;
		}else if (roznica < 0.0){
			return -1;
		}
		
		return 0;
	}
	
	public void drukuj(){
		System.out.println("Temperatura: " + this.wartosc + this.skala);
	}
}
