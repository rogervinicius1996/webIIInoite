class App {
    public static void main(String[] args) {
        // tipo nome = valor;
        // String nome = 15;
        // Erro em tempo de compilação
        // System.out.println(nome);

        // Erro em tempo de execução
        String preco = "Anderson";

        try {
            float precoConvertido = Float.parseFloat(preco);
            System.out.println(precoConvertido);
        } catch (Exception exception) {
            System.out.println("Não foi possível converter o valor informado!!!");
        }
        System.out.print("Tudo certinho!!!");
    }
}