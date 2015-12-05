import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		// zadanie 1
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Hello world!\n");
		
		int liczba1 = 0;
		int liczba2 = 0;
		int wynik = 0;
	 
		System.out.print("Podaj pierwsza liczbe: ");
		liczba1 = in.nextInt();
		
		System.out.print("Podaj druga liczbe: ");
		liczba2 = in.nextInt();
	    
		wynik = liczba1 + liczba2;
	              
	    System.out.println("Suma liczb wynosi: " + wynik);
	    
	    // zadanie 2
	    System.out.println("\n\n");
	    
	    for (int i=1; i<=12; i++){
	    	System.out.print(i + "\t");
	    	if (i % 3 == 0){
	    		System.out.print("\n");
	    	}
	    }
	    
	    // zadanie 3
	    
	    in.close();
	}

}
