package Exceptions;

public class UJCException extends Exception {
	private String usuario;
	
	public UJCException(String usuario) {
		super("Nome de usuário já cadastrado.");
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return this.usuario;
	}

}
