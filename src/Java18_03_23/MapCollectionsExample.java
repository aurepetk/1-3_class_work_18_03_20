package Java18_03_23;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionsExample {
    public static void main(String[] args) {
        Map<Integer, String> mapExample = new HashMap<>();

        mapExample.put(12, "Jonas");
        mapExample.put(3, "Jonas");
        mapExample.put(4, "Antanas");
        mapExample.put(5, "Tomas");
        mapExample.put(6, "Tomas");

        for (Integer m : mapExample.keySet()){
            System.out.println("key: " + m + " value: " +mapExample.get(m));
        }
    }
}
