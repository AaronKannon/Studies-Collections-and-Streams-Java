package collections.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ExerciseQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println("Nomes dos membros:");
        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("Primeiro nome sem retirar:");
        System.out.println(nomes.peek());
        System.out.println("Primeiro nome retirando:");
        System.out.println(nomes.poll());

        nomes.add("Daniel");

        System.out.println("Checando a posição do Daniel:");
        System.out.println(nomes);

        System.out.println("Numeros de nomes adicionados:");
        System.out.println(nomes.size());

        System.out.println("Ver se a lista esta limpa:");
        System.out.println(nomes.isEmpty());

        System.out.println("Sem tem o nome Carlos:");
        System.out.println(nomes.contains("Carlos"));
    }
}
