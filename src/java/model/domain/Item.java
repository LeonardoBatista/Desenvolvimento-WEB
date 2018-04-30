package model.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // AUTONUMERAÇÃO 
    private int id;

    private String numSerie;

    private String dtAquisicao;

    private String tipoItem;

    @ManyToOne(fetch = FetchType.EAGER)
    private Titulo titulo;    
    
    @Transient
    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Locacao> locacoes;
  
    
    //com id
    public Item(int id, String numSerie, String dtAquisicao, String tipoItem, Titulo titulo) {
        this.id = id;
        this.numSerie = numSerie;
        this.dtAquisicao = dtAquisicao;
        this.tipoItem = tipoItem;
        this.titulo = titulo;
        this.setLocacoes(new ArrayList());
    }

    //sem id
    public Item(String numSerie, String dtAquisicao, String tipoItem, Titulo titulo) {
        this.numSerie = numSerie;
        this.dtAquisicao = dtAquisicao;
        this.tipoItem = tipoItem;
        this.titulo = titulo;
        this.setLocacoes(new ArrayList());
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

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }
      

    public List<Locacao> getLocacoes() {
            return locacoes;
    }

    public void setLocacoes(ArrayList<Locacao> locacoes) {
            this.locacoes = locacoes;
    }
    
    @Override
    public String toString(){
        return this.numSerie;
    }
    
}
