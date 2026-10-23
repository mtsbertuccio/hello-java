package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String name = "Matias";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.

        int age = 24;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.

        double height = 1.82;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean iLikeProgramming = true;
        System.out.println(iLikeProgramming);

        // 5. Declara una constante con tu email.

        final String EMAIL = "mtsbertuccio@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char initial = 'M';
        System.out.println(initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String city = "Buenos Aires";
        city = "CABA";
        System.out.println(city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println(((Object) a).getClass().getSimpleName());
        System.out.println(((Object) b).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        String greeting;
        greeting = "Hola";
        System.out.println(greeting);
    }
}
