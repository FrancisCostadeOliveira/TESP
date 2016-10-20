package br.unibh.seguros.negocio;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.unibh.seguros.entidades.Tramitacao;
import negocio.DAO;

@Stateless
@LocalBean
public class ServicoTramitacao implements DAO<Tramitacao, Long> {

	@Inject
	EntityManager em;
	@Inject
	private Logger log;

	public Tramitacao insert(Tramitacao t) throws Exception {
		log.info("Persistindo " + t);
		em.persist(t);
		return t;
	}

	public Tramitacao update(Tramitacao t) throws Exception {
		log.info("Atualizando " + t);
		return em.merge(t);
	}

	public void delete(Tramitacao t) throws Exception {
		log.info("Removendo " + t);
		Object c = em.merge(t);
		em.remove(c);
	}

	public Tramitacao find(Long k) throws Exception {
		log.info("Encontrando pela chave " + k);
		return em.find(Tramitacao.class, k);
	}

	@SuppressWarnings("unchecked")
	public List<Tramitacao> findAll() throws Exception {
		log.info("Encontrando todos os objetos");
		return em.createQuery("from Tramitacao").getResultList();
	}

	public List<Tramitacao> findByName(String name) throws Exception {
		return null;
	}
}