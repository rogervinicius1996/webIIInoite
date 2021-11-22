package model;

public class Endereco {
    private int codigo;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(int codigo, String rua, String numero, String bairro, String cidade, String estado) {
        this.codigo = codigo;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(int codigo, String rua, String numero, String bairro, String cidade, String estado, String cep) {
        this.codigo = codigo;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters
    public String getEndereco() {
        return String.format("rua %s nº %s, %s - %s/%s", this.rua, this.numero, this.bairro, this.cidade, this.estado);
    }

    public String getCEP() {
        return this.cep;
    }

    public int getCodigo() {
        return codigo;
    }

    // Setters
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }
}
