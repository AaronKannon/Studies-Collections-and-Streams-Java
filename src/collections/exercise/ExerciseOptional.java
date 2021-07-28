package collections.exercise;

import java.util.Optional;

public class ExerciseOptional {
    public static void main(String[] args) {
        //Optional<Integer> optional= Optional.of(10);
        Optional<Integer> optional= Optional.ofNullable(10);

        if (optional.isPresent()) {
            optional.filter(num -> num % 2 == 0);
            Integer saida = optional.get();
            System.out.println(saida);
        } else if (optional.isEmpty()) {
            System.out.println("Optional vazio");
        }

        System.out.println(optional.orElseThrow(IllegalStateException::new));

    }
}
