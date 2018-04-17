package model.application;

import java.util.Date;
import model.domain.Dependente;
import org.hibernate.Session;

public class AplCadastrarDependente {
   
    public int incluirDependente(String nome, Date dtNascimento, char sexo, boolean estaAtivo){
        
        Dependente dependente = new Dependente(nome, dtNascimento, sexo, estaAtivo);
        
        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(dependente);

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
