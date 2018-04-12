package model.application;

import java.util.Date;
import model.domain.Titulo;
import org.hibernate.Session;

public class AplCadastrarTitulo {
   
    public int incluirTitulo(String nome, String ano, String sinopse, String categoria){
           
        Titulo titulo = new Titulo(nome, ano, sinopse, categoria);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(titulo);

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
