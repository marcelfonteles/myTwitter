package Exceptions;

public class MFPException extends Exception {
	private String mensagem;
	
	public MFPException(String mensagem) {
		super("Mensagem fora do padrão");
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}

}
