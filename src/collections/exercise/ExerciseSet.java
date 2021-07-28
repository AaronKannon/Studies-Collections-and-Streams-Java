package collections.exercise;

import java.util.*;

public class ExerciseSet {
    public static void main(String[] args) {
        // HashSet
        System.out.println("HashSet");
        Set<Integer> numerosHashSet = new HashSet<>();

        numerosHashSet.add(3);
        numerosHashSet.add(88);
        numerosHashSet.add(20);
        numerosHashSet.add(44);
        numerosHashSet.add(3);

        Iterator<Integer> iterator = numerosHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numerosHashSet.add(23);

        System.out.println(numerosHashSet.size());

        System.out.println(numerosHashSet.isEmpty());

        // LinkedHashSet
        System.out.println("LinkedHashSet");
        LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>();

        numerosLinkedHashSet.add(3);
        numerosLinkedHashSet.add(88);
        numerosLinkedHashSet.add(20);
        numerosLinkedHashSet.add(44);
        numerosLinkedHashSet.add(3);

        iterator = numerosLinkedHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numerosLinkedHashSet.add(23);

        System.out.println(numerosLinkedHashSet.size());

        System.out.println(numerosLinkedHashSet.isEmpty());
        // TreeSet
        System.out.println("TreeSet");
        TreeSet<Integer> numerosTreeSet = new TreeSet<>();

        numerosTreeSet.add(3);
        numerosTreeSet.add(88);
        numerosTreeSet.add(20);
        numerosTreeSet.add(44);
        numerosTreeSet.add(3);

        iterator = numerosTreeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numerosTreeSet.add(23);

        System.out.println(numerosTreeSet.size());

        System.out.println(numerosTreeSet.isEmpty());
    }
}
