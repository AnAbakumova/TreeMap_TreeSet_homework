import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Laumen Palmer", 32));
        people.add(new Person("Erick", "Maerson", 30));
        people.add(new Person("Kit", "Tshelokov", 27));
        people.add(new Person("Ann", "Brain Jane Kravs", 25));
        Collections.sort(people, new PersonComparator(2));
        System.out.println(people);
    }
}