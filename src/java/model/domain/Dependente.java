package model.domain;

import java.util.Date;

public class Dependente extends Cliente {

    //com id
    public Dependente(int id, int numInscricao, String nome, Date dtNascimento, char sexo, boolean estaAtivo) {
        super(id, numInscricao, nome, dtNascimento, sexo, estaAtivo);
    }

    //sem id
    public Dependente(String nome, Date dtNascimento, char sexo, boolean estaAtivo) {
        super(nome, dtNascimento, sexo, estaAtivo);
    }

    //construtor vazio
    public Dependente() {
    }


}
