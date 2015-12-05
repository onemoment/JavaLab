class Obliczenia{
	private double a;
	private double b;
	private double c;
	
	private double x1;
	private double x2;
	
	private boolean sa_rozwiazania;
	private int blad;
	
	public Obliczenia(){
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.x1 = 0;
		this.x2 = 0;
		this.sa_rozwiazania = false;
		this.blad = 0;
	}
	
	public void zapisz(String[] argumenty){
		if (argumenty.length >= 3){
			this.a = Double.parseDouble(argumenty[0]);
			this.b = Double.parseDouble(argumenty[1]);
			this.c = Double.parseDouble(argumenty[2]);
		}
	}
	
	private double delta(){
		return b*b - 4*a*c;
	}
	
	public void policz(){
		
		double b2 = 0;
		double a2 = 0;
		double sqrt_delta = 0;
		
		double delta = this.delta();
		if (delta >= 0){
			
			if (this.a != 0.0){
				
				b2 = (-1) * this.b * this.b;
				a2 = 2 * this.a;
				sqrt_delta = Math.sqrt(delta);
				
				this.x1 = (b2 + sqrt_delta) / a2;
				this.x2 = (b2 - sqrt_delta) / a2;
				
				this.sa_rozwiazania = true;
			} else {
				this.blad = 1;
			}
			//
		}
		else{
			this.blad = 2;
		}
		//
	}
	
	public void wypisz(){
		System.out.println("Rownanie: " + this.a + "x^2 + " + this.b + "x + " + this.c + " = 0");
		
		if (this.sa_rozwiazania){
			System.out.println("x1 = " + this.x1);
			System.out.println("x2 = " + this.x2);
		}
		else{
			switch(this.blad){
			case 1: System.out.println("Nie jest rownaniem kwadratowym.");
				break;
			case 2: System.out.println("Nie ma rozwiazania.");
				break;
			}
		}
	}
	
}

public class Zadanie03 {


	public static void main(String[] args){
		Obliczenia obliczenia = new Obliczenia();
		obliczenia.zapisz(args);
		obliczenia.policz();
		obliczenia.wypisz();
	}

}
