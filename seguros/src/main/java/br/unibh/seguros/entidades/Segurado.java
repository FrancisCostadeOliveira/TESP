package br.unibh.seguros.entidades;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_segurado")
@PrimaryKeyJoinColumn
public class Segurado extends Pessoa{
	
	
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
	
	public Segurado(Long id, String nome, String sexo, String cpf, String telefoneComercial, String telefoneResidencial,
			String telefoneCelular, String email, java.sql.Date dataNascimento, java.sql.Date dataCadastro) {
		super(id, nome, sexo, cpf, telefoneComercial, telefoneResidencial, telefoneCelular, email, dataNascimento,
				dataCadastro);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((dataPrimeiraHabilitacao == null) ? 0 : dataPrimeiraHabilitacao.hashCode());
		result = prime * result + ((dataValidadeHabilitacao == null) ? 0 : dataValidadeHabilitacao.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + (( == null) ? 0 : .hashCode());
		result = prime * result + ((numeroRG == null) ? 0 : numeroRG.hashCode());
		result = prime * result + ((orgaoExpedidorRG == null) ? 0 : orgaoExpedidorRG.hashCode());
		result = prime * result + ((tipoHabilitacao == null) ? 0 : tipoHabilitacao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segurado other = (Segurado) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (classe == null) {
			if (other.classe != null)
				return false;
		} else if (!classe.equals(other.classe))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (dataPrimeiraHabilitacao == null) {
			if (other.dataPrimeiraHabilitacao != null)
				return false;
		} else if (!dataPrimeiraHabilitacao.equals(other.dataPrimeiraHabilitacao))
			return false;
		if (dataValidadeHabilitacao == null) {
			if (other.dataValidadeHabilitacao != null)
				return false;
		} else if (!dataValidadeHabilitacao.equals(other.dataValidadeHabilitacao))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if ( == null) {
			if (other. != null)
				return false;
		} else if (!.equals(other.))
			return false;
		if (numeroRG == null) {
			if (other.numeroRG != null)
				return false;
		} else if (!numeroRG.equals(other.numeroRG))
			return false;
		if (orgaoExpedidorRG == null) {
			if (other.orgaoExpedidorRG != null)
				return false;
		} else if (!orgaoExpedidorRG.equals(other.orgaoExpedidorRG))
			return false;
		if (tipoHabilitacao == null) {
			if (other.tipoHabilitacao != null)
				return false;
		} else if (!tipoHabilitacao.equals(other.tipoHabilitacao))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Segurado [classe=" + classe + ", numeroRG=" + numeroRG + ", orgaoExpedidorRG=" + orgaoExpedidorRG
				+ ", numeroHabilitacao=" +  + ", tipoHabilitacao=" + tipoHabilitacao
				+ ", dataValidadeHabilitacao=" + dataValidadeHabilitacao + ", dataPrimeiraHabilitacao="
				+ dataPrimeiraHabilitacao + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
				+ complemento + ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
				+ ", toString()=" + super.toString() + "]";
	}
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
	public String getNumeroHabilitacao() {
		return ;
	}
	public void setNumeroHabilitacao(String numeroHabilitacao) {
		this. = numeroHabilitacao;
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
