package modelo;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void imprimir() {
		System.out.println("Pesssoa Juridica");
		System.out.println(getNome());
		System.out.println(getCnpj());
		
	}
	

}

