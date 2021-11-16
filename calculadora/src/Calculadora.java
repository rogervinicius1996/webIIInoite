import java.lang.Math;

public class Calculadora {
    // Atributos

    public float somar(float n1, float n2) {
        return n1 + n2;
    }

    public float subtrair(float n1, float n2) {
        return n1 - n2;
    }

    public float multiplicar(float n1, float n2) {
        return n1 * n2;
    }

    public float dividir(float n1, float n2) {
        return n1 / n2;
    }

    public float potencia(float base, float expoente) {
        return (float) Math.pow(base, expoente);
    }

    public float raizQuadrada(float numero) {
        return (float) Math.sqrt(numero);
    }
}
