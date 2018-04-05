package model.domain;

import java.util.Date;

public class Cliente {

    private int id;

    private int numInscricao;

    private String nome;

    private Date dtNascimento;

    private char sexo;

    private boolean estaAtivo;

    //com id
    public Cliente(int id, int numInscricao, String nome, Date dtNascimento, char sexo, boolean estaAtivo) {
        this.id = id;
        this.numInscricao = numInscricao;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estaAtivo = estaAtivo;
    }

    //sem id
    public Cliente(String nome, Date dtNascimento, char sexo, boolean estaAtivo) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estaAtivo = estaAtivo;
    }

    //construtor vazio
    public Cliente() {
    }

    public int getNumInscricao() {
        return numInscricao;
    }

    public void setNumInscricao(int numInscricao) {
        this.numInscricao = numInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
