package org.example;

public interface Visitor {
    String interagirComPaciente(Paciente paciente);
    String interagirComMedico(Medico medico);
    String interagirComVisitante(Visitante visitante);
}