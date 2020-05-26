package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final Animal kubisz = new Animal("Kubisz", 4);
        final Animal jackie = new Animal("Jackie", 0);
        final Animal loki = new Animal("Loki", 2);

        List<Animal> animals = new ArrayList<>();
        animals.add(kubisz);
        animals.add(jackie);
        animals.add(loki);

        System.out.println(animals);

        animals.add(0, loki);

        System.out.println(animals);

        animals.remove(new Animal("Loki", 2));

        System.out.println(animals);
        System.out.println(animals.size());
        final Animal animal = animals.get(0);
        System.out.println(animal);
        animals.removeAll(List.of(kubisz, jackie));
        System.out.println(animals);

        animals.add(kubisz);
        animals.add(jackie);

        System.out.println(animals);
        animals.sort(Comparator.comparingInt(Animal::getAge).reversed());

        System.out.println(animals);

        System.out.println(animals.isEmpty());
        System.out.println(new ArrayList<>().isEmpty());

        final int index = animals.indexOf(loki);
        System.out.println(index);

        final boolean remove = animals.remove(new Animal("xD", 1));
        System.out.println(remove);
    }
}
