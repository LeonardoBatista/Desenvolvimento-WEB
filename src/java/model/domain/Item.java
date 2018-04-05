package model.domain;

import java.util.Date;

public class Item {

    private int id;

    private String numSerie;

    private Date dtAquisicao;

    private String tipoItem;

    //com id
    public Item(int id, String numSerie, Date dtAquisicao, String tipoItem) {
        this.id = id;
        this.numSerie = numSerie;
        this.dtAquisicao = dtAquisicao;
        this.tipoItem = tipoItem;
    }

    //sem id
    public Item(String numSerie, Date dtAquisicao, String tipoItem) {
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

    public Date getDtAquisicao() {
        return dtAquisicao;
    }

    public void setDtAquisicao(Date dtAquisicao) {
        this.dtAquisicao = dtAquisicao;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

}
