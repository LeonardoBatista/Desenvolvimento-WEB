package model.application;

import java.util.Date;
import java.util.List;
import model.domain.Item;
import model.domain.Titulo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AplCadastrarItem {

    public int incluirItem(String numSerie, String dtAquisicao, String tipoItem, Titulo titulo) {

        Item item = new Item(numSerie, dtAquisicao, tipoItem, titulo);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(item);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;

    }

    public List listar() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Item.class);

        cons.add(Restrictions.like("numSerie", "%"));

        cons.addOrder(Order.asc("numSerie"));

        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }

}
