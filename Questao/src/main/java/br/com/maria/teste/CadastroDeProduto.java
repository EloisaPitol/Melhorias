package br.com.maria.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.maria.Dao.ProdutoDao;
import br.com.maria.modelo.Produto;
import br.com.maria.util.JPAUtil;

public class CadastroDeProduto {
	
	public static void main(String[] args) {
		Produto celular = new Produto();
		celular.setNome("Motorola");
		celular.setDescricao("Ótimo celular");
		celular.setDesconto(new BigDecimal("100"));
		
		Produto geladeira = new Produto();
		geladeira.setNome("Electrolux");
		geladeira.setDescricao("Economica");
		geladeira.setDesconto(new BigDecimal("300"));
		
		Produto notebook = new Produto();
		notebook.setNome("Lenovo");
		notebook.setDescricao("Ótimo procesador");
		notebook.setDesconto(new BigDecimal("500"));
				
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);
				
		em.getTransaction().begin();
		dao.cadastar(celular);
		dao.cadastar(geladeira);
		dao.cadastar(notebook);
		em.getTransaction().commit();
		em.close();	
	}

}
