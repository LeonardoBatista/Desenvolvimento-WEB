package model.application;

import java.util.Date;
import model.domain.Item;
import model.domain.Locacao;
import org.hibernate.Session;

public class AplCadastrarLocacao {

    public int incluirLocacao(Date dtDevolucao, Date dtDevolucaoPrevista, Date dtDevolucaoEfetiva,
            float valorCobrado, float multaCobrado, Item item) {

        Locacao locacao = new Locacao(dtDevolucao, dtDevolucaoPrevista, dtDevolucaoEfetiva, valorCobrado, multaCobrado, item);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(locacao);

        sessao.getTransaction().commit();
        sessao.close();

        /*try{
            //Pega a sessão
            Transaction t = session.Begin...();
            session.save(a);
            t.commit();
            return 1;
        }catch(Exception e){
            t.RollBrek();
            return 2;
        }*/
        return 0;

    }

}
