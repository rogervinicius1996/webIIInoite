import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // List
        List<Aluno> listaDeAlunos = new ArrayList();

        // Adicionar um elemento
        var joao = new Aluno(92019345, "João Paulo");
        listaDeAlunos.add(joao);
        listaDeAlunos.add(new Aluno(82015890, "Maria Eduarda"));

        // Adicionar vários elementos
        listaDeAlunos.addAll(Arrays.asList(new Aluno(82015790, "Júlia"), new Aluno(82016790, "Alberto"),
                new Aluno(82011750, "Vanessa"), new Aluno(82015791, "Roberto")));

        // Quantos elementos
        int quantidadeDeAlunos = listaDeAlunos.size();
        // System.out.printf("Agora temos %d alunos\n",quantidadeDeAlunos);

        // Buscar um elemento
        var julia = listaDeAlunos.get(2);
        // System.out.printf("Nome: %s / RA: %d\n", julia.getNome(), julia.getRa());

        var indiceJoao = listaDeAlunos.indexOf(joao);
        var objJoao = listaDeAlunos.get(indiceJoao);
        // System.out.printf("Nome: %s / RA: %d\n", objJoao.getNome(), objJoao.getRa());

        List<Aluno> resultado = listaDeAlunos.stream().filter((obj) -> obj.getNome().equals("João Paulo"))
                .collect(Collectors.toList());

        // System.out.printf("Nome: %s / RA: %d\n", resultado.get(0).getNome(),
        // resultado.get(0).getRa());

        // Percorrer elementos da lista
        // listaDeAlunos.forEach(
        // (obj) -> System.out.printf("Nome: %s / RA: %d\n",obj.getNome(),obj.getRa())
        // );

        // System.out.println(quantidadeDeAlunos);

        // listaDeAlunos.remove(1);
        // listaDeAlunos.remove(joao);

        // quantidadeDeAlunos = listaDeAlunos.size();
        // System.out.println(quantidadeDeAlunos);

        // Set
        Set<String> listaDeProdutos = new TreeSet();
        listaDeProdutos.addAll(Arrays.asList("Trakinas Morango", "Suco Tang", "Suco Kisuco", "Suco Kisuco", "Macarrão",
                "Feijão", "Abacate"));

        // listaDeProdutos.forEach((prod) -> System.out.println(prod));

        // Map
        Map<Integer, String> listaDeProfessores = new HashMap();
        
        listaDeProfessores.put(9511, "Anderson Choren");
        listaDeProfessores.put(8900, "Leandro Silva");
        listaDeProfessores.put(3444, "Aline Zenker");

        // Pegar um elemento
        var anderson = listaDeProfessores.get(8900);

        System.out.println(anderson);

        
    }
}
