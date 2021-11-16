import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numero1 = 45;
        int numero2 = 89;
        int numero3 = 29;
        int numero4 = 76;

        // Maior
        boolean maior = numero4 > numero2;
        // Menor
        boolean menor = numero3 < numero1;
        // Igualdade
        boolean igual = numero1 == numero2;
        // Diferença
        boolean diferente = numero3 != numero1;
        // Maior ou igual
        boolean maiorOuIgual = numero2 >= numero1;
        // Menor ou igual
        boolean menorOuIgual = numero3 <= numero4;

        // System.out.printf("É maior: %b\n", maior);
        // System.out.printf("É menor: %b\n", menor);
        // System.out.printf("É maior ou igual: %b\n", maiorOuIgual);
        // System.out.printf("É menor ou igual: %b\n", menorOuIgual);
        // System.out.printf("É igual: %b\n", igual);
        // System.out.printf("É diferente: %b\n", diferente);

        /*
         * Fechamento das notas: Média final >= 6, logo aluno aprovado, caso contrário
         * está reprovado
         */
        float media = calcularMediaArtimetica(10, 10, 9);
        boolean aprovado = verificarAprovacao(media);
        boolean recuperacao = verificarRecuperacao(media);
        boolean aprovadoComMerito = verificarAprovacaoComMerito(media);

        // if (aprovado) {
        // System.out.println("Parabéns, você foi aprovado!!!");
        // } else {
        // System.out.println("Lamento, você foi reprovado!!!");
        // }

        // if (aprovado) {
        // System.out.println("Parabéns, você foi aprovado!!!");
        // } else if (recuperacao) {
        // System.out.println("Atenção, você está em recuperacação!!!");
        // } else {
        // System.out.println("Lamento, você foi reprovado!!!");
        // }

        // if (aprovadoComMerito) {
        // System.out.println("Maravilha, és um aluno destaque!!!");
        // } else if (aprovado) {
        // System.out.println("Parabéns, você foi aprovado!!!");
        // } else if (recuperacao) {
        // System.out.println("Atenção, você está em recuperacação!!!");
        // } else {
        // System.out.println("Lamento, você foi reprovado!!!!");
        // }

        // boolean nextLine = false;

        // if (!nextLine) { // true
        // System.out.println("Não existir novas linhas");
        // }

        // if (media >= 6 && media < 9) {
        // System.out.println("Aprovado");
        // } else if (media >= 9) {
        // System.out.println("Aprovado com mérito");
        // } else if (media >= 4) {
        // System.out.println("Recuperação");
        // } else {
        // System.out.println("Reprovado");
        // }

        // if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
        // System.out.println("O primeiro número é o maior");
        // } else {
        // System.out.println("O primeiro número NÃO é o maior");
        // }

        // Scanner teclado = new Scanner(System.in);
        // System.out.println("Digite o sexo da pessoa:");
        // System.out.println("M - Masculino / F - Feminino");
        // String sexo = teclado.next();

        // if (sexo.equalsIgnoreCase("M")) {
        // System.out.println("Bem-vindo ao sistema!!!");
        // } else if (sexo.equalsIgnoreCase("F")) {
        // System.out.println("Bem-vinda ao sistema!!!");
        // } else {
        // System.out.println("Opção inválida!!!");
        // }

        int maiorNumero = verificarMaiorNumero(numero1, numero2, numero3);
        int menorNumero = verificarMenorNumero(numero1, numero2, numero3);

        System.out.printf("O maior número é %d\n", maiorNumero);
        System.out.printf("O menor número é %d\n", menorNumero);
    }

    private static float calcularMediaArtimetica(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;
    }

    private static boolean verificarAprovacao(float media) {
        return media >= 6;
    }

    private static boolean verificarRecuperacao(float media) {
        return media >= 4;
    }

    private static boolean verificarAprovacaoComMerito(float media) {
        return media >= 9;
    }

    private static int verificarMaiorNumero(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3)
            return n1;
        else if (n2 > n1 && n2 > n3)
            return n2;
        else
            return n3;
    }

    private static int verificarMenorNumero(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3)
            return n1;
        else if (n2 < n1 && n2 < n3)
            return n2;
        else
            return n3;
    }
}
