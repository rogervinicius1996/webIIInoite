public class Precificacao {
    // Atributos
    public float custoUnitario;
    public short quantidade;
    public float custoFixo;
    public float lucroLiquido;

    // Métodos
    public float calcularPrecoDeVenda() {
        float totalDaCompra = this.custoUnitario * this.quantidade;

        float faturamento = this.custoFixo + totalDaCompra + this.lucroLiquido;

        return faturamento / this.quantidade;
    }
}
