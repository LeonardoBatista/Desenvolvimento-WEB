package model.application;

import java.util.Collection;
import java.util.Date;
import model.domain.Dependente;
import model.domain.Socio;

public class AplCadastrarSocio {
   
    public int incluirSocio(String cpf, String endereco, String telefone, Collection<Dependente> dependente, int id, int numInscricao, String nome, Date dtNascimento, char sexo, boolean estaAtivo){
        
        Socio socio = new Socio();   
        socio.setCpf(cpf);
        socio.setEndereco(endereco);
        socio.setTelefone(telefone);
        socio.setDependente(dependente);      
        socio.setId(id);
        socio.setNumInscricao(numInscricao);
        socio.setNome(nome);
        socio.setDtNascimento(dtNascimento);
        socio.setSexo(sexo);
        socio.setEstaAtivo(estaAtivo);
 


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
