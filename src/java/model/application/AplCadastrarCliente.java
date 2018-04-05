package model.application;

import java.util.Date;
import model.domain.Cliente;

public class AplCadastrarCliente {
   
    public int incluirCliente(int numInscricao, String nome, Date dtNascimento, char sexo, boolean estaAtivo){
        
        Cliente cliente = new Cliente();
        cliente.setNumInscricao(numInscricao);                
        cliente.setNome(nome);
        cliente.setDtNascimento(dtNascimento);
        cliente.setSexo(sexo);
        cliente.setEstaAtivo(estaAtivo);

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
