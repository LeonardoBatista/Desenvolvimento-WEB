package model.domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;


public class Socio extends Cliente {

    private String cpf;

    private String endereco;

    private String telefone;

    private List<Dependente> dependente;

    //com id
    public Socio(String cpf, String endereco, String telefone, List<Dependente> dependente, int id, int numInscricao, String nome, Date dtNascimento, char sexo, boolean estaAtivo) {
        super(id, nome, dtNascimento, sexo, estaAtivo);
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dependente = dependente;
    }

    //sem id
    public Socio(String cpf, String endereco, String telefone, List<Dependente> dependente, String nome, Date dtNascimento, char sexo, boolean estaAtivo) {
        super(nome, dtNascimento, sexo, estaAtivo);
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dependente = dependente;
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

    public Collection<Dependente> getDependente() {
        return dependente;
    }

    public void setDependente(List<Dependente> dependente) {
        this.dependente = dependente;
    }

}
