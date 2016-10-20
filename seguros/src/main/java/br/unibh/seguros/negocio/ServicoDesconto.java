package br.unibh.seguros.negocio;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.unibh.seguros.entidades.Desconto;
import negocio.DAO;

@Stateless
@LocalBean
public class ServicoDesconto implements DAO<Desconto, Long> {

	@Inject
	EntityManager em;
	@Inject
	private Logger log;

	public Desconto insert(Desconto t) throws Exception {
		log.info("Persistindo " + t);
		em.persist(t);
		return t;
	}

	public Desconto update(Desconto t) throws Exception {
		log.info("Atualizando " + t);
		return em.merge(t);
	}

	public void delete(Desconto t) throws Exception {
		log.info("Removendo " + t);
		Object c = em.merge(t);
		em.remove(c);
	}

	public Desconto find(Long k) throws Exception {
		log.info("Encontrando pela chave " + k);
		return em.find(Desconto.class, k);
	}

	@SuppressWarnings("unchecked")
	public List<Desconto> findAll() throws Exception {
		log.info("Encontrando todos os objetos");
		return em.createQuery("from Desconto").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Desconto> findByName(String classe) throws Exception {
		log.info("Encontrando o " + classe);
		return em.createNamedQuery("Desconto.findByClasse").setParameter("classe", classe + "%").getResultList();
	}
}