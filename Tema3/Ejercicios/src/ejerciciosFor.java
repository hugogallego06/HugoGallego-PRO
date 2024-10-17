import java.util.Scanner;

public class ejerciciosFor {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejemplosPalabras();
        //ejercicio13();
        //ejercicio14();
        ejercicio15();
    }
    public static Scanner scanner=new Scanner(System.in);
    public static void ejercicio1(){
        System.out.println("Cuantas temperaturas quieres introducir: ");
        int nTemperaturas=scanner.nextInt();
        int temperatura=0;

        //acumulador
        int sumatorio=0;

        if (nTemperaturas<=0){
            nTemperaturas=10;
        }
        for (int i=0; i<nTemperaturas; i++){
            System.out.println("Introduce la temperatura: ");
            temperatura =scanner.nextInt();
            sumatorio += temperatura;
        }
        System.out.println("La media es "+(float)sumatorio/2);
    }
    public static void ejercicio3(){
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 0; j < 11; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }

    }
    public static void ejercicio4(){
        System.out.println("Dime cual es el numero inicial: ");
        int numeroInicial=scanner.nextInt();
        System.out.println("Dime cual es el numero final: ");
        int numeroFinal=scanner.nextInt();

        if (numeroInicial>=numeroFinal){
            System.out.println("No se puede proceder a la ejecución");
        }else {
            for (int i = numeroInicial; i < numeroFinal; i++) {
                System.out.println("Tabla de multiplicar del " + i);
                for (int j = 0; j < 11; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        }
    }
    public static void ejercicio5(){
        System.out.println("Introduce un numero de 0 al 5, este será tu base: ");
        int base=scanner.nextInt();
        System.out.println("Introduce un numero de 0 al 5, este será tu exponente: ");
        int exponente=scanner.nextInt();
        int total=1;
        if (base == 0) {
            System.out.println("No se calculan potencias en base 0");
        } else if (exponente == 0) {
            System.out.println("El resultado de la potencia es 1");
        }else {
            for (int i = 0; i <exponente ; i++) {
                total*=base;
            }
            System.out.println(base+" ^ "+exponente+" = "+total);
        }
    }
    public static void ejercicio6(){
        //Mostrar todos los números pares comprendidos entre dos dados.
        System.out.println("Di desde que numero quieres calcular ");
        int numeroInicial=scanner.nextInt();
        System.out.println("Di hasta que numero quieres calcular " );
        int numeroFinal=scanner.nextInt();
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i%2 ==0) {
                System.out.println("Tu numero es "+i +" y es par");
            }
        }
    }
    public static void ejercicio7(){
        //Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100).
        System.out.println("¿Cuantas veces quieres lanzar el dado?");
        int dado=scanner.nextInt();
        if (dado < 1) {
            dado=100;
            System.out.println("El numero introducido no era positivo por lo que tu numero ahora es "+dado);
        }
        for (int i = 1; i <= dado; i++) {
            System.out.println("Es la "+i+" vez que lanzas el dado y tu num es: "+(int)((Math.random()*6)+1));
        }
    }
    public static void ejercicio8() {
        //Pedir 10 números.
        int acumuladorPositivos=0, acumuladorNegativos=0, numeroCeros=0, numerosPositivos=0, numerosNegativos=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce " + i + " numero:");
            int numeros = scanner.nextInt();
            if (numeros < 0) {
                acumuladorNegativos+=numeros;
                numerosNegativos++;
            } else if (numeros>0){
                acumuladorPositivos+=numeros;
                numerosPositivos++;
            }else {
                numeroCeros++;
            }
        }
        //Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros
        System.out.println("La media de positivos es : "+(float)(acumuladorPositivos/numerosPositivos));
        System.out.println("La media de negativos es : "+(float)(acumuladorNegativos/numerosNegativos));
        System.out.println("El numero de ceros es : "+numeroCeros);


    }
    public static void ejercicio9() {
        //Pedir 10 sueldos. Mostrar su suma, media
        int sumatorio=0, contadorMayores=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tu "+i+" sueldo es: ");
            int sueldo=scanner.nextInt();
            sumatorio+=sueldo;
            if (sueldo > 1000) {
                contadorMayores++;
            }
        }
        System.out.println("La suma total de sueldos es de : "+sumatorio);
        System.out.println("La media total de sueldos es de : "+(float)(sumatorio/10));
        System.out.println("Sueldos mayores de 1000: "+contadorMayores);
        //cuantos hay mayores de 1000€.

    }
    public static void ejercicio10() {
        //Pedir 6 notas escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
        int aprobado = 0, condicionado = 0,suspenso = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce una nota :");
            int notas = scanner.nextInt();
            if (notas>= 0 && notas<=10) {
                if (notas > 4) {
                    aprobado++;
                } else if (notas == 4) {
                    condicionado++;
                } else {
                    suspenso++;
                }
            }else {
                System.out.println("Nota invalida");
            }
        }
        System.out.println("Aprobados "+aprobado);
        System.out.println("Condicionados "+condicionado);
        System.out.println("Suspensos "+suspenso);
    }
    public static void ejercicio11() {
        System.out.println("Lados cuadrado :");
        int lados=scanner.nextInt();
        for (int i = 0; i < lados ; i++) {
            //System.out.println("\t+\t");
            for (int j = 0; j < lados ; j++) {
                //Primera fila o ultima
                if (i ==0 || i == lados - 1){
                    System.out.print("\t+\t");
                }
                //Primera columna o ultima
                else if (j == 0 || j == lados - 1) {
                    System.out.println("\t+\t");
                }else {
                    System.out.println("\tº\t");
                }
            }
            System.out.println();
        }
    }
    public static void ejemplosPalabras() {

        String palabra1 = "Hola que tal";
        String palabra2 = "Hola que tal";
        //replace reemplazar espacios entre textos
        palabra2 = palabra2.replaceAll(" ", "");

        //Son iguales equals
        //boolean iguales = palabra1.equals(palabra2);
        //boolean igualesCAP = palabra1.equalsIgnoreCase(palabra2);
        //Pasar a mayusculas o a minusculas
        //palabra1 = palabra1.toUpperCase();
        //System.out.println(palabra1);
        //palabra2 = palabra2.toLowerCase();
        //System.out.println(palabra2);
        //contiene
        //boolean contiene= palabra1.contains("que");
        //cuantas letras hay
        //palabra1.length();
        //sacar letra de una palabra
        //palabra1.charAt(0);
        //sacar todas las letra de una palabra
        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra2.charAt(i);
            System.out.println(letra);
        }
    }
    public static void ejercicio13() {
        //palabra inversa
        System.out.println("Escribe una palabra: ");
        String palabra = scanner.next();
            for (int i =palabra.length()-1; i >=0 ; i--) {
                System.out.println(palabra.charAt(i));
            }
        }
    public static void ejercicio14() {
        System.out.println("Dime de que palabra quieres comprobar si es palindromo");
        // String palabra = scanner.next();
        String palabra = "Ejecúción";
        // NO SE TIENEN EN CUENTA MAYUSCULAS NI ACENTOS
        palabra = palabra.toLowerCase().replaceAll("ó", "o")
                .replaceAll("á", "a")
                .replaceAll("í", "i")
                .replaceAll("ú", "u")
                .replaceAll("é", "e");
        String palabraInversa = "";

        for (int i = palabra.length()-1; i >=0 ; i--) {
            palabraInversa+=palabra.charAt(i);
        }

        if (palabra.equals(palabraInversa)){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        //EJEMPLOS PALINDROMOS CORTO (USAR)
        //for (int i = 0; i <palabra.length()/2 ; i++) {
        //    palabra=palabra.charAt(i); }
    }
    public static void ejercicio15() {
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        String Oraciones="";
        Oraciones=frase
        int contadorOraciones=0;

        System.out.printf("Tiene %d oraciones",contadorOraciones);

        int totalLetras=frase.length();
        System.out.println("Total letras: "+totalLetras);

        }
    }



