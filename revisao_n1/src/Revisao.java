import java.util.Scanner;
import java.time.LocalDate;

public class Revisao {
    public void atividade1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número, por favor:");
        int numero = teclado.nextInt();

        int resto = numero % 2;

        if (resto == 0) {
            System.out.printf("O número %d é par", numero);
        } else {
            System.out.printf("O número %d é ímpar", numero);
        }

        // Acabei de usar o teclado
        teclado.close();
    }

    public void atividade2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        float nota1 = teclado.nextFloat();

        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota 1 é inválida!!!");
            System.exit(0);
        }

        System.out.println("Digite a segunda nota do aluno:");
        float nota2 = teclado.nextFloat();

        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota 2 é inválida!!!");
            System.exit(0);
        }

        teclado.close();

        float media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("O aluno foi aprovado com o conceito A");
        } else if (media >= 9) {
            System.out.println("O aluno foi aprovado com o conceito B");
        } else if (media >= 6) {
            System.out.println("O aluno foi aprovado com o conceito C");
        } else if (media >= 3) {
            System.out.println("O aluno foi aprovado com o conceito D");
        } else {
            System.out.println("O aluno foi aprovado com o conceito E");
        }
    }

    public void atividade3() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento do cliente");
        short anoDeNascimento = teclado.nextShort();

        byte idade = (byte) (LocalDate.now().getYear() - anoDeNascimento);

        if (idade < 16) {
            System.out.println("Lamento, sua entrada não é permitida!!!");
            System.exit(0);
        }

        if (idade >= 18) {
            System.out.println("Bem-vindo ao nosso estabelecimento!!!");
        } else {
            System.out.println("Está acompanhado por um responsável? S - Sim ou N - Não");
            String resposta = teclado.next();

            boolean liberado = resposta.equalsIgnoreCase("S");

            if (liberado) {
                System.out.println("Bem-vindos ao nosso estabelecimento!!!");
            } else {
                System.out.println("Lamento, sua entrada não é permitida!!!");
            }
        }
        teclado.close();
    }

    public void atividade4() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        float salario = teclado.nextFloat();

        System.out.println("Digite o tempo de empresa do funcionário:");
        byte tempoDeEmpresa = teclado.nextByte();

        System.out.println("Digite o número de meses sem férias:");
        byte periodo = teclado.nextByte();

        teclado.close();

        if(tempoDeEmpresa >=10 && periodo >= 12){
            salario += salario * 0.1;
        }else if(tempoDeEmpresa >=7 && periodo >=12){
            salario += salario * 0.07;
        }else if(tempoDeEmpresa >= 3 && periodo >=6){
            salario += salario * 0.05;
        }

        System.out.printf("O novo salário do funcionário é R$ %.2f",salario);
    }
}