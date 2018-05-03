package model.application;

import java.util.List;
import model.domain.Cliente;
import model.domain.Item;
import model.domain.Locacao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class AplCadastrarLocacao {

    //OK
    public int incluirLocacao(String dtLocacao, String dtDevolucaoPrevista, String dtDevolucaoEfetiva,
			int valorCobrado, int multaCobrada, Item item, Cliente cliente) {

        Locacao locacao = new Locacao(dtLocacao, dtDevolucaoPrevista, dtDevolucaoEfetiva,
                valorCobrado, multaCobrada, item, cliente);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(locacao);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;

    }
    
    public List listar() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Locacao.class);

        cons.add(Restrictions.like("nome", "%"));
        
        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }

}
