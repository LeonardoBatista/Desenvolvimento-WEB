package model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
@Inheritance(strategy=InheritanceType.JOINED)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numIncricao;

    private String nome;

    private String dtNascimento;

    private String sexo;

    private String estaAtivo;

    //com id
    public Cliente(int numIncricao, String nome, String dtNascimento, String sexo, String estaAtivo) {
        this.numIncricao = numIncricao;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estaAtivo = estaAtivo;
    }

    //sem id
    public Cliente(String nome, String dtNascimento, String sexo, String estaAtivo) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estaAtivo = estaAtivo;
    }

    //construtor vazio
    public Cliente() {
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

    public int getNumIncricao() {
        return numIncricao;
    }

    public void setNumIncricao(int numIncricao) {
        this.numIncricao = numIncricao;
    }


}
