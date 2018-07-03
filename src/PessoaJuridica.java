
public class PessoaJuridica extends Perfil {
	private long cpnj;
	
	// CONSTRUTOR
	public PessoaJuridica(String usuario) {
		super(usuario);
	}
	
	// MÉTODOS
	public void setCnpj(long cnpj) {
		this.cpnj = cnpj;
	}
	public long getCnpj() {
		return this.cpnj;
	}
	
	

}
