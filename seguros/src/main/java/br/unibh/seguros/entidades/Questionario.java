package br.unibh.seguros.entidades;

public class Questionario {
	
	private Long id;
	private Boolean seguradoEPrincipalCondutor;
	private String nomeCondutorPrincipal;
	private Boolean resideComPessoa17A25Anos;
	private Boolean possuiGaragemResidencia;
	private Boolean possuiGaragemTrabalho;
	private Boolean possuiGaragemEstudo;
	private Boolean residenciaPropria;
	private Long quilometragemAtual;
	private Boolean utilizaVeiculoAtividadesProfissionais;
	private Boolean acidenteOuRouboUltimos2Anos;
	private Boolean possuiDispositivoAntiFurto;
	private Long version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getSeguradoEPrincipalCondutor() {
		return seguradoEPrincipalCondutor;
	}
	public void setSeguradoEPrincipalCondutor(Boolean seguradoEPrincipalCondutor) {
		this.seguradoEPrincipalCondutor = seguradoEPrincipalCondutor;
	}
	public String getNomeCondutorPrincipal() {
		return nomeCondutorPrincipal;
	}
	public void setNomeCondutorPrincipal(String nomeCondutorPrincipal) {
		this.nomeCondutorPrincipal = nomeCondutorPrincipal;
	}
	public Boolean getPossuiGaragemResidencia() {
		return possuiGaragemResidencia;
	}
	public void setPossuiGaragemResidencia(Boolean possuiGaragemResidencia) {
		this.possuiGaragemResidencia = possuiGaragemResidencia;
	}
	public Boolean getResideComPessoa17A25Anos() {
		return resideComPessoa17A25Anos;
	}
	public void setResideComPessoa17A25Anos(Boolean resideComPessoa17A25Anos) {
		this.resideComPessoa17A25Anos = resideComPessoa17A25Anos;
	}
	public Boolean getPossuiGaragemTrabalho() {
		return possuiGaragemTrabalho;
	}
	public void setPossuiGaragemTrabalho(Boolean possuiGaragemTrabalho) {
		this.possuiGaragemTrabalho = possuiGaragemTrabalho;
	}
	public Boolean getPossuiGaragemEstudo() {
		return possuiGaragemEstudo;
	}
	public void setPossuiGaragemEstudo(Boolean possuiGaragemEstudo) {
		this.possuiGaragemEstudo = possuiGaragemEstudo;
	}
	public Boolean getResidenciaPropria() {
		return residenciaPropria;
	}
	public void setResidenciaPropria(Boolean residenciaPropria) {
		this.residenciaPropria = residenciaPropria;
	}
	public Boolean getPossuiDispositivoAntiFurto() {
		return possuiDispositivoAntiFurto;
	}
	public void setPossuiDispositivoAntiFurto(Boolean possuiDispositivoAntiFurto) {
		this.possuiDispositivoAntiFurto = possuiDispositivoAntiFurto;
	}
	public Boolean getUtilizaVeiculoAtividadesProfissionais() {
		return utilizaVeiculoAtividadesProfissionais;
	}
	public void setUtilizaVeiculoAtividadesProfissionais(Boolean utilizaVeiculoAtividadesProfissionais) {
		this.utilizaVeiculoAtividadesProfissionais = utilizaVeiculoAtividadesProfissionais;
	}
	public Long getQuilometragemAtual() {
		return quilometragemAtual;
	}
	public void setQuilometragemAtual(Long quilometragemAtual) {
		this.quilometragemAtual = quilometragemAtual;
	}
	public Boolean getAcidenteOuRouboUltimos2Anos() {
		return acidenteOuRouboUltimos2Anos;
	}
	public void setAcidenteOuRouboUltimos2Anos(Boolean acidenteOuRouboUltimos2Anos) {
		this.acidenteOuRouboUltimos2Anos = acidenteOuRouboUltimos2Anos;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}

}
