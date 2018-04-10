package model.application;

import model.domain.Ator;
import org.hibernate.Session;

public class AplCadastrarAtor {
   
    public int incluirAtor(String nome){


        Ator ator = new Ator(nome);       

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();
        
        sessao.save(ator);
        
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
