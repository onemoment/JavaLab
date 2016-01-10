package files;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;

public class Files {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String sciezka_do_pliku = "C:\\Users\\student\\workspace\\JavaLab03_Zad01\\klasa.bin";
		
		Listing listing = new Listing();
		
		// deserializacja
		boolean loaded = false;
	    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(sciezka_do_pliku));
	    try {
	    	//Listing obj = (Listing)(ois.readObject());
	    	//if (Listing.serialVersionUID == obj.serialVersionUID)
	    		listing = (Listing)(ois.readObject());//obj; 
	    } catch (InvalidClassException e) {
	        //if (!e.eof) throw e;
	    } finally {
	        ois.close();
	        loaded = true;
	    }
	    
	    if (loaded){
	    	listing.lista(true);
	    }
	    //
	    
		if (args.length > 1){
			if (args[0].compareToIgnoreCase("-ls") == 0){
				boolean showOnly = args.length > 2 && args[2].compareToIgnoreCase("-so") == 0;
				listing.setPath(args[1]);
				listing.lista(showOnly);
			}
		}
		
		//
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(sciezka_do_pliku)
				)
			);
			oos.writeObject(listing);
			oos.close();
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		//
		
		
	}

}
