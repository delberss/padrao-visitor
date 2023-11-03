package org.example;

public class AcaoVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }
    @Override
    public String interagirComPaciente(Paciente paciente) {
        return "Realizando check-up no paciente " + paciente.getNome() + " que tem " + paciente.getDoenca() + ".";
    }

    @Override
    public String interagirComMedico(Medico medico) {
        return "O médico " + medico.getNome() + ", especialista em " + medico.getEspecialidade() + ", está realizando consultas.";
    }

    @Override
    public String interagirComVisitante(Visitante visitante) {
        return "O visitante " + visitante.getNome() + ", que é " + visitante.getRelacaoComPaciente() + " do paciente, está no quarto de visitas.";
    }
}