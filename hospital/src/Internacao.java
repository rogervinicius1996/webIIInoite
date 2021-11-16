import java.time.LocalDate;

public class Internacao {
    public Medico medicoResponsavel;
    public Paciente paciente;
    public LocalDate dataDaInternacao;
    public LocalDate dataDaAlta;
    public String observacoes;

    public Internacao() {
        this.dataDaInternacao = LocalDate.now();
        this.observacoes = "Sem observações";
    }

    public Internacao(Medico responsavel, Paciente paciente) {
        this.medicoResponsavel = responsavel;
        this.paciente = paciente;
        this.dataDaInternacao = LocalDate.now();
    }

    public Internacao(Medico responsavel, Paciente paciente, String observacao) {
        this.medicoResponsavel = responsavel;
        this.paciente = paciente;
        this.observacoes = observacao;
        this.dataDaInternacao = LocalDate.now();
    }

    public Internacao(Medico responsavel, Paciente paciente, String observacao, LocalDate data) {
        this.medicoResponsavel = responsavel;
        this.paciente = paciente;
        this.observacoes = observacao;
        this.dataDaInternacao = data;
    }

    public Medico getMedicoResponsavel() {
        return this.medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public LocalDate getDataDaInternacao() {
        return this.dataDaInternacao;
    }

    public LocalDate getDataDaAlta() {
        return this.dataDaAlta;
    }

    public void setDataDaAlta(LocalDate dataDaAlta) {
        this.dataDaAlta = dataDaAlta;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}
