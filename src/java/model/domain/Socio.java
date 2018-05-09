package model.domain;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
@PrimaryKeyJoinColumn(name="numInscricao")
public class Socio extends Cliente {

    private String cpf;

    private String endereco;

    private String telefone;


    //com id
    public Socio(int numInscricao, String nome, String dtNascimento, String sexo, String estahAtivo, String cpf, String endereco, String telefone, Collection <Locacao> locacoes) {
        super(nome, dtNascimento, sexo, estahAtivo, locacoes);
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //sem id
    public Socio(String nome, String dtNascimento, String sexo, String estahAtivo, String cpf, String endereco, String telefone, Collection <Locacao> locacoes) {
        super(nome, dtNascimento, sexo, estahAtivo, locacoes);
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //construtor vazio
    public Socio() {
    }

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
