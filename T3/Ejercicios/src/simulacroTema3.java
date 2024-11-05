import java.util.Scanner;

public class simulacroTema3 {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }
    static Scanner scanner= new Scanner(System.in);
    public static void ejercicio1() {

        int numero=0;
        int sumatorio = 0;
        float media=0;
        int totalNum=0, numeroCeros=0, numeroImpares = 0, numeroPares = 0;
        int opcion;

        while (numero>-1){
            System.out.println("Por favor introduce un numero");
            numero = scanner.nextInt();
            totalNum++;
            if (numero %2 == 0) {
                sumatorio+=numero;
                numeroPares++;
                media=(float)sumatorio/(float)numeroPares;
            } else if (numero%2 ==1) {
                sumatorio+=numero;
                numeroImpares++;
                media=(float)sumatorio/(float)numeroPares;
            }
            if (numero==0){
                numeroCeros++;
            }
        }
        do {
            System.out.println("1-Suma de los números pares introducidos.\n" +
                    "2-Media de los números pares introducidos con dos decimales.\n" +
                    "3-Media de los números impares introducidos con dos decimales.\n" +
                    "4-Cuántos números hemos introducido.\n" +
                    "5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares\n" +
                    "y cuantos impares.\n" +
                    "6.-Salir.");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La suma de los numeros pares introducidos es: "+sumatorio);
                    break;
                case 2:
                    System.out.printf("La media de los números pares introducidos con dos decimales: %.2f",media);
                    break;
                case 3:
                    System.out.printf("La suma de los numeros impares introducidos es: %.2f",media);
                    break;
                case 4:
                    System.out.println("Cuantos numeros hemos introducido"+totalNum);
                    break;
                case 5:
                    System.out.printf("Cuantos números de los introducidos han sido ceros: %d." +
                            " Cuántos han sido pares\n %d" +
                            "y cuantos impares %d",numeroCeros,numeroPares,numeroImpares);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No esta entre el rango de numeros");
            }
        }while (numero!=6);
    }
    public static void ejercicio2() {
        int notas=20;
        int sumatorio=0;
        int suspenso=0;
        System.out.println("Introduce una nota");
        int nota=scanner.nextInt();
        for (int i = 0; i <=notas ; i++) {
            System.out.println(i+" Introduce una nota");
            nota=scanner.nextInt();
            sumatorio+=nota;
            if (nota<5 && nota>0){
                suspenso++;
            }
        }
        System.out.printf("Los numeros de suspensos son %d y la media de las notas es %d",suspenso,sumatorio);
    }
    public static void ejercicio3() {
    
    }
    public static void ejercicio4() {
        System.out.println("Introduce una palabra sin acentos");
        String palabra=scanner.next();
        String mayus;
        String minus;
        String acentos;
        if (palabra.length()<4) {
            mayus=palabra.toUpperCase();
            System.out.println(mayus);
        } else if (palabra.length()<8) {
            minus=palabra.toLowerCase();
            System.out.println(minus);
        } else if (palabra.length()<11) {
            acentos=palabra.replaceAll("a","á")
                            .replaceAll("e","é")
                            .replaceAll("u","ú")
                            .replaceAll("i","í")
                            .replaceAll("ó","ó");
            System.out.println(acentos);
        }else {
            for (int i = palabra.length()-1; i >=0; i--) {
                System.out.print(palabra.charAt(i)+" ");
            }
        }
    }

}
