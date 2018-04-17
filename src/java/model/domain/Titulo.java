package model.domain;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



//@Entity
public class Titulo implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)  // AUTONUMERAÇÃO 
    private int id;

    private String nome;
    
//    @ManyToOne(fetch=FetchType.EAGER) 
//    @JoinColumn(name="id")
    private Ator ator;
    
//    @ManyToOne(fetch=FetchType.EAGER) 
//    @JoinColumn(name="id")
    private Diretor diretor;

    private String ano;

    private String sinopse;

    private String categoria;

//    @ManyToOne(fetch=FetchType.EAGER) 
//    @JoinColumn(name="id")
    private Classe classe;
          
    //com id 
    public Titulo(int id, String nome, Ator ator, Diretor diretor, String ano, String sinopse, String categoria, Classe classe) {
        this.id = id;
        this.nome = nome;
        this.ator = ator;
        this.diretor = diretor;
        this.ano = ano;
        this.sinopse = sinopse;
        this.categoria = categoria;
        this.classe = classe;
    }
    
    //sem id
    public Titulo(String nome, Ator ator, Diretor diretor, String ano, String sinopse, String categoria, Classe classe) {
        this.nome = nome;
        this.ator = ator;
        this.diretor = diretor;
        this.ano = ano;
        this.sinopse = sinopse;
        this.categoria = categoria;
        this.classe = classe;
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

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
}
