package Java18_03_23;

import java.util.*;

public class AntraUzduotis {
    public static void main(String[] args) {
        List<String> vardai = new ArrayList<String>();
        vardai.add("Kamile");
        vardai.add("Kostantinas");
        vardai.add("Salomeja");
        vardai.add("Gedutis");
        vardai.add("Augustinas");
        System.out.println("Pirmas elementas yra " + pirmasElementas(vardai));
        System.out.println("Paskutinis elementas yra " + paskutinisElementas(vardai));

    }

    private static String pirmasElementas (List<String> vardai){
        return vardai.get(0);
    }

    private static String paskutinisElementas (List<String>vardai){
        return vardai.get(vardai.size()-1);
    }
}
