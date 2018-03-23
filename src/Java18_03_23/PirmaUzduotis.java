package Java18_03_23;

import java.util.ArrayList;

public class PirmaUzduotis {
    public static void main(String[] args) {
        ArrayList<String> vardai = new ArrayList<>();
        vardai.add("Martynas");
        vardai.add("Jovita");
        vardai.add("Lukas");
        vardai.add("Sigute");
        vardai.add("Dobilas");
        for (String vardas : vardai){
            if (vardas.length()> 6){
                System.out.println(vardas);
            }
        }
    }
}
