package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.sql.Array;
import java.util.*;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        /*
        var array = new String[5];
        System.out.println(array.length);
        */

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        /*
        System.out.println(array[0]);
        array[0] = "Array";
        System.out.println(array[0]);
        */

        // 3. Crea un ArrayList vacío.

        // var countries = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        /*
        countries.add("Argentina");
        countries.add("España");
        countries.add("México");
        countries.add("Brasil");
        System.out.println(countries);
        countries.removeLast();

        System.out.println(countries);
        */

        // 5. Crea un HashSet con 2 valores diferentes.

        /*
        var colors = new HashSet<String>();

        colors.add("Azul");
        colors.add("Rojo");

        System.out.println(colors);
        */

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        /*
        colors.add("Azul");
        colors.add("Violeta");

        System.out.println(colors);
        */

        // 7. Elimina uno de los elementos del HashSet.

        /*
        colors.remove("Violeta");
        System.out.println(colors);
        */

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        /*
        var contacts = new HashMap<String, String>();

        contacts.put("Teresa", "123-456");
        contacts.put("Marina", "789-123");
        contacts.put("Tiziano", "456-789");

        System.out.println(contacts);
        */

        // 9. Modifica uno de los contactos y elimina otro.

        /*
        contacts.replace("Teresa", "654-321");
        contacts.remove("Tiziano");

        System.out.println(contacts);
        */

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        /*
        String[] cities = {"Buenos Aires", "Río de Janeiro", "Bogotá", "Lima"};

        var citiesList = new ArrayList<String>(List.of(cities));
        var citiesHashSet = new HashSet<String>(citiesList);
        var citiesHashMap = new HashMap<String, String>();

        for (String city : citiesHashSet) {
            citiesHashMap.put(city, city);
        }

        System.out.println(citiesHashMap);
        */
    }
}
