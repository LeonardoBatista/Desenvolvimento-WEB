package model.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTONUMERAÇÃO    
    private int id;
    
    @Column(length=45) 
    private String nome;

    //com id    
    public Ator(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //sem id
    public Ator(String nome) {
        this.nome = nome;
    }

    //construtor vazio
    public Ator() {
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
