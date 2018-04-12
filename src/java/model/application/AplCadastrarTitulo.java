package model.application;

import model.domain.Ator;
import model.domain.Classe;
import model.domain.Diretor;
import model.domain.Titulo;
import org.hibernate.Session;

public class AplCadastrarTitulo {
   
    public int incluirTitulo(String nome, Ator ator, Diretor diretor, String ano, String sinopse, String categoria, Classe classe){
           
        Titulo titulo = new Titulo(nome, ator, diretor, ano, sinopse, categoria, classe);

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
