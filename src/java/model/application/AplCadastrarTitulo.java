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

    public int incluirTitulo(String nome, Ator ator, Diretor diretor, String ano, String sinopse, String categoria, Classe classe) {

        Titulo titulo = new Titulo(nome, ator, diretor, ano, sinopse, categoria, classe);

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

        cons.addOrder(Order.asc("nome"));

        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }    
    
}
