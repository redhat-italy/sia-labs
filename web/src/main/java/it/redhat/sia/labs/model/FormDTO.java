package it.redhat.sia.labs.model;

import java.io.Serializable;

public class FormDTO implements Serializable{

    private final String nome;
    private final String cognome;

    public FormDTO(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FormDTO{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cognome='").append(cognome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
