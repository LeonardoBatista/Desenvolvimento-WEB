package model.application;

import java.util.List;
import model.domain.Ator;
import model.domain.Classe;
import model.domain.Diretor;
import model.domain.Titulo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AplCadastrarTitulo {

    public int incluirTitulo(String nome, List ator, Diretor diretor, String ano, String sinopse, String categoria, Classe classe) {
        
        Titulo titulo = new Titulo(nome, ator, diretor, ano, sinopse, categoria, classe);
        
        System.out.println("asldboasbdjobasodboajsbdoasbdoibasoidbasiobdoiasbdiobas");
        System.out.println(titulo.getAtor().isEmpty());
        
        for (Ator ator1 : titulo.getAtor()) {
            
            System.out.println(ator1.getId());
            System.out.println(ator1.getNome());
        }
        
        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(titulo);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;

    }

    public List listar() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Titulo.class);

        cons.add(Restrictions.like("nome", "%"));
        
        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }

}
