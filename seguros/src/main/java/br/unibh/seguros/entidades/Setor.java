package br.unibh.seguros.entidades;

public class Setor {

	private Long id;
	private String nome;
	private String sigla;
	private Setor setorSuperior;
	private Set<Funcionario> funcionarios;
	
	public String toString() {
		
	}
}
