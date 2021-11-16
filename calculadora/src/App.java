public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        float primeiroNumero = 56.8f;
        float segundoNumero = 23.9f;
        float resultado;

        resultado = calculadora.somar(primeiroNumero, segundoNumero);
        System.out.println(resultado);
        resultado = calculadora.subtrair(primeiroNumero, segundoNumero);
        System.out.println(resultado);
    }
}
