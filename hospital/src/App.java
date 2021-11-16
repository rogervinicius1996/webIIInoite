import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        // Tipo nome = new Tipo();
        Medico paulo = new Medico();
        Medico joana = new Medico();

        paulo.CRM = "1234";
        paulo.nome = "Paulo Almeida Prado";
        paulo.dataDeNascimento = LocalDate.of(1967, Month.APRIL, 26);
        paulo.telefoneDeContato = "(051) 99999-9999";

        joana.CRM = "5678";
        joana.nome = "Joana Silva da Silva";
        joana.telefoneDeContato = "(051) 88888-8888";

        // Imprimir os nomes
        System.out.println(paulo.nome);
        System.out.println(joana.nome);

        Endereco endereco1 = new Endereco("Travessa não te interessa", "12-A", "Centro", "São Leopoldo", "RS","21456-900");

        Endereco endereco2 = new Endereco("Rua A", "245", "Floresta", "Porto Alegre", "RS");

        // System.out.println(endereco1.bairro);
        // System.out.println(endereco2.bairro);

        // System.out.println(endereco1.bairro.toUpperCase());
        // System.out.println(endereco2.bairro.toUpperCase());

        paulo.endereco = endereco1;
        joana.endereco = endereco2;

        // Onde moram os médicos?
        String enderecoDoPaulo = String.format("O médico %s mora na %s", paulo.nome, paulo.endereco.getEndereco());

        String enderecoDaJoana = String.format("A médica %s mora na %s", joana.nome, joana.endereco.getEndereco());

        System.out.println(enderecoDoPaulo);
        System.out.println(enderecoDaJoana);

        // Internações
        var internacaoJose = new Internacao(null, null);
        var internacaoMaria = new Internacao(null, null, "Obs");
        var internacaoInacio = new Internacao(null, null, "Obs", LocalDate.of(2021, 11, 03));

        var internacaoInvalida = new Internacao();
    }
}
