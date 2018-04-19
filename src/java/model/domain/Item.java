package model.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // AUTONUMERAÇÃO 
    private int id;

    private String numSerie;

    //@Temporal(TemporalType.DATE)
    private String dtAquisicao;

    private String tipoItem;

    //com id
    public Item(int id, String numSerie, String dtAquisicao, String tipoItem) {
        this.id = id;
        this.numSerie = numSerie;
        this.dtAquisicao = dtAquisicao;
        this.tipoItem = tipoItem;
    }

    //sem id
    public Item(String numSerie, String dtAquisicao, String tipoItem) {
        this.numSerie = numSerie;
        this.dtAquisicao = dtAquisicao;
        this.tipoItem = tipoItem;
    }

    //construtor vazio
    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getDtAquisicao() {
        return dtAquisicao;
    }

    public void setDtAquisicao(String dtAquisicao) {
        this.dtAquisicao = dtAquisicao;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

}
