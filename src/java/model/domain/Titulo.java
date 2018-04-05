package model.domain;


import java.util.Date;

public class Titulo {

    private int id;

    private String nome;

    private Date ano;

    private String sinopse;

    private String categoria;

    //com id 
    public Titulo(int id, String nome, Date ano, String sinopse, String categoria) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.sinopse = sinopse;
        this.categoria = categoria;
    }

    //sem id
    public Titulo(String nome, Date ano, String sinopse, String categoria) {
        this.nome = nome;
        this.ano = ano;
        this.sinopse = sinopse;
        this.categoria = categoria;
    }

    //construtor vazio
    public Titulo() {
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

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
