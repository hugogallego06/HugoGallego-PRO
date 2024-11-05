import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        //a
        int numero =(int)(Math.random()*9999)+1000;
        //b
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce las unidades de un numero (entre 1000 y 9999): ");
        int unidades=scanner.nextInt();

        System.out.println("Introduce las decenas de un numero (entre 1000 y 9999): ");
        int decenas=scanner.nextInt();

        System.out.println("Introduce las centenas de un numero (entre 1000 y 9999): ");
        int centenas=scanner.nextInt();

        System.out.println("Introduce los millares de un numero (entre 1000 y 9999): ");
        int millares=scanner.nextInt();

        System.out.printf("Tu numero es: %d%d%d%d\n",unidades,decenas,centenas,millares);
        System.out.println("Y el numero de la loteria es "+numero);
        //c
        boolean comparador=unidades==numero;
        System.out.println(comparador);
        System.out.println(numero);
    }
}
