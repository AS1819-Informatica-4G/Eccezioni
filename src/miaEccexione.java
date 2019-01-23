
public class miaEccexione extends Exception {
	private String nome;
	public miaEccexione(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
@Override	
	public void printStackTrace() {
		System.err.println("Speciale gestione per mia Exceptione");
}
	

}
