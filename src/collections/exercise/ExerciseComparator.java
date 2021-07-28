package collections.exercise;

import java.util.*;

public class ExerciseComparator {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ricardo", "Dumbo", 30));
        pessoas.add(new Pessoa("Marcelo", "Salles", 23));
        pessoas.add(new Pessoa("Larissa", "Borges", 12));
        pessoas.add(new Pessoa("Manuela", "Rita", 18));

        System.out.println("--- Ordem de Inserção ---");
        System.out.println(pessoas);

        Collections.sort(pessoas, new PessoaComparator());

        System.out.println(pessoas);

        pessoas.sort((first, second) -> first.getNome().compareTo(second.getNome()));

        System.out.println(pessoas);

        pessoas.sort(Comparator.comparingInt(Pessoa::getHashCodeName));

        System.out.println(pessoas);

        System.out.println("------");

        TreeSet<Pessoa> pessoasTreeSet = new TreeSet<>(new PessoaComparator());

        pessoasTreeSet.add(new Pessoa("Ricardo", "Dumbo", 30));
        pessoasTreeSet.add(new Pessoa("Marcelo", "Salles", 23));
        pessoasTreeSet.add(new Pessoa("Larissa", "Borges", 12));
        pessoasTreeSet.add(new Pessoa("Manuela", "Rita", 18));

        System.out.println(pessoasTreeSet);

        SortedMap<Pessoa, Integer> pessoasTreeMap = new TreeMap<>(new PessoaComparator());

        pessoasTreeMap.put(new Pessoa("Ricardo", "Dumbo", 30),1);
        pessoasTreeMap.put(new Pessoa("Marcelo", "Salles", 23),2);
        pessoasTreeMap.put(new Pessoa("Larissa", "Borges", 12),3);
        pessoasTreeMap.put(new Pessoa("Manuela", "Rita", 18),4);

        System.out.println(pessoasTreeMap);
    }
}
