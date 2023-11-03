package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaoVisitorTest {
    @Test
    void deveInteragirComPaciente() {
        Paciente paciente = new Paciente("João", "Gripe");

        AcaoVisitor visitor = new AcaoVisitor();
        assertEquals("Realizando check-up no paciente João que tem Gripe.", visitor.exibir(paciente));
    }

    @Test
    void deveInteragirComMedico() {
        Medico medico = new Medico("Dr. Carlos", "Cardiologia");

        AcaoVisitor visitor = new AcaoVisitor();
        assertEquals("O médico Dr. Carlos, especialista em Cardiologia, está realizando consultas.", visitor.exibir(medico));
    }

    @Test
    void deveInteragirComVisitante() {
        Visitante visitante = new Visitante("Maria", "irmã");

        AcaoVisitor visitor = new AcaoVisitor();
        assertEquals("O visitante Maria, que é irmã do paciente, está no quarto de visitas.", visitor.exibir(visitante));
    }
}