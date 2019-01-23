import java.io.IOException;

public class Eccezzo {
	
	public void ioSbaglio(int tipo) throws Exception {
		switch(tipo) {
		case 1: throw new miaEccexione("Roberto");
		case 2:	throw new IOException("Prova");
		case 3: throw new Exception("Generica");
		case 4:	System.err.println("Funziona bene");
				break;
		} 
		System.err.println("Non stampo mai questo");
	}
	
	public void ioChiamoSbaglio(int tipo) throws Exception {
		System.err.println("Prima della chiamata");
		ioSbaglio(tipo);
		System.err.println("Dopo la chiamata");
	}
	

}
