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
public class Locacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // AUTONUMERAÇÃO 
    private int id;

    @Temporal(TemporalType.DATE)
    private String dtDevolucao;

    @Temporal(TemporalType.DATE)
    private String dtDevolucaoPrevista;

    @Temporal(TemporalType.DATE)
    private String dtDevolucaoEfetiva;

    private float valorCobrado;

    private float multaCobrado;

    private Item item;

    private Cliente cliente;

    //com id
    public Locacao(int id, String dtDevolucao, String dtDevolucaoPrevista, String dtDevolucaoEfetiva,
            float valorCobrado, float multaCobrado, Item item, Cliente cliente) {
        this.id = id;
        this.dtDevolucao = dtDevolucao;
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
        this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
        this.valorCobrado = valorCobrado;
        this.multaCobrado = multaCobrado;
        this.item = item;
        this.cliente = cliente;
    }

    //sem id
    public Locacao(String dtDevolucao, String dtDevolucaoPrevista, String dtDevolucaoEfetiva,
            float valorCobrado, float multaCobrado, Item item, Cliente cliente) {
        this.dtDevolucao = dtDevolucao;
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
        this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
        this.valorCobrado = valorCobrado;
        this.multaCobrado = multaCobrado;
        this.item = item;
        this.cliente = cliente;
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

    public String getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(String dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public String getDtDevolucaoPrevista() {
        return dtDevolucaoPrevista;
    }

    public void setDtDevolucaoPrevista(String dtDevolucaoPrevista) {
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
    }

    public String getDtDevolucaoEfetiva() {
        return dtDevolucaoEfetiva;
    }

    public void setDtDevolucaoEfetiva(String dtDevolucaoEfetiva) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
