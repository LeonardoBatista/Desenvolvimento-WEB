package model.application;

import java.util.List;
import model.domain.Diretor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AplCadastrarDiretor {

    public int incluirDiretor(String nome) {

        Diretor diretor = new Diretor(nome);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(diretor);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;
    }

    public List listar() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Diretor.class);

        cons.add(Restrictions.like("nome", "%"));

        cons.addOrder(Order.asc("nome"));

        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }

    public Diretor get(String id) {

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Diretor obj = (Diretor) sessao.get(Diretor.class, Integer.valueOf(id));

        sessao.getTransaction().commit();
        sessao.close();

        return obj;
    }
    
    public int excluirDiretor(int id) {
        
        Diretor ator = new Diretor();
        ator.setId(id);
        
        Session sessao;
        
        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.delete(ator);
        
        sessao.getTransaction().commit();
        sessao.close();
        
        return 0;
        
    }

}
