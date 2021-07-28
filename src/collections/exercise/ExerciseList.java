package collections.exercise;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ExerciseList {
    public static void main(String[] args) {
        List<String> names = new Vector<>();

        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        names.set(2,"Roberto");

        System.out.println(names.get(1));

        names.remove(4);
        names.remove("João");

        System.out.println("Length of the List: "+names.size());

        System.out.println(names.contains("Juliano"));

        List<String> namesToAdd = new Vector<>();

        namesToAdd.add("Ismael");
        namesToAdd.add("Rodrigo");

        names.addAll(namesToAdd);

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        System.out.println(names.isEmpty());
    }
}
