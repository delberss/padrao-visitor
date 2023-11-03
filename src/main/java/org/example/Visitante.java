package org.example;

public class Visitante implements Pessoa {

    private String nome;
    private String relacaoComPaciente;

    public Visitante(String nome, String relacaoComPaciente) {
        this.nome = nome;
        this.relacaoComPaciente = relacaoComPaciente;
    }

    public String getNome() {
        return nome;
    }

    public String getRelacaoComPaciente() {
        return relacaoComPaciente;
    }

    public String aceitar(VisitorHospital visitor) {
        return visitor.interagirComVisitante(this);
    }
}