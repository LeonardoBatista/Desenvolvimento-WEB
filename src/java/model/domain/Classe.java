package model.domain;


import java.util.Date;

public class Classe {

    private int id;

    private String nome;

    private float valor;

    private Date prazoDevolucao;

    //com id
    public Classe(int id, String nome, float valor, Date prazoDevolucao) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.prazoDevolucao = prazoDevolucao;
    }

    //sem id
    public Classe(String nome, float valor, Date prazoDevolucao) {
        this.nome = nome;
        this.valor = valor;
        this.prazoDevolucao = prazoDevolucao;
    }

    //construtor vazio
    public Classe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setPrazoDevolucao(Date prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }

}
