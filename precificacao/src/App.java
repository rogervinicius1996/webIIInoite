public class App {
    public static void main(String[] args) {
        Precificacao precificacao = new Precificacao();

        precificacao.custoFixo = 0.2f;
        precificacao.custoUnitario = 2;
        precificacao.quantidade = 10;
        precificacao.lucroLiquido = 0.4f;

        float precoDeVenda = precificacao.calcularPrecoDeVenda();

        System.out.println(String.format("O preço de venda é de R$ %.2f", precoDeVenda));
    }
}
