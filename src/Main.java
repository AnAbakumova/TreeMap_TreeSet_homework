import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Laumen Palmer", 32));
        people.add(new Person("Erick", "Maerson", 30));
        people.add(new Person("Kit", "Tshelokov", 27));
        people.add(new Person("Ann", "Brain Jane Kravs", 25));
        people.add(new Person("Lein", "Sky", 16));
        people.add(new Person("James", "Brucks", 17));

        people.removeIf((person) -> person.getAge() < 18);
        System.out.println(people);
    }
}