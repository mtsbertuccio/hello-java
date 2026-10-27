package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        /*
        int userAge = 24;

        if (userAge >= 18) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }
        */

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        /*
        int numberA = 2;
        int numberB = 4;

        if (numberA == numberB) {
            System.out.println("Son iguales.");
        } else if (numberA > numberB) {
            System.out.println("A > B");
        } else if (numberB > numberA) {
            System.out.println("B > A");
        }
        */

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        /*
        int randomNumber = 76;

        if (randomNumber > 0) {
            System.out.println("Positivo.");
        } else if (randomNumber < 0) {
            System.out.println("Negativo.");
        } else if (randomNumber == 0) {
            System.out.println("Cero.");
        }
        */

        // 4. Crea un programa que diga si un número es par o impar.

        /*
        int randomNumber = 10;

        if (randomNumber % 2 == 0) {
            System.out.println("Par.");
        } else if (randomNumber % 2 != 0) {
            System.out.println("Impar.");
        }
        */

        // 5. Verifica si un número está en el rango de 1 a 100.

        /*
        int randomNumber = 50;

        if (randomNumber >= 1 && randomNumber <= 100) {
            System.out.println("El número está entre 1 y 100.");
        } else {
            System.out.println("El número no está entre 1 y 100.");
        }
        */

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        /*
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El número no coincide con ningún día de la semana.");
        }
        */

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        /*
        int grade = 75;

        if (grade >= 0 && grade <= 59) {
            System.out.println("Suspenso");
        } else if (grade >= 60 && grade <= 89) {
            System.out.println("Aprobado");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("Sobresaliente");
        }
        */

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        /*
        int userAge = 24;
        boolean accompanied = false;

        if (userAge >= 15 || accompanied == true) {
            System.out.println("Puede ingresar al cine.");
        } else {
            System.out.println("No puede ingresar al cine.");
        }
        */

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        /*
        char letter = 'A';
        String vowels = "AEIOU";

        if (vowels.contains(String.valueOf(letter))) {
            System.out.println("Vocal.");
        } else {
            System.out.println("Consonante.");
        }
        */

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        /*
        int a = 1;
        int b = 2;
        int c = 3;

        if (a > b && a > c) {
            System.out.println("El mayor es A.");
        } else if (b > a && b > c) {
            System.out.println("El mayor es B.");
        } else if (c > a && c > b) {
            System.out.println("El mayor es C.");
        } else {
            System.out.println("Son iguales.");
        }
        */
    }
}
