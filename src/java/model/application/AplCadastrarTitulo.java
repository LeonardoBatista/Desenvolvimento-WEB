package model.application;

import java.util.Date;
import model.domain.Titulo;

public class AplCadastrarTitulo {
   
    public int incluirTitulo(String nome, Date ano, String sinopse, String categoria){
        
        Titulo titulo = new Titulo();   
        titulo.setNome(nome);
        titulo.setAno(ano);
        titulo.setSinopse(sinopse);
        titulo.setCategoria(categoria);
 


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
