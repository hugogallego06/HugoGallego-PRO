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
        ejercicio10();
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
        if (base == 00) {
            System.out.println("Error numero es 00");
        } else if (exponente == 0) {
            exponente=1;
            System.out.printf("Tu exponente era 0 por lo que pasa a ser %d\n",exponente);
        }else {
            for (int i = 0; i <exponente ; i++) {
                total*=base;
            }
        }
        System.out.println(base+" ^ "+exponente+" = "+total);
    }
    public static void ejercicio6(){
        //Mostrar todos los números pares comprendidos entre dos dados.
        int numeroTotal=13;
        int numero=1;
        System.out.println("Numero pares entre "+numero+" y "+numeroTotal+" : " );
        for (int i = numero; i < numeroTotal; i++) {
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
        for (int i = 1; i < dado+1; i++) {
            System.out.println("Es la "+i+" vez que lanzas el dado y tu num es: "+(int)(Math.random()*6+1));
        }
    }
    public static void ejercicio8() {
        //Pedir 10 números.
        int numeros=0;
        int acumulador = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduce " + i + " numero:");
            numeros = scanner.nextInt();
            acumulador += numeros;
        }
        //Mostrar la media de los números positivos, la media de los números negativos y
        if (numeros < 0) {
            System.out.println("La media de los numeros negativos introducidos es " + acumulador / 2);
        } else {
            System.out.println("La media de los numeros positivos introducidos es " + acumulador / 2);
        }
        //La cantidad de ceros



    }
    public static void ejercicio9() {
        //Pedir 10 sueldos. Mostrar su suma, media
        int sumatorio=0;
        int sueldo=0;
        int contadorMayores=0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Tu "+i+" sueldo es: ");
            sueldo=scanner.nextInt();
            sumatorio+=sueldo;
            if (sueldo > 1000) {
                contadorMayores++;
            }
        }
        System.out.println("La suma total de sueldos es de : "+sumatorio);
        System.out.println("La media total de sueldos es de : "+sumatorio/2);
        System.out.println("Sueldos mayores de 1000: "+contadorMayores);
        //cuantos hay mayores de 1000€.

    }
    public static void ejercicio10() {
        //Pedir 6 notas escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
        int aprobado = 0;
        int condicionado = 0;
        int suspenso = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Tu nota " + i + " es: ");
            int notas = scanner.nextInt();
            if (notas > 4) {
                aprobado++;
            } else if (notas == 4) {
                condicionado++;
            } else {
                suspenso++;
            }

        }
        System.out.println("Aprobados "+aprobado);
        System.out.println("Condicionados "+condicionado);
        System.out.println("Suspensos "+suspenso);
    }
}

