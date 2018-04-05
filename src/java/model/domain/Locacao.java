package model.domain;

import java.util.Date;
import model.domain.Item;

public class Locacao {

    private int id;

    private Date dtDevolucao;

    private Date dtDevolucaoPrevista;

    private Date dtDevolucaoEfetiva;

    private float valorCobrado;

    private float multaCobrado;

    private Item item;

    //com id
    public Locacao(int id, Date dtDevolucao, Date dtDevolucaoPrevista, Date dtDevolucaoEfetiva, float valorCobrado, float multaCobrado, Item item) {
        this.id = id;
        this.dtDevolucao = dtDevolucao;
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
        this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
        this.valorCobrado = valorCobrado;
        this.multaCobrado = multaCobrado;
        this.item = item;
    }

    //sem id
    public Locacao(Date dtDevolucao, Date dtDevolucaoPrevista, Date dtDevolucaoEfetiva, float valorCobrado, float multaCobrado, Item item) {
        this.dtDevolucao = dtDevolucao;
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
        this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
        this.valorCobrado = valorCobrado;
        this.multaCobrado = multaCobrado;
        this.item = item;
    }

    //construtor vazio
    public Locacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public Date getDtDevolucaoPrevista() {
        return dtDevolucaoPrevista;
    }

    public void setDtDevolucaoPrevista(Date dtDevolucaoPrevista) {
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
    }

    public Date getDtDevolucaoEfetiva() {
        return dtDevolucaoEfetiva;
    }

    public void setDtDevolucaoEfetiva(Date dtDevolucaoEfetiva) {
        this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
    }

    public float getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(float valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public float getMultaCobrado() {
        return multaCobrado;
    }

    public void setMultaCobrado(float multaCobrado) {
        this.multaCobrado = multaCobrado;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
