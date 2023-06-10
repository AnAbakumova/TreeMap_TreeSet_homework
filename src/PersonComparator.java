import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected String[] wordsPerson1, wordsPerson2;
    protected int resultOfCompareSurname, count;

    //У кого больше слов в фамилии, тот более знатен. При одинаковом количестве - знатен больше тот, кто старше.
    //Если количество слов в обеих фамилиях >= числа, указанного в конструкторе,
    // то обе фамилии равнозначны и по ним нельзя определить знатность. Нужно продолжать сравнение уже по возрасту.
    public PersonComparator(int count) {
        this.count = count;
    }

    @Override
    public int compare(Person o1, Person o2) {
        wordsPerson1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        wordsPerson2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (wordsPerson1.length >= count && wordsPerson2.length >= count) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            resultOfCompareSurname = Integer.compare(wordsPerson1.length, wordsPerson2.length);
            if (resultOfCompareSurname == 0) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return resultOfCompareSurname;
            }
        }
    }
}
