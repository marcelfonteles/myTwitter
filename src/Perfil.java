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
	
	// MÉTODOS
	public void addSeguido(Perfil usuario) { // busca pra ver se existe
		this.seguidos.add(usuario);		
	}
	public void addSeguidor(Perfil usuario) { // busca pra ver se existe
		this.seguidores.add(usuario);
	}
	public void addTweet(Tweet tweet) { // busca pra ver se existe
		this.timeline.add(tweet);
	}
	public void setUsuario(String usuario) { // busca pra ver se já existe
		this.usuario = usuario;		
	}
	public String getUsuario() { 
		return this.usuario;
	}
	public Vector<Perfil> getSeguidos() { // busca pra ver se existe
		return this.seguidos;		
	}
	public Vector<Perfil> getSeguidores(){ // busca pra ver se existe
		return this.seguidores;
	}
	public Vector<Tweet> getTimeline(){ // busca pra ver se existe
		return this.timeline;
	}
	public void setAtivo(boolean valor) {
		this.ativo = valor;
		
	}
	public boolean isAtivo() {
		return this.ativo;
	}
	
}
