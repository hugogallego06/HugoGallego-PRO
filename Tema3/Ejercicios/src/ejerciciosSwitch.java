import java.util.Scanner;

public class ejerciciosSwitch {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        ejercicio10();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;

        }
    }

    public static void ejercicio2() {
        System.out.println("Escribe un caracter");
        char letra = scanner.next().charAt(0);
        switch (letra) {
            case 'A' | 'E' | 'I' | 'O' | 'U':
            default:
                System.out.println("Es una consonante");
        }
    }

    public static void ejercicio3() {
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        int resto = numero % 2;
        switch (resto) {
            case 0:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
                break;
        }

    }

    public static void ejercicio4() {
        System.out.println("Introduce un numero del 1 al 12 y te dire el mes con dias que tiene: ");
        int mes = scanner.nextInt();
        switch (mes) {
            case 1 | 4 | 6:
            case 8 | 10 | 12:
                System.out.println("Tiene 31 dias");
                break;
            case 2:
                System.out.println("Tiene 28 dias");
                break;
            default:
                System.out.println("Tiene 30 dias");
        }

    }

    public static void ejercicio6() {
        System.out.println("Introduce un numero del 1 al 4");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("La opcion que ha introducido es la opcion 1, es decir que su numero es un 1.");
                break;
            case 2:
                System.out.println("La opcion que ha introducido es la opcion 2, es decir que su numero es un 2.");
                break;
            case 3:
                System.out.println("La opcion que ha introducido es la opcion 3, es decir que su numero es un 3.");
                break;
            case 4:
                System.out.println("La opcion que ha introducido es la opcion 4, es decir que su numero es un 4.");
                break;
        }
    }

    public static void ejercicio7() {
        System.out.println("Introduce un numero del 1 al 5");
        int numero1 = scanner.nextInt();
        switch (numero1) {
            case 0, 1, 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Aprobado");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Introduce un numero del 1 al 5 aunque seguro que has sacado un 0.");
        }
    }

    public static void ejercicio8() {
        System.out.println("Introduce una operacion matematica (+,-,*,/)");
        char operacion = scanner.next().charAt(0);
        System.out.println("Introduce un numero");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce otro numero");
        int numero2 = scanner.nextInt();
        int total = 0;
        switch (operacion) {
            case '+':
                total = numero1 + numero2;
                break;
            case '-':
                total = numero1 - numero2;
                break;
            case '*':
                total = numero1 * numero2;
                break;
            case '/':
                total = numero1 / numero2;
                break;
        }
        System.out.println("El resultado es " + total);
    }

    public static void ejercicio9() {
        System.out.println("Introduce un numero del 1 al 12 :");
        int n1 = scanner.nextInt();
        switch (n1) {
            case 1, 2, 3:
                System.out.println("Invierno");
                break;
            case 4, 5, 6:
                System.out.println("Primavera");
                break;
            case 7, 8, 9:
                System.out.println("Verano");
                break;
            case 10, 11, 12:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Introduce un numero dentro del rango");

        }
    }

    public static void ejercicio10() {
        System.out.println("Introduce el código del producto");
        String n1 = scanner.next();
        switch (n1) {
            case "1":
                System.out.printf("Su codigo introducido es %s y su precio es %.2f\n ", n1, Math.random() * 10 + 4);
                System.out.println("Felicidades ganaste unos cascos bluetooth");
                break;
            case "2":
                System.out.printf("Su codigo introducido es %s y su precio es %.2f\n ", n1, Math.random() * 300 + 300);
                System.out.println("Felicidades ganaste una Play 5");
                break;
            case "3":
                System.out.printf("Su codigo introducido es %s y su precio es %.2f\n ", n1, Math.random() * 500 + 100);
                System.out.println("Felicidades ganaste una Play 4 con juegos");
                break;

            case "4":
                System.out.printf("Su codigo introducido es %s y su precio es %.2f\n ", n1, Math.random() * 800 + 500);
                System.out.println("Felicidades ganaste un ordandor portatil");
                break;

        }
    }
}
