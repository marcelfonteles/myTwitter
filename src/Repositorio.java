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
			System.out.println("Número de Usuários(final): " + allPerfil.size());
		} else {
			throw new UJCException(usuario.getUsuario());
		}		
	}
	
	// Procurar nomes de perfis iguais
	public Perfil buscar(String usuario) {
		
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
		Perfil contaAtualizar = this.buscar(usuario.getUsuario());
		if (contaAtualizar != null) {
			contaAtualizar.setAtivo(usuario.isAtivo());
			if (contaAtualizar instanceof PessoaFisica) {
				((PessoaFisica) contaAtualizar).setCpf(((PessoaFisica) usuario).getCpf());
			} else if (contaAtualizar instanceof PessoaJuridica) {
				((PessoaJuridica) contaAtualizar).setCnpj(((PessoaJuridica) usuario).getCnpj());				
			}			
		}else {
			throw new UNCException(usuario.getUsuario());
		}		
	}
	
	// TODOS OS PERFIS
		public void todosPerfis() {
			int count = 0;
			for (Perfil perfil : allPerfil) {
				count++;
				System.out.println(count + " - " + perfil.getUsuario());
				System.out.println("Ativo: " + perfil.isAtivo());
			}
		}

}
