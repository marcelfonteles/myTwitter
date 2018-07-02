package Exceptions;

public class SIException extends Exception {
	private String usuario;
	
	public SIException(String usuario) {
		super("Você não pode seguir a você mesmo.");
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return this.usuario;
	}

}
