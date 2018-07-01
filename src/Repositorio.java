import java.util.Vector;

public class Repositorio implements IRepositorioUsuario {
	// Todos os perfis.
	private Vector<Perfil> allPerfil;
	
	
	public void cadastrar(Perfil usuario) {
		if (this.buscar(usuario.getUsuario()) == null){
			this.allPerfil.add(usuario);
			System.out.println("Usuário cadastrado com sucesso.");
		} else {
			System.out.println("Nome de usuário já existente.");
		}		
	}
	
	public Perfil buscar(String usuario) {
		Perfil user = null;
		for (Perfil perfil : allPerfil) {
			if (perfil.getUsuario() == usuario) {
				user = perfil;
			}			
		}
		return user;
	}
	public void atualizar(Perfil usuario) {
		
	}

}
