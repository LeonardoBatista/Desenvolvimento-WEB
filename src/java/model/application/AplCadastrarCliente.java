package model.application;

import java.util.Date;
import java.util.List;
import model.domain.Cliente;
import model.domain.Dependente;
import model.domain.Socio;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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
     
    public List listarDependente() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Dependente.class);

        cons.add(Restrictions.like("nome", "%"));
        
        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }
     
    public List listarSocio() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Socio.class);

        cons.add(Restrictions.like("nome", "%"));
        
        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }
    
    public List listarCliente() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Cliente.class);

        cons.add(Restrictions.like("nome", "%"));
        
        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    } 
    
}
