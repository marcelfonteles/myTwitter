import java.util.Vector;
import Exceptions.*;
public class MyTwitter implements ITwitter {
	private Repositorio repositorio;
	
	public MyTwitter(Repositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	// Cadastrar Perfil.
	public void criarPerfil(Perfil usuario) throws PEException{
		try {
			repositorio.cadastrar(usuario);
		} catch(UJCException exception) {
			throw new PEException(usuario.getUsuario());			
		} finally {
			
		}	
	}
	public void cancelarPerfil(String usuario) throws PIException, PDException {
		try {
			if (repositorio.buscar(usuario) != null) {
				Perfil perfil = repositorio.buscar(usuario);
				if (perfil.isAtivo()) {
					perfil.setAtivo(false);
				} else {
					throw new PDException(usuario);
				}
			} else {
				throw new PIException(usuario); 
			}		
		} finally {
			
		}
	}
	
	public void tweetar(String usuario, String mensagem)throws PIException, MFPException{
		try {
			if (repositorio.buscar(usuario) != null) {
				if (mensagem.length() >= 1 && mensagem.length() <= 140) {
					Perfil perfil = repositorio.buscar(usuario);
					Tweet tweet = new Tweet();
					tweet.setUsuario(usuario);
					tweet.setMensagem(mensagem);
					perfil.addTweet(tweet);
					for (Perfil seguidores : perfil.getSeguidores()) {
						seguidores.addTweet(tweet);
					}
				}else {
					throw new MFPException(mensagem);
				}
			} else {
				throw new PIException(usuario);
			}
		}
	}
	public Vector<Tweet> timeline(String usuario)throws PIException, PDException{
		
	}
	public Vector<Tweet> tweets(String usuario) throws PIException, PDException;
	public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException;
	public int numeroSeguidores(String usuario) throws PIException, PDException;
	public Vector<Perfil> seguidores(String usuario) throws PIException, PDException;
	public Vector<Perfil> seguidos(String usuario) throws PIException, PDException;
}
