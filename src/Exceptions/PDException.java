package Exceptions;

public class PDException extends Exception {
	private String usuario;
	
	public PDException(String usuario) {
		super("Perfil já desativado");
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return this.usuario;
	}

}
