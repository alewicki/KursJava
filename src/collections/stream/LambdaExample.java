package collections.stream;

import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        final List<String> names = List.of("Marcin", "Adam", "Kasia");

        names.forEach(new MyConsumer());

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " + s);
            }
        });

        names.forEach(name -> System.out.println("Hello " + name));


        System.out.println(modify("Alek", new StringModifier() {
            @Override
            public String modify(String s) {
                return s + "!";
            }
        }));

        System.out.println(modify("Alek", name -> name + "!!"));  /// return name + "!!"

        System.out.println(modify("Alek", name -> {
            System.out.println(name);
            return name + "!!!";
        }));
    }

    public static String modify(String s, StringModifier modifier) {
        return modifier.modify(s);
    }
}
