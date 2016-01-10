package files;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Listing implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = 12L;
	
	private String path;
	private boolean ok;
	private List<String> katalog;
	private int licznik;
	
	public Listing(String path){
		zaladujSciezke(path);
	}
	
	public Listing(){
		this.path = "";
		this.ok = false;
		this.katalog = new ArrayList<String>();
		this.katalog.clear();
	}
	
	public void setPath(String path){
		zaladujSciezke(path);
	}
	
	private void zaladujSciezke(String path){
		File f = new File(path);
		this.ok = f.exists();
		if (this.ok){
			this.path = path;
			this.katalog.add(path);
		}
	}
	
	private String odstep(int poziom){
		String od = "";
		int ilosc = poziom * 5;
		for (int i = 0; i<ilosc; i++){
			od += " ";
		}
		return od;
	}
	
	private void odczytajKatalog(File folder, boolean tylkoWypisz, int poziom){
			
		for (File plik : folder.listFiles()) {
			if (plik.isDirectory()) {
				System.out.println(odstep(poziom) + "| + " + plik.getName());
				odczytajKatalog(plik, tylkoWypisz, poziom+1);
			} else {
			
				if (tylkoWypisz){
					System.out.println(odstep(poziom) + "| - " + plik.getName());
				}
			}
		}
	}
	
	public void lista(boolean wypisanie){
		if (this.ok){
			System.out.println("Katalog glowny: " + this.path);
			odczytajKatalog(new File(this.path), wypisanie, 0);
		}
	}
	
}
