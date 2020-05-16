package lekcja8;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Paweł", "Nowak", "pawcio@buziaczek.pl");
        Car car = new Car("Audi", "A8", client);
        client.setCar(car);
//        System.out.println(car);

        Dog dog1 = new Dog("Kubisz", 4);
        Dog dog2 = new Dog("Jackie", 0);
        Dog dog3 = new Dog("Jackie", 0);
        Dog dog4 = new Dog("Jackie", 0);

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog3.hashCode());

    }
}
