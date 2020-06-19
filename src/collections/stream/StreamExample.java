package collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        final List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alek", 3500, 9, Position.DEVELOPER));
        employees.add(new Employee("Tomek", 4000, 6, Position.DEVELOPER));
        employees.add(new Employee("Paweł", 2500, 7, Position.MANAGER));
        employees.add(new Employee("Agata", 8500, 10, Position.TECH_LEAD));
        employees.add(new Employee("Marcin", 2000, 8, Position.RECRUITER));

        final List<String> over3800Names = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPosition() == Position.TECH_LEAD || employee.getPosition() == Position.DEVELOPER) {
                if (employee.getSalary() > 3800) {
                    over3800Names.add(employee.getName());
                }
            }
        }

        System.out.println(over3800Names);


//        final Stream<Employee> stream = employees.stream();

        final List<String> names = employees
                .stream()
                .filter(employee -> employee.getSalary() > 3800)
//                .limit(1)   -ogranicza strumien do 1 elementu
                .filter(employee -> employee.getPosition().isIt())
                .map(employee -> employee.getName())
                .peek(s -> System.out.println("Mapped employee name: " + s))
                .collect(Collectors.toList());

        System.out.println(names);

        //List<Employee>  not in IT && evaluation >5
        List<Employee> gumisie = employees
                .stream()
                .filter(employee -> !employee.getPosition().isIt())
                .filter(employee -> employee.getEvaluation() > 5)
                .collect(Collectors.toList());


        //List<Double> salaries ( not in IT && evaluation >5)
        System.out.println(gumisie);

        List<Double> salaries = employees
                .stream()
                .filter(employee -> !employee.getPosition().isIt())
                .filter(employee -> employee.getEvaluation() > 5)
                .map(Employee::getSalary)  // method reference
                .collect(Collectors.toList());

        System.out.println(salaries);

        final Optional<Double> reduceOptional = salaries
                .stream()
//                .reduce((d1, d2) -> d1 + d2);
                .reduce(Double::sum);

        final Double totalSalary = reduceOptional.orElse(0d);
        final Double totalSalaryNotNull = reduceOptional.orElseThrow(() -> new NullPointerException());
        System.out.println(totalSalary);


        final Double maxSalary = salaries
                .stream()
                .max((o1, o2) -> (int) (o1 - o2))
                .orElse(0d);
        System.out.println(maxSalary);

        //count DEVELOPERs
        long count = employees
                .stream()
                .filter(employee -> employee.getPosition() == Position.DEVELOPER)
                .count();
        System.out.println(count);

        //max salary employee
        final Employee employee = employees
                .stream()
                .max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()))
                .get();


        System.out.println(employee);

        String[] strings = {"xd", "lol"};
        final Stream<String> stringStream = Stream.of(strings);

        final String[] filteredStrings = Arrays.stream(strings)
                .filter(s -> s.length() > 2)
                .toArray(String[]::new);

        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }


}
