package br.unibh.seguros.entidades;

import java.io.File;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@table(name="tb_tramitacao")

public class Tramitacao {
	
	@ID
	@GeneratdValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	@OneToOne
	private Proposta proposta;
	
	@Column (name="etapa_processo", nullable=false)
	private EtapaProcesso EtapaProcesso;
	
	@Column (name="data_hora", nullable=false)
	@Temporal (TemporalType.TIMESTAMP)
	private Date dataHora;
	
	@Column (name="tipo_decisao", nullable=false)
	private TipoDecisao tipoDecisao;
	
	@OneToOne
	private Funcionario usuarioDecisao;
	
	@Column (length = 4000, nullable=false)
	private String comentario;
	
	@Column (columnDefinition="BLOB", nullable=false)
	private File documento;
	@Version
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
