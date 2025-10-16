package app;

import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Principal {
	
	public static void main (String[] args) {
		
		PessoaFisica pf  = new PessoaFisica();
		pf.setNome("Leandra");
		pf.setCpf("1111111111");
		
		PessoaJuridica pj  = new PessoaJuridica();
		pj.setNome("Leo");
		pj.setCnpj("2222222222");
		
		Pessoa p = pf;
		p.imprimir();
		
		System.out.println();
		
		p = pj;
		p.imprimir();
	}
	public static void impressao(Pessoa pessoa) {
		pessoa.imprimir();
		
	}
}

