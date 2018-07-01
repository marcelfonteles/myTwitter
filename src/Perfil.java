import java.util.Vector;

public class Perfil {
	private String usuario;
	private Vector<Perfil> seguidos;
	private Vector<Perfil> seguidores;
	private Vector<Tweet> timeline; // Erro pq ainda não existe uma classe Tweet.
	private boolean ativo;
	
	// CONSTRUTOR
	public Perfil(String usuario) {
		this.usuario = usuario;
	}
	public void addSeguido(Perfil usuario) {
		
	}
	public void addSeoguidor(Perfil usuario) {
		
	}
	public void addTweet(Tweet tweet) {
		
	}
	public void setUsuario(String usuario) {
		
	}
	public String getUsuario() { // Erro pq não tá retornando uma String ainda.
		return "Teste";
	}
	public Vector<Perfil> getSeguidos() { // Erro pq não tá retornando um Vector ainda.
		
	}
	public Vector<Perfil> getSeguidores(){ // Erro pq não tá retornando um Vector ainda.
		
	}
	public Vector<Tweet> getTimeline(){
		
	}
	public void setAtivo(boolean valor) {
		
	}
	public boolean isAtivo() {
		return true;
	}
}
