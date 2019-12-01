package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> kidsNames = new ArrayList<>();
        ppl.stream()
                .filter(person -> person.getAge() < 18)
                .forEach(person -> kidsNames.add(person.getName()));
        return kidsNames;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> users = new ArrayList<>();
        people.stream()
                .forEach(person -> users.add(new User(person.getName(), person.getAge(),
                        person.getName() + "_" + person.getAge())));
        return users;
    }
}
