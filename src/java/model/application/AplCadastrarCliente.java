package model.application;

import java.util.Date;
import model.domain.Cliente;
import org.hibernate.Session;

public class AplCadastrarCliente {
   
    public int incluirCliente(int numInscricao, String nome, Date dtNascimento, char sexo, boolean estaAtivo){
        
        Cliente cliente = new Cliente(nome, dtNascimento, sexo, estaAtivo);
        
        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(cliente);

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
