package br.unibh.seguros.entidades;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@table(name="tb_segurado")



public class Segurado extends Pessoa{
	
	public Segurado(Long id, String nome, String sexo, String cpf, String telefoneComercial, String telefoneResidencial,
			String telefoneCelular, String email, java.sql.Date dataNascimento, java.sql.Date dataCadastro) {
		super(id, nome, sexo, cpf, telefoneComercial, telefoneResidencial, telefoneCelular, email, dataNascimento,
				dataCadastro);
		// TODO Auto-generated constructor stub
	}
	@Column (columnDefinition="CHAR(1)", nullable=false)
	private String classe;
	
	@Column (name="numero_rg", length = 10, nullable=false)
	private String numeroRG;
	
	@Column (name="orgao_expedidor_rg", length = 50, nullable=false)
	private String orgaoExpedidorRG;
	
	@Column (name="numero_habilitacao", length = 20, nullable=false) 
	private String numeroHabilitacao;
	
	@Column (name="tipo_habilitacao", columnDefinition="CHAR(1)", nullable=false)
	private String tipoHabilitacao;
	
	@Column (name="data_validade_habilitacao", nullable=false)
	@Temporal (TemporalType.DATE)
	private Date dataValidadeHabilitacao;
	
	@Column (name="data_primeira_habilitacao", nullable=false)
	@Temporal (TemporalType.DATE)
	private Date dataPrimeiraHabilitacao;
	
	@Column (length = 150, nullable=false)
	private String logradouro;
	
	@Column (length = 30, nullable=false)
	private String numero;
	
	@Column (length = 100, nullable=false)
	private String complemento;
	
	@Column (columnDefinition="CHAR(10)", nullable=false)
	private String cep;
	
	@Column (length = 50, nullable=false)
	private String bairro;
	
	@Column (length = 100, nullable=false)
	private String cidade;
	
	@Column (columnDefinition="CHAR(2)", nullable=false)
	private String estado;
	
	@OneToOne
	private Set<Proposta> proposta;
	
	
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getNumeroRG() {
		return numeroRG;
	}
	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}
	public String getOrgaoExpedidorRG() {
		return orgaoExpedidorRG;
	}
	public void setOrgaoExpedidorRG(String orgaoExpedidorRG) {
		this.orgaoExpedidorRG = orgaoExpedidorRG;
	}
	
	public String getTipoHabilitacao() {
		return tipoHabilitacao;
	}
	public void setTipoHabilitacao(String tipoHabilitacao) {
		this.tipoHabilitacao = tipoHabilitacao;
	}
	public Date getDataValidadeHabilitacao() {
		return dataValidadeHabilitacao;
	}
	public void setDataValidadeHabilitacao(Date dataValidadeHabilitacao) {
		this.dataValidadeHabilitacao = dataValidadeHabilitacao;
	}
	public Date getDataPrimeiraHabilitacao() {
		return dataPrimeiraHabilitacao;
	}
	public void setDataPrimeiraHabilitacao(Date dataPrimeiraHabilitacao) {
		this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Set<Proposta> getProposta() {
		return proposta;
	}
	public void setProposta(Set<Proposta> proposta) {
		this.proposta = proposta;
	}
	

}
