package br.unibh.seguros.entidades;

public class Veiculo {
	
	private Long id;
	private String marca;
	private String descricao;
	private int anoFabricacao;
	private int anoModelo;
	private String placa;
	private String chassi;
	private TipoCombustivel tipoCombustivel;
	private Boolean zeroKm;
	private Boolean veiculoAlienado;
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
