package model.domain;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Ator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // AUTONUMERAÇÃO    
    private int id;

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
