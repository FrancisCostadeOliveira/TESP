package br.unibh.seguros.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="tb_proposta")

public class Proposta {
	
	@GeneratdValue(strategy=GenerationType.IDENTITY)
	@Id
	@PrimaryKeyJoinColumn 
	private Long id;
	
	@Column (nullable=false)
	@Temporal (TemporalType.TIMESTAMP)
	private Date data;
	
	@Column (columnDefinition="CHAR(1)", nullable=false)
	private String classe;
	
	@Column (name="codigo_susep", columnDefinition="CHAR(15)", nullable=false, unique=true)
	private String codigoSusep;
	
	@Column (name="valor_segurado", columnDefinition="decimal(14,2)", nullable=false)
	private BigDecimal valorSegurado;
	
	@Column (name="valor_franquia", columnDefinition="decimal(14,2)", nullable=false)
	private BigDecimal valorFranquia;
	
	@Column (name="data_inicio_vigencia", nullable=false)
	@Temporal (TemporalType.DATE)
	private Date dataInicioVigencia;
	
	@Column (name="data_terminio", nullable=false)
	@Temporal (TemporalType.DATE)
	private Date dataTerminoVigencia;
	
	@Column (name="carencia_em_meses", nullable=false)
	private int carenciaEmMeses;
	
	@Column (name="valor_premio", columnDefinition="decimal(14,2)", nullable=false)
	private BigDecimal valorPremio;
	
	@Column (name="dia_pagamento", nullable=false)
	private int diaPagamento;
	
	@Column (name="banco_pagamento", length = 50, nullable=false)
	private String bancoPagamento;
	
	@Column (length = 15, nullable=false)
	private String agencia;
	
	@Column (length = 15, nullable=false)
	private String conta;
	
	@OneToOne
	private Segurado segurado;
	
	@OneToOne
	private Veiculo veiculo;
	
	@OneToOne
	private Questionario questionario;
	
	@OneToOne
	private Set<Tramitacao> tramitacoes;
	@Version
	private Long version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public BigDecimal getValorSegurado() {
		return valorSegurado;
	}
	public void setValorSegurado(BigDecimal valorSegurado) {
		this.valorSegurado = valorSegurado;
	}
	public String getCodigoSusep() {
		return codigoSusep;
	}
	public void setCodigoSusep(String codigoSusep) {
		this.codigoSusep = codigoSusep;
	}
	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}
	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}
	public Date getDataTerminoVigencia() {
		return dataTerminoVigencia;
	}
	public void setDataTerminoVigencia(Date dataTerminoVigencia) {
		this.dataTerminoVigencia = dataTerminoVigencia;
	}
	public int getCarenciaEmMeses() {
		return carenciaEmMeses;
	}
	public void setCarenciaEmMeses(int carenciaEmMeses) {
		this.carenciaEmMeses = carenciaEmMeses;
	}
	public BigDecimal getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(BigDecimal valorPremio) {
		this.valorPremio = valorPremio;
	}
	public BigDecimal getValorFranquia() {
		return valorFranquia;
	}
	public void setValorFranquia(BigDecimal valorFranquia) {
		this.valorFranquia = valorFranquia;
	}
	public int getDiaPagamento() {
		return diaPagamento;
	}
	public void setDiaPagamento(int diaPagamento) {
		this.diaPagamento = diaPagamento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Segurado getSegurado() {
		return segurado;
	}
	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Questionario getQuestionario() {
		return questionario;
	}
	public void setQuestionario(Questionario questionario) {
		this.questionario = questionario;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Set<Tramitacao> getTramitacoes() {
		return tramitacoes;
	}
	public void setTramitacoes(Set<Tramitacao> tramitacoes) {
		this.tramitacoes = tramitacoes;
	}

}
