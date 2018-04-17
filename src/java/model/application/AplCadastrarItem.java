package model.application;

import java.util.Date;
import model.domain.Item;
import org.hibernate.Session;

public class AplCadastrarItem {

    public int incluirItem(String numSerie, Date dtAquisicao, String tipoItem) {

        Item item = new Item(numSerie, dtAquisicao, tipoItem);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(item);

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
