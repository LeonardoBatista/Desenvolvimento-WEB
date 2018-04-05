package model.application;

import java.util.Date;
import model.domain.Dependente;

public class AplCadastrarDependente {
   
    public int incluirDependente(int numInscricao, String nome, Date dtNascimento, char sexo, boolean estaAtivo){
        
        Dependente dependente = new Dependente();
        dependente.setNumInscricao(numInscricao);   
        dependente.setNome(nome);
        dependente.setDtNascimento(dtNascimento);
        dependente.setSexo(sexo);
        dependente.setEstaAtivo(estaAtivo);


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
