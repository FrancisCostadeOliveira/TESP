package br.unibh.seguros.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@table(name="tb_desconto")

public class Desconto {

	@Column (columnDefinition="CHAR(1)", nullable=false)
	@NotNull
	@Pattern(regexp = ".+@.+\\.[a-z]+", message = "")
	private Date  classe;
	
	@Column (name="data_inicio", nullable=false)
	@Temporal (TemporalType.DATE)
	@NotNull
	private Date  dataInicio;
	
	@Column (name="data_inicio", nullable=false)
	@Temporal (TemporalType.DATE)
	@Future 
	private Date  dataFim;
	
	@Column (name="percentual_desconto", columnDefinition="decimal(14,2)", nullable=false)
	@NotNull
	@Min(0.00)
	@Max((int) 100.00)
	private bigDecimal percentualDesconto;
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public bigDecimal getPercentualDesconto() {
		return percentualDesconto;
	}
	public void setPercentualDesconto(bigDecimal percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	public Date getClasse() {
		return classe;
	}
	public void setClasse(Date classe) {
		this.classe = classe;
	}
	
}
