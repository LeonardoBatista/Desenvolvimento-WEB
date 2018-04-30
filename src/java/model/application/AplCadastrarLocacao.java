package model.application;

import model.domain.Cliente;
import model.domain.Item;
import model.domain.Locacao;
import org.hibernate.Session;

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

}
