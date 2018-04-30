package model.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@Entity
@Table(name = "locacao")
public class Locacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLocacao;
    private String dtLocacao;
    private String dtDevolucaoPrevista;
    private String dtDevolucaoEfetiva;
    private int valorCobrado;
    private int multaCobrada;

    @ManyToOne
    //@JoinColumn(name="idCliente")
    private Cliente cliente;

    @ManyToOne
    //@JoinColumn(name="idItem")
    private Item item;

    //com id
	public Locacao(int idLocacao, String dtLocacao, String dtDevolucaoPrevista, String dtDevolucaoEfetiva,
			int valorCobrado, int multaCobrada, Item item, Cliente cliente) {
	
		this.dtLocacao = dtLocacao;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
		this.valorCobrado = valorCobrado;
		this.multaCobrada = multaCobrada;
		this.item = item;
                this.cliente = cliente;
	}

    //sem id
	public Locacao(String dtLocacao, String dtDevolucaoPrevista, String dtDevolucaoEfetiva,
			int valorCobrado, int multaCobrada, Item item, Cliente cliente) {
	
		this.dtLocacao = dtLocacao;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
		this.valorCobrado = valorCobrado;
		this.multaCobrada = multaCobrada;
		this.item = item;
                this.cliente = cliente;
	}

    //construtor vazio
    public Locacao() {
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    @XmlElement
    public String getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(String dtLocacao) {
        this.dtLocacao = dtLocacao;
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

    public int getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(int valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public int getMultaCobrada() {
        return multaCobrada;
    }

    public void setMultaCobrada(int multaCobrada) {
        this.multaCobrada = multaCobrada;
    }

    @XmlElement
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String toString(){
        return Integer.toString(this.idLocacao);
    }

}
