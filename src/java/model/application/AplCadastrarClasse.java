package model.application;

import java.util.List;
import model.domain.Classe;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AplCadastrarClasse {

    public int incluirClasse(String nome, float valor, String prazoDevolucao) {

        Classe classe = new Classe(nome, valor, prazoDevolucao);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(classe);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;

    }

    public List listar() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Classe.class);

        cons.add(Restrictions.like("nome", "%"));

        cons.addOrder(Order.asc("nome"));

        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }

    public Classe get(String id) {

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Classe obj = (Classe) sessao.get(Classe.class, Integer.valueOf(id));

        sessao.getTransaction().commit();
        sessao.close();

        return obj;
    }
    
    public int excluirClasse(int id) {
        
        Classe ator = new Classe();
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
