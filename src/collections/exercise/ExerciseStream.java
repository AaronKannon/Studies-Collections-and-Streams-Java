package collections.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseStream {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ricardo", "Dumbo", 30));
        pessoas.add(new Pessoa("Marcelo", "Salles", 23));
        pessoas.add(new Pessoa("Larissa", "Borges", 12));
        pessoas.add(new Pessoa("Manuela", "Rita", 18));
        pessoas.add(new Pessoa("bola", "Chiesa", 99));

        System.out.println("Retorna uma nova coleção com a quantidade de letras: "
                +  pessoas.stream().map(pessoa -> pessoa.getNome().concat(" ").concat(pessoa.getSobrenome()).concat(" - ").concat(String.valueOf(pessoa.getIdade())))
                .collect(Collectors.toList()));

        System.out.println("Contagem: " + pessoas.stream().count());

        System.out.println("Maiores de 18: " + pessoas.stream().peek(System.out::println)
                .filter((pessoa) -> pessoa.getIdade() >= 18)
                .collect(Collectors.toList()));

        System.out.println("Retorna os elementos: " + pessoas.stream().peek(System.out::println).collect(Collectors.toList()));
        //System.out.println("Cada elemento: " + pessoas.stream().peek((nome) -> System.out.println(nome.getNome())).peek((sobrenome) -> System.out.println(sobrenome.getSobrenome())).collect(Collectors.toList()));

        System.out.println("Tem letra B? " + pessoas.stream().anyMatch((pessoa) -> pessoa.getNome().contains("b")));

        System.out.println("Há algum com D? " + pessoas.stream().noneMatch((pessoa) -> pessoa.getNome().contains("d")));

        System.out.println("Pessoa mais velha: " + pessoas.stream().max(Comparator.comparingInt((pessoa) -> pessoa.getIdade())));
        System.out.println("Pessoa mais nova: " + pessoas.stream().min(Comparator.comparingInt((pessoa) -> pessoa.getIdade())));
    }
}
