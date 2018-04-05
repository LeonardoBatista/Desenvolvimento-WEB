package model.application;

import java.util.Date;
import model.domain.Item;

public class AplCadastrarItem {
   
    public int incluirItem(String numSerie, Date dtAquisicao, String tipoItem){
        
        Item item = new Item();   
        item.setNumSerie(numSerie);
        item.setDtAquisicao(dtAquisicao);
        item.setTipoItem(tipoItem);
 


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
