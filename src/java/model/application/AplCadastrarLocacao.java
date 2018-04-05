package model.application;

import java.util.Date;
import model.domain.Item;
import model.domain.Locacao;

public class AplCadastrarLocacao {
   
    public int incluirLocacao(Date dtDevolucao, Date dtDevolucaoPrevista, Date dtDevolucaoEfetiva, float valorCobrado, float multaCobrado, Item item){
        
        Locacao locacao = new Locacao();   
        locacao.setDtDevolucao(dtDevolucao);
        locacao.setDtDevolucaoPrevista(dtDevolucaoPrevista);
        locacao.setDtDevolucaoEfetiva(dtDevolucaoEfetiva);
        locacao.setValorCobrado(valorCobrado);
        locacao.setMultaCobrado(multaCobrado);
        locacao.setItem(item);
 


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
