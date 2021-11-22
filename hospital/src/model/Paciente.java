package model;

public class Paciente {
    public String nome;
    public String rg;
    public String cpf;
    public String telefone;
    public Endereco endereco;

    public String getNome() {
        return this.nome;
    }

    public String getRg() {
        return this.rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
