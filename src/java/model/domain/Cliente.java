package model.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "cliente")
@Inheritance(strategy=InheritanceType.JOINED)
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numIncricao;

    private String nome;

    private String dtNascimento;

    private String sexo;

    private String estaAtivo;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @Cascade(CascadeType.SAVE_UPDATE)

    private Collection<Locacao> locacoes;
    
   
    //com id
    public Cliente(int numIncricao, String nome, String dtNascimento, String sexo, String estaAtivo, Collection <Locacao> locacoes) {
        this.numIncricao = numIncricao;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estaAtivo = estaAtivo;
        this.locacoes = locacoes;
        
    }

    //sem id
    public Cliente(String nome, String dtNascimento, String sexo, String estaAtivo, Collection <Locacao> locacoes) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estaAtivo = estaAtivo;
        this.locacoes = locacoes;
    }

    //construtor vazio
    public Cliente() {
    }

    public int getNumIncricao() {
        return numIncricao;
    }

    public void setNumIncricao(int numIncricao) {
        this.numIncricao = numIncricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(String estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public Collection<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(Collection<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
   
}
