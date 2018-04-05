package model.application;

import model.domain.Ator;

public class AplCadastrarAtor {
   
    public int incluirAtor(String nome){


        Ator ator = new Ator();
        ator.setNome(nome);

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
