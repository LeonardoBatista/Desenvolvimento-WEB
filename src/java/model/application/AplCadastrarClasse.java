package model.application;

import model.domain.Classe;

public class AplCadastrarClasse {
   
    public int incluirClasse(String nome, float valor, String prazoDevolucao){

        Classe classe = new Classe();
        classe.setNome(nome);
        classe.setValor(valor);
        classe.setPrazoDevolucao(prazoDevolucao);

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
