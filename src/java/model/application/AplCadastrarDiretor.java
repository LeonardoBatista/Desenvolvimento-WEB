package model.application;

import model.domain.Diretor;

public class AplCadastrarDiretor {
   
    public int incluirDiretor(String nome){
        
        Diretor diretor = new Diretor();   
        diretor.setNome(nome);
 


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
