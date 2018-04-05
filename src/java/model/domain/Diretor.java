package model.domain;

public class Diretor {

    private int id;
    private String nome;

    //com id
    public Diretor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //sem id
    public Diretor(String nome) {
        this.nome = nome;
    }

    //vazio
    public Diretor() {
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

}
