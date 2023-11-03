package org.example;

public interface VisitorHospital {
    String interagirComPaciente(Paciente paciente);
    String interagirComMedico(Medico medico);
    String interagirComVisitante(Visitante visitante);
}