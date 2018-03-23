package Java18_03_23;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondTaskWithSet {
    public static void main(String[] args) {
        Set<Integer> names = new TreeSet<>();
        names.add(2);
        names.add(15);
        names.add(64);
        names.add(1005);
        names.add(15);
        names.add(64);

        names.forEach(System.out :: println);

        Set<Person> persons = new TreeSet<>();
        //ims info is tos kitos susikurtos public Person klases, saugos daug info apie daug zmoniu;
        persons.add(new Person("Andrius", "Baltrunas"));
        Person p = new Person("Tomas", "Jonaitis");
        persons.add(p);
        persons.add(new Person("Kamile", "Survilaite"));
        //atspausdinimui:
        persons.forEach(pp -> {
            System.out.println("Vardas " + pp.getName() + " pavarde " + pp.getSurname());
        });
    }
}
