package model.application;

import java.util.Date;
import model.domain.Cliente;
import model.domain.Dependente;
import model.domain.Socio;
import org.hibernate.Session;

public class AplCadastrarCliente {
   
    public int incluirDependente(String nome, String dtNascimento, String sexo, String estaAtivo, Socio socio){
        
        Dependente dependente = new Dependente(nome, dtNascimento, sexo, estaAtivo, socio);
        
        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(dependente);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;
    } 
    
    public int incluirSocio(String nome, String dtNascimento, String sexo, String estahAtivo, String cpf, String endereco, String telefone){
        
        Socio socio = new Socio(nome, dtNascimento, sexo, estahAtivo, cpf, endereco, telefone);
        
        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(socio);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;
    } 
     
}
