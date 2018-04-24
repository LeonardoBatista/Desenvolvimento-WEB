package model.application;

import java.util.List;
import model.domain.Ator;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AplCadastrarAtor {

    public int incluirAtor(String nome) {

        Ator ator = new Ator(nome);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(ator);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;
    }

    public List listarID(String id[]) {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Ator.class);
        for (String id1 : id) {
            cons.add(Restrictions.eq("id", Integer.valueOf(id1)));
        }

        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();
        
        System.out.println("saida do banco");
        System.out.println(lista.isEmpty());

        return lista;
    }

    public List listarTodos() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Ator.class);

        cons.add(Restrictions.like("nome", "%"));

        cons.addOrder(Order.asc("nome"));

        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }

}
