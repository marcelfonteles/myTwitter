package Exceptions;

public class UNCException extends Exception {
	private String usuario;
	
	public UNCException(String usuario) {
		super("Usuário Inexistente.");
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return this.usuario;
	}

}
