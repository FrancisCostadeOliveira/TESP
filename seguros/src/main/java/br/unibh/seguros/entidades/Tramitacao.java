package br.unibh.seguros.entidades;

import java.io.File;
import java.util.Date;

public class Tramitacao {
	
	private Long id;
	private Proposta proposta;
	private EtapaProcesso EtapaProcesso;
	private Date dataHora;
	private TipoDecisao tipoDecisao;
	private Funcionario usuarioDecisao;
	private String comentario;
	private File documento;
	private Long version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Proposta getProposta() {
		return proposta;
	}
	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public EtapaProcesso getEtapaProcesso() {
		return EtapaProcesso;
	}
	public void setEtapaProcesso(EtapaProcesso etapaProcesso) {
		EtapaProcesso = etapaProcesso;
	}
	public TipoDecisao getTipoDecisao() {
		return tipoDecisao;
	}
	public void setTipoDecisao(TipoDecisao tipoDecisao) {
		this.tipoDecisao = tipoDecisao;
	}
	public Funcionario getUsuarioDecisao() {
		return usuarioDecisao;
	}
	public void setUsuarioDecisao(Funcionario usuarioDecisao) {
		this.usuarioDecisao = usuarioDecisao;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public File getDocumento() {
		return documento;
	}
	public void setDocumento(File documento) {
		this.documento = documento;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}


}
