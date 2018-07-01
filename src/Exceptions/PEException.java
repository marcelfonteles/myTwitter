package Exceptions;

public class PEException extends Exception {
	private String usuario;
	
	public PEException(String usuario) {
		super("Nome de usuário está em uso.");
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
}
