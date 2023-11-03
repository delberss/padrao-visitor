package org.example;

public class Paciente implements Pessoa {

    private String nome;
    private String doenca;

    public Paciente(String nome, String doenca) {
        this.nome = nome;
        this.doenca = doenca;
    }

    public String getNome() {
        return nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public String aceitar(VisitorHospital visitor) {
        return visitor.interagirComPaciente(this);
    }
}