import java.util.Vector;

import Exceptions.UJCException;
import Exceptions.UNCException;

public class Repositorio implements IRepositorioUsuario {
	// Todos os perfis.
	private Vector<Perfil> allPerfil;
	
	public Repositorio() {
		this.allPerfil = new Vector<Perfil>();
	}
	
	// Cadastrar perfil
	public void cadastrar(Perfil usuario) throws UJCException {
		if (buscar(usuario.getUsuario()) == null){
			this.allPerfil.add(usuario);
			System.out.println("Usuário cadastrado com sucesso.");
		} else {
			throw new UJCException(usuario.getUsuario());
		}		
	}
	
	// Procurar nomes de perfis iguais
	public Perfil buscar(String usuario) {
		System.out.println("Número de Usuários(inicio): " + allPerfil.size());
		if (allPerfil.size() == 0) {
			return null;
		}
		Perfil user = null;
		for (Perfil perfil : allPerfil) {
			if (perfil.getUsuario().equalsIgnoreCase(usuario)) {
				user = perfil;
			}			
		}
		return user;
	}
	
	
	public void atualizar(Perfil usuario) throws UNCException {
		if (this.buscar(usuario.getUsuario()) != null) {
			Perfil conta = this.buscar(usuario.getUsuario());
			conta.setAtivo(usuario.isAtivo());
		    if (usuario instanceof PessoaFisica) {
		    	((PessoaFisica) conta).setCpf(((PessoaFisica) usuario).getCpf());
		    } else if (usuario instanceof PessoaJuridica) {
		    	((PessoaJuridica) conta).setCnpj(((PessoaJuridica) usuario).getCnpj());
		    }
		}else {
			throw new UNCException(usuario.getUsuario());
		}		
	}

}
