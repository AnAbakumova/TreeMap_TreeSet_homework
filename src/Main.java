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

        Collections.sort(people, (o1, o2) -> {
            String[] wordsPerson1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] wordsPerson2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            if (wordsPerson1.length >= 2 && wordsPerson2.length >= 2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                int resultOfCompareSurname = Integer.compare(wordsPerson1.length, wordsPerson2.length);
                if (resultOfCompareSurname == 0) {
                    return Integer.compare(o1.getAge(), o2.getAge());
                } else {
                    return resultOfCompareSurname;
                }
            }
        });
        System.out.println(people);
    }
}