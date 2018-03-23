package Java18_03_23;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;

    //alt+Insert - ismeta lauka ka sugeneruot - spaudi konstruktori ir pazymi viska ka nori
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    //spaudi bet kur desini - Generate - equals... ir automatiskai sugeneruoja metodus paimt vardams, pavardems;
    //Siti abu Override nespausdins vienodu reiksmiu, tik viena, nes sulygin ir gauna viena reiksme
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int compareTo (Person o){
        return name.compareTo(o.getName());
    }
}
