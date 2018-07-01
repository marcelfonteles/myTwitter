import java.util.Vector;

import Exceptions.UJCException;
import Exceptions.UNCException;

public class Repositorio implements IRepositorioUsuario {
	// Todos os perfis.
	private Vector<Perfil> allPerfil;
	
	// Cadastrar perfil
	public void cadastrar(Perfil usuario) throws UJCException {
		if (this.buscar(usuario.getUsuario()) == null){
			this.allPerfil.add(usuario);
			System.out.println("Usuário cadastrado com sucesso.");
		} else {
			throw new UJCException(usuario.getUsuario());
		}		
	}
	
	// Procurar nomes de perfis iguais
	public Perfil buscar(String usuario) {
		Perfil user = null;
		for (Perfil perfil : allPerfil) {
			if (perfil.getUsuario() == usuario) {
				user = perfil;
			}			
		}
		return user;
	}
	
	
	public void atualizar(Perfil usuario) throws UNCException {
		if (this.buscar(usuario.getUsuario()) != null) {
			Perfil conta = this.buscar(usuario.getUsuario());
			conta.setAtivo(usuario.isAtivo());
		}else {
			throw new UNCException(usuario.getUsuario());
		}		
	}

}
