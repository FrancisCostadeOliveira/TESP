package br.unibh.seguros.negocio;

import java.awt.List;
import java.util.ArrayList;

import br.unibh.seguros.entidades.Funcionario;
import br.unibh.seguros.entidades.Setor;

public class ServicoFuncionario {

	@SuppressWarnings("unchecked")
	public List<Funcionario> findByCpfComSetor(String name) throws Exception {
		log.info("Encontrando o " + name);
		return em.createNamedQuery("Funcionario.findByCpfComSetor").setParameter("cpf", name + "%").getResultList();
	}

	}

	public ArrayList<String> getPermissoes(Setor setor) {

		ArrayList<String> lista = new ArrayList<String>();

		if (hierarquiaSetorPossui(setor, "Atendimento")) {

			lista.add("Gerente de Atendimento");
			lista.add("corretor");
		} else if (hierarquiaSetorPossui(setor, "Concessão")) {

			lista.add("Gerente de Concessão");
			lista.add("Analista de Concessão");
		} else if (hierarquiaSetorPossui(setor, "Financeiro")) {

			lista.add("Gerente Financeiro");
			lista.add("Analista financeiro");
		} else if (hierarquiaSetorPossui(setor, "Tecnologia da Informação")) {

			lista.add("Gerente de TI");
			lista.add("Administrador");
		} else if (hierarquiaSetorPossui(setor, "Diretoria")) {

			lista.add("Diretoria");
		}
		lista.add("Consulta");
		return lista;

	}

	private boolean hierarquiaSetorPossui(Setor setor, String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
