package model.domain;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name="numInscricao")
public class Dependente extends Cliente {

    @ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name="socio_id", nullable = false)
    @JoinColumn(name="cpf", nullable = false)
    
    private Socio socio;
    
    //com id
    public Dependente(int numInscricao, String nome, String dtNascimento, String sexo, String estaAtivo, Socio socio, Collection <Locacao> locacoes) {
        super(numInscricao, nome, dtNascimento, sexo, estaAtivo, locacoes);
 	this.socio = socio;
    }

    //sem id
    public Dependente(String nome, String dtNascimento, String sexo, String estaAtivo, Socio socio, Collection <Locacao> locacoes) {
        super(nome, dtNascimento, sexo, estaAtivo, locacoes);
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
