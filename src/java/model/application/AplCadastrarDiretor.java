package model.application;

import model.domain.Diretor;
import org.hibernate.Session;

public class AplCadastrarDiretor {
   
    public int incluirDiretor(String nome) {

        Diretor diretor = new Diretor(nome);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(diretor);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;
    } 
     
}
