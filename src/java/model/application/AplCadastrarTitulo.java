package model.application;

import java.util.ArrayList;
import java.util.List;
import model.domain.Ator;
import model.domain.Classe;
import model.domain.Diretor;
import model.domain.Titulo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class AplCadastrarTitulo {

    public int incluirTitulo(String nome, String[] idAtores, Diretor diretor, String ano, String sinopse, String categoria, Classe classe) {

        List atores = combinarAtores(idAtores);
        
        Titulo titulo = new Titulo(nome, atores, diretor, ano, sinopse, categoria, classe);

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        sessao.save(titulo);

        sessao.getTransaction().commit();
        sessao.close();

        return 0;

    }

    public List listar() {

        List lista;
        Session sessao;

        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria cons = sessao.createCriteria(Titulo.class);

        cons.add(Restrictions.like("nome", "%"));

        lista = cons.list();

        sessao.getTransaction().commit();
        sessao.close();

        return lista;
    }

    public Titulo get(String id) {

        Session sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Titulo obj = (Titulo) sessao.get(Titulo.class, Integer.valueOf(id));

        sessao.getTransaction().commit();
        sessao.close();

        return obj;
    }

    private List combinarAtores(String[] idAtores) {
        List atores = new ArrayList();
        Ator ator;

        for (String idAtore : idAtores) {
            ator = new Ator();
            ator.setId(Integer.valueOf(idAtore));
            atores.add(ator);

        }

        return atores;
    }
    
    public int excluirTitulo(int id) {
        
        Titulo titulo = new Titulo();
        titulo.setId(id);
        
        Session sessao;
        
        sessao = conexao.NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.delete(titulo);
        
        sessao.getTransaction().commit();
        sessao.close();
        
        return 0;
        
    }

}
