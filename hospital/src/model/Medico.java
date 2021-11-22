package model;

import java.time.LocalDate;

public class Medico {
    // visibilidade tipo nome;
    public int codigo;
    public String CRM;
    public String nome;
    public LocalDate dataDeNascimento;
    public String telefoneDeContato;
    public Endereco endereco;

    public Medico(int codigo, String CRM, String nome, LocalDate dataDeNascimento, String telefoneDeContato, Endereco endereco) {
        this.codigo = codigo;
        this.CRM = CRM;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefoneDeContato = telefoneDeContato;
        this.endereco = endereco;
    }
    

    public int getCodigo() {
        return this.codigo;
    }
    
    public String getCRM() {
        return this.CRM;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public String getTelefoneDeContato() {
        return this.telefoneDeContato;
    }

    public void setTelefoneDeContato(String telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
