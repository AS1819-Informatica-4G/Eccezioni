import java.io.IOException;

public class Principale {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Eccezzo ez=new Eccezzo();
	
		
		try {
			ez.ioChiamoSbaglio(1);
			System.err.println("Questa non la eseguirà mai");
			// open file
			// operazioni su file
			// close
			
		} catch (IOException e ) {
			System.err.println("Errore di IO");
		} catch (miaEccexione e) {
			e.printStackTrace();
			System.err.println("Ecco la tua eccezione: "+e.getNome());
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Ecco la tua eccezione");
		} finally {
			System.err.println("Qui termino tutte le attività");
		}
		System.err.println("Finisco");
	}

}
