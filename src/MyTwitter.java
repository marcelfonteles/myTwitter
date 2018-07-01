import java.util.Vector;

public class MyTwitter implements ITwitter {
	private Repositorio repositorio;
	
	public MyTwitter(Repositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public void criarPerfil(Perfil usuario);
	public void cancelarPerfil(String usuario);
	public void tweetar(String usuario, String mensagem);
	public Vector<Tweet> timeline(String usuario);
	public Vector<Tweet> tweets(String usuario);
	public void seguir(String seguidor, String seguido);
	public int numeroSeguidores(String usuario);
	public Vector<Perfil> seguidores(String usuario);
	public Vector<Perfil> seguidos(String usuario);
}
