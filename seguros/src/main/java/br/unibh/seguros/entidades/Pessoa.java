package br.unibh.seguros.entidades;

import java.util.Date;

public class Pessoa abstract {
	
	private Long id;
	
	private String nome;
	private String sexo;
	private String cpf;
	private String telefoneComercial;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String email;
	private Date dataNascimento;
	private Date dataCadastro;
	
	public String toString() {
		
	}
}
