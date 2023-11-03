package org.example;

public class Medico implements Pessoa {

    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String aceitar(VisitorHospital visitor) {
        return visitor.interagirComMedico(this);
    }
}
