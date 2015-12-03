package it.redhat.sia.labs.model.dto;

import java.io.Serializable;

public class UtenteDTO implements Serializable{

    private final Integer id;
    private final String nome;
    private final String cognome;
    private final String sesso;

    public UtenteDTO(String nome, String cognome, String sesso) {
        this.id = null;
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
    }

    public UtenteDTO(int id, String nome, String cognome, String sesso) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSesso() {
        return sesso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UtenteDTO{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", cognome='").append(cognome).append('\'');
        sb.append(", sesso='").append(sesso).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
