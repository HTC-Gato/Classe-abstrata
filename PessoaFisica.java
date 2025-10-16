package modelo;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void imprimir() {
		System.out.println("Pessoa Fisica");
		System.out.println(getNome());
		System.out.println(getCpf());
	}
	

}

