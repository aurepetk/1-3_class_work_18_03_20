package Java18_03_23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FIrstTask {
    public static void main(String[] args) {
        //kaip sukuriamas listas:
        ArrayList<String> names = new ArrayList<>();
        //sis yra smulkesnis ArrayList klases elementas, jis prieina ne prie visu galimybiu, prie siauresniu (apacioj)
        //Destytojas patartu naudot List, jis paprasciausias;
        List<Integer> numbers = new ArrayList<>();

        names.add("Andrius");
        names.add("Petras");
        names.add("Jonukas");
        names.add("Gintaras");
        names.add(2, "Jonas_2");


        //eis per visus vardus ir vykdys komanda
        for (String name : names) {
            System.out.println(name);
        }

        //kokio dydzio
        System.out.println(names.size());
        //ar yra tuscias
        System.out.println(names.isEmpty());
        //paima antra varianta
        System.out.println(names.get(1));

        numbers.add(12);
        numbers.add(11);
        numbers.add(3);
        numbers.add(5);

        //isrusiuos nuo maziausio iki didziausio;
        Collections.sort(numbers);
        //isrusiuos atvirkstine tvarka;
        Collections.reverse(numbers);
        //sis metodas naudojamas tik jei reikia atspausdinti ir atspausdins visus elementus;
        numbers.forEach(System.out :: println);
        //su kiekvienu nariu darys koki veiksma koki pasirinksi (po tasko gali rinktis ka nori, ismeta sarasa;
        numbers.stream().toString();

        //nurodom reiksme ir rodyklele rodo ka toliau reik su ta reiksme daryt; paima item pagal index;
        names.forEach(a -> System.out.println("index " + names.indexOf(a) + " reiksmes " + a));

    }
}
