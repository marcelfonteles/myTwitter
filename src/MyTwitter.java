import java.util.Vector;
import Exceptions.*;
public class MyTwitter implements ITwitter {
	private Repositorio repositorio;
	
	public MyTwitter(Repositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	// Cadastrar Perfil.
	public void criarPerfil(Perfil usuario) throws PEException, UJCException {
		try {
			repositorio.cadastrar(usuario);
		} catch(UJCException exception) {
			throw new PEException(usuario.getUsuario());			
		} finally {
			
		}	
	}
	public void cancelarPerfil(String usuario) throws PIException, PDException;
	public void tweetar(String usuario, String mensagem)throws PIException, MFPException;
	public Vector<Tweet> timeline(String usuario)throws PIException, PDException;
	public Vector<Tweet> tweets(String usuario) throws PIException, PDException;
	public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException;
	public int numeroSeguidores(String usuario) throws PIException, PDException;
	public Vector<Perfil> seguidores(String usuario) throws PIException, PDException;
	public Vector<Perfil> seguidos(String usuario) throws PIException, PDException;
}
