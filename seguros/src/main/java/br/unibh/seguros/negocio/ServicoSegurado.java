package br.unibh.seguros.negocio;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.unibh.seguros.entidades.Segurado;
import negocio.DAO;

@Stateless
@LocalBean

public class ServicoSegurado implements DAO<Segurado, Long> {
	@Inject
	EntityManager em;
	@Inject
	private Logger log;

	public Segurado insert(Segurado t) throws Exception {
		log.info("Persistindo " + t);
		em.persist(t);
		return t;
	}

	public Segurado update(Segurado t) throws Exception {
		log.info("Atualizando " + t);
		return em.merge(t);
	}

	public void delete(Segurado t) throws Exception {
		log.info("Removendo " + t);
		Object c = em.merge(t);
		em.remove(c);
	}

	public Segurado find(Long k) throws Exception {
		log.info("Encontrando pela chave " + k);
		return em.find(Segurado.class, k);
	}

	@SuppressWarnings("unchecked")
	public List<Segurado> findAll() throws Exception {
		log.info("Encontrando todos os objetos");
		return em.createQuery("from Segurado").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Segurado> findByName(String name) throws Exception {
		log.info("Encontrando o " + name);
		return em.createNamedQuery("Segurado.findByName").setParameter("nome", name + "%").getResultList();
	}
}