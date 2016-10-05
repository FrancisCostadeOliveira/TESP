package br.unibh.seguros.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="tb_veiculo")

public class Veiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column (length = 50, nullable=false)
	private String marca;
	
	@Column (length = 150, nullable=false)
	private String descricao;
	
	@Column (name="ano_fabricacao", nullable=false)
	private int anoFabricacao;
	
	@Column (name="ano_modelo", nullable=false)
	private int anoModelo;
	
	@Column (columnDefinition="CHAR(8)", nullable=false)
	private String placa;
	
	@Column (length = 50, nullable=false)
	private String chassi;
	
	@Column (name="tipo_combustivel", nullable=false)
	private TipoCombustivel tipoCombustivel;
	
	@Column (name="zero_km", nullable=false)
	private Boolean zeroKm;
	
	@Column (name="veiculo_alienado", nullable=false)
	private Boolean veiculoAlienado;
	
	@Version 
	private Long version;
	
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Boolean getVeiculoAlienado() {
		return veiculoAlienado;
	}
	public void setVeiculoAlienado(Boolean veiculoAlienado) {
		this.veiculoAlienado = veiculoAlienado;
	}
	public Boolean getZeroKm() {
		return zeroKm;
	}
	public void setZeroKm(Boolean zeroKm) {
		this.zeroKm = zeroKm;
	}
	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
