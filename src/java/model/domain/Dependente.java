package model.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name="numInscricao")
public class Dependente extends Cliente {

    @ManyToOne
    private Socio socio;
    
    //com id
    public Dependente(int numInscricao, String nome, String dtNascimento, String sexo, String estaAtivo, Socio socio) {
        super(numInscricao, nome, dtNascimento, sexo, estaAtivo);
 	this.socio = socio;
    }

    //sem id
    public Dependente(String nome, String dtNascimento, String sexo, String estaAtivo, Socio socio) {
        super(nome, dtNascimento, sexo, estaAtivo);
        this.socio = socio;
    }

    //construtor vazio
    public Dependente() {
    }
    
    
    public Socio getSocio() {
            return socio;
    }

    public void setSocio(Socio socio) {
            this.socio = socio;
    }


}
