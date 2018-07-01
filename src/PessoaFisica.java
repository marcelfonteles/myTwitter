
public class PessoaFisica extends Perfil {
	private long cpf;
	
	// CONSTRUTOR
	public PessoaFisica(String usuario) {
		super(usuario);
	}
	
	// MÉTODOS
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getCpf() {
		return this.cpf;
	}

}
