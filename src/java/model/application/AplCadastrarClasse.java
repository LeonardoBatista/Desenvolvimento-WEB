package model.application;

import model.domain.Classe;
import org.hibernate.Session;

public class AplCadastrarClasse {
   
    public int incluirClasse(String nome, float valor, String prazoDevolucao){

        Classe classe = new Classe(nome, valor, prazoDevolucao);
        
        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(classe);

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
